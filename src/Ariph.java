import java.util.Scanner;

public class Ariph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sredAref;
        int delAref;

        sredAref=(x+y+z)/3;
        System.out.println("Среднее арифметическое введеных чисел = "+sredAref);

        delAref = sredAref/2;
        if (delAref>3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
