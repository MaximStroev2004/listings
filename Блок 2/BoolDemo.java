// пример использования типа данных boolean
// сохраните в файл BoolDemo.java
public class BoolDemo {
    public static void main(String[]args) {
        boolean b;

        b = false;
        System.out.println("b равно" + b);
        b = true;
        System.out.println("Как вы думаете, увидите ли вы эту строку?");

        // переменная логического типа может стоять
        // в условии оператора if
        if (b) System.out.println("Как вы думаете, увидите ли вы эту строку?");

        // операторы сравнения возвращают логическое значение
        System.out.println("Выражение 10 > 9 имеет значение "
                +(10 > 9));
    } // main(String[] args)
} // BoolDemo class