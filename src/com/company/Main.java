package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // Код не будет работать, потому что выполняется деление на 0
        // Необходимо добавить проверку в функцию devide, чтобы делитель не был равен 0
        // иначе можно выводить 0
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}

