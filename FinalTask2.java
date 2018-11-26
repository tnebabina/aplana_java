import java.util.Scanner;

public class FinalTask2 {

    private static void printArray(double arr[], int size)
    {
        System.out.print("{");
        for (int i = 0; i < size; i += 1)
        {
            System.out.print(arr[i]);
            if (i != size - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    private static void sortArray(double arr[], int size)
    {
        int i;
        double tmp;
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            i = 0;
            while (i + 1 < size)
            {
                if (arr[i] > arr[i + 1])
                {
                    sorted = false;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                i += 1;
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел, которые будут отсортированы: ");
        int size = in.nextInt();
        double[] myArray = new double[size];
        System.out.printf("Введите %d числа(-ел) (целых или с дробной частью): ", size);
        for (int i = 0; i < size; i += 1) {
            myArray[i] = in.nextDouble();
        }
        System.out.print("Массив до сортировки: ");
        printArray(myArray, size);
        sortArray(myArray, size);
        System.out.print("Массив после сортировки: ");
        printArray(myArray, size);
    }
}