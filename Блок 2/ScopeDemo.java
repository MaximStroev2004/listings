public class ScopeDemo {
    public static void main(String[] args) {

        int x; // переменная х видна во всем методе main()

        x = 1;
        System.out.println("До вложенного блока: x равно " + x);
        {
            // новый блок создает новую область видимости

            /* переменная y доступна только внутри текущего
             блока, но это не мешает ее использованию вместе
                с переменной х из внешнего блока
             */
            int y = 3;

            //здесь действует обе переменных, x и y
            System.out.println("Внутренний блок: x равно " + x +", y равно " + y );

            x = y * 3;
        } // конец вложенного блока

        /* если вы раскомментируете строку "y = 100", то получите
        ** ошибку компиляции: переменная y в текущем блоке не объявлена
        */
        // y = 100;

        // как видите, переменная х видна во всей программе
        System.out.println("После вложенного блока: x равно" + x);

    } // main(String[]) method

} // ScopeDemo class
