
package javatasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class JavaTasks {

   
    public static void main(String[] args) {
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        //task14();
        //task15();
        //task16();
        //task17();
    }
    
  
    public static void task5(){
        try {            
            Scanner scanner = new Scanner(System.in);
       
            String binaryNumber = scanner.next();
            
            int integerNumber = Integer.parseInt(binaryNumber, 2);

            System.out.printf("%d\n", integerNumber);
           
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task6(){
		final int X = 10;
        final int Y = 50;
        final int Z = 150;
        
        int T;
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите T: ");
            T = scanner.nextInt();

            if(T == X || T == Y || T == Z){
                System.out.println("Данное значение имеется в константах");
            }
            else{
                System.out.println("Такой константы нет!");
            }
                
           
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task7(){
        for (int i = 1; i <= 50; i++){            
            System.out.println(i);
        }
    }
    
    public static void task8(){
        int arraySize;
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            arraySize = scanner.nextInt();
            
            int mass [] = new int [arraySize];
            
            System.out.println("Введите элементы массива: ");
            for(int i=0; i<arraySize; i++){
                System.out.printf("Введите %d-й массива: ", i+1);
                mass[i] = scanner.nextInt();
            }            
            for(int i:mass){
                System.out.println(i*2);
            }           
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }      
    }
    
    public static void task9(){
        int arraySize;
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер матрицы: ");
            arraySize = scanner.nextInt();
            
            int mass [][] = new int [arraySize][arraySize];
            
            System.out.println("Введите элементы матрицы: ");
            for(int i=0; i<arraySize; i++){
                for(int j=0; j<arraySize; j++){
                    System.out.printf("Введите %d-й элемент %d-й строки: ", j+1, i+1);
                    mass[i][j] = scanner.nextInt();
                }   
            }
            for(int i:mass[0]){
                System.out.println(i*3);
            }           
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }      
    }
    
    public static void task10(){
        try {            
            Scanner scanner = new Scanner(System.in);
            String scannedString = scanner.nextLine();
            System.out.println(scannedString);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task11(){
        try {            
            Scanner scanner = new Scanner(System.in);
            String scannedString = scanner.nextLine();
            
            // Заменяем все пробелы в строке пустой строкой
            // "\\s+" - регулярное выражение (шаблон) для поиска последовательности
            // 1 и более символов пробела
            // "" - строка, которой необходимо заменить каждую найденную подстроку
            // в данном случае пустая строка
            String newString = scannedString.replaceAll("\\s+", "");
            System.out.println(newString);
           
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task12(){
        try {            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Введите первую строку: ");
            String firstString = scanner.nextLine();
            int firstLength = firstString.length();
            System.out.println("Введите вторую строку: ");
            String secondString = scanner.nextLine();
            int secondLength = secondString.length();
            if(firstLength>secondLength)                
                System.out.println(firstString);
            else if(firstLength<secondLength)                
                System.out.println(secondString);
            else
                System.out.println("Строки имеют одинаковую длину");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task13(){
        try {            
            Scanner scanner = new Scanner(System.in);
            String S = scanner.next();
            int X = Integer.parseInt(S);
            double Y = Double.valueOf(X);
            System.out.printf("S = %s", S);
            System.out.printf("\nX = %d", X);
            System.out.printf("\nY = %.2f\n", Y);        
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static void task14(){
        int arraySize;
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            arraySize = scanner.nextInt();
            
            int mass [] = new int [arraySize];
            
            System.out.println("Введите элементы массива: ");
            for(int i=0; i<arraySize; i++){
                System.out.printf("Введите %d-й массива: ", i+1);
                mass[i] = scanner.nextInt();
            }            
            
      
            int buffer = 0;
            for(int i=0; i<arraySize; i++){
                for(int j=0; j<arraySize-1;j++){
                    if(mass[j]>mass[j+1]){
                        buffer = mass[j];
                        mass[j] = mass[j+1];
                        mass[j+1] = buffer;
                    }
                }
            }
            System.out.println(Arrays.toString(mass));
            
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }   
    }
    
    
    public static void task15(){
        
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();
            //String file ="src/javatasks/text.txt";

         
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine = reader.readLine();
            while (currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();
            
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }  
    }
    
 
    public static void task16(){
        
        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();
            //String file ="src/javatasks/test_text.txt";

          
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));       
            
            System.out.printf("Введите текст для записи в файл.\n"
                    + "Чтобы остановить запись, введите команду \"Stop\" (без кавычек) с новой строки:\n");
            String currentLine = scanner.nextLine();
            
            boolean firstString = true;
            
            // Записываем в файл строки, вводимые пользователем, пока он не напишет Stop
            while (!currentLine.equalsIgnoreCase("Stop")){
                if(firstString == true){
                    bw.write(currentLine);
                    firstString = false;
                }
                else{
                    bw.write("\n"+currentLine);
                }
                
                currentLine = scanner.nextLine();
            }
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }  
    }
    
    public static void task17(){

        try {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();
            //String file ="src/javatasks/test_text2.txt";

            int lineCount = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine = reader.readLine();
            while (currentLine != null){
                lineCount++;
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();
            
            
    
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));       
            
            System.out.printf("Введите текст для записи в файл. Необходимо ввести %d строк.\n"
                    + "Чтобы остановить запись, введите команду \"Stop\" (без кавычек) с новой строки:\n", lineCount);
            String inputLine = scanner.nextLine();
            
            boolean firstString = true;
            
            // Записываем в файл строки, вводимые пользователем, пока он не напишет Stop
            while (!inputLine.equalsIgnoreCase("Stop") && lineCount>0){
                if(firstString == true){
                    bw.write(currentLine);
                    firstString = false;
                }
                else{
                    bw.write("\n"+currentLine);
                }
                lineCount--;
                currentLine = scanner.nextLine();
            }
            // Если пользователь написал слово остановки раньше, чем закончилось кол-во строк
            // Дописываем строки в файл со значением счетчика
            while (lineCount>0){
                if(firstString == true){
                    bw.write(String.valueOf(lineCount));
                    firstString = false;
                }
                else{
                    bw.write("\n"+lineCount);
                }
                lineCount--;
            }
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }  
    }
}
