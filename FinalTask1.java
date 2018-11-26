import java.util.Scanner;

public class FinalTask1 {

    public static void main(String args[]){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i += 1)
        {
            System.out.printf("%d x %d = %d\n", i, number, i * number);
        }
    }
}