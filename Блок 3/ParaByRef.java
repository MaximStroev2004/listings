package org.example;

 class ParaByRef {
     int x, y;

     ParaByRef(int x, int y) {
         this.x = x;
         this.y = y;
     } // конструктор ParaByRef

     // передача объекта (по ссылке)
     void  callByRef (ParaByRef o) {
         o.x = o.x + this.x; // чтенние переменныой x
         o.y = o.y + this.y; // чтенние переменныой y
     } // callByRef (ParaByRef) method

} // ParaByRef class
