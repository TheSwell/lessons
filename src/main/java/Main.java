import java.util.Scanner;

public class Main { // 1
    // 2
    int i;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean bool;


    public static void main(String[] args) {
        Main main = new Main();

        //3
        float a, b, c, d;
        a = 5f;
        b = 6f;
        c = 7f;
        d = 8f;
        System.out.println("\nЗадание: 3");
        System.out.println("answer = " + (a * (b + (c / d))));

        //4
        System.out.println("\nЗадание: 4");
        main.fromBefore(15);

        //5 & 6
        System.out.println("\nЗадание: 5");
        main.positiveOrNegative(2);
        //7
        System.out.println("\nЗадание: 7");
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Привет " + name);

        // 8
        System.out.println("\nЗадание: 8");
        main.year(1220);
    }

    public void fromBefore(int a) { //4
        int min = 10;
        int max = 20;
        boolean isTrueNum = a >= min && a <= max;
        System.out.println(isTrueNum);
    }


    public void positiveOrNegative(int i) { //5
        boolean isGreat = i > 0;

        if (isGreat) System.out.println("Число: " + i + " является положительным");
        else System.out.println("Число: " + i + " является отрицательным");

        System.out.println("\nЗадание: 6 \n" + isGreat);
    }

    public void year(int i) {
        if (i > 3) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println("Число является високосным");
            } else System.out.println("Число не является високосным");
        }
    }

}
