public class Main {
    public static void main(String[] args) {

        //2.2 Переменные Задание 6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        if (result < 0) {
            result = result * -1;
        }

        System.out.println(result);

        // Задание 7

        int a2 = 5;
        int b2 = 7;

        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;

        System.out.println("a2 = " + a2 + ", b2 = " + b2);

        // Задание 8

        int a3 = 878;
        int b3 = (a3 - ((a3 / 100) * 100)) / 10;

        System.out.println(b3);

    }
}