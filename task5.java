import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String binaryStr = in.nextLine();
        int binaryNum = Integer.parseInt(binaryStr, 2);

        System.out.println(binaryNum);
    }
}
