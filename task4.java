import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int result = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое введённых чисел: %d \n", result);

        if (result / 2 > 3)
        {
            System.out.print("Программа выполнена корректно");
        }
    }
}
