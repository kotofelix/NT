package Pack1;

public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c = 2;

        System.out.println("a/b = " + a / b); //т.к. int это целое число, то остаётся только "0"
        System.out.println("c/b = " + c / b); //т.к. делим double, то и получаем double и получается "0.6"
        System.out.println("a%b = " + a % b); // остаток от деления равен 2
        System.out.println("++a = " + (++a)); //префиксная форма, результатом является новое значение
        System.out.println("a++ = " + (a++)); //постфиксная форма (значение изменится после выполнения)
        System.out.println("a =" + a);        //результат работы a++
    }
}
