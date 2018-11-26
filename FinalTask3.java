import java.util.Scanner;

public class FinalTask3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара США к рублю: ");
        double currency = in.nextDouble();
        System.out.print("Введите количество рублей для перевода в доллары: ");
        double rubles = in.nextDouble();
        double result = rubles / currency;
        System.out.printf("%.2f руб. = $%.2f", rubles, result);
    }
}
