package JAVA.seminar1.HomeWork.HW2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class students {
    static Scanner scanner = new Scanner(System.in);
    static File logFile = null;
    static FileWriter fileWriter = null;
    public static void main(String[] args) {
        
    boolean check = true;
    while(check){
        System.out.println("###########################################################");
        System.out.println("Структура приложения:");
        System.out.println("1 - Задание №1 - 'Запрос WHERE';");
        System.out.println("2 - Задание №2 - 'Сортировка пузырьком+логирование';");
        System.out.println("0 - Выход из приложения.");
        System.out.println("###########################################################");
        System.out.print("Ваш выбор: ");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise) {
            case 1:
                String students = ("\"name\":\"Ivanov\",\"country\":\"Russia\",\"city:Moscow\",\"age\":\"null\"");
                System.out.println("Дан запрос sql");
                System.out.println(students);
                System.out.println("Введите запрос WHERE, который исключит отображение параметра: ");
                String set = scanner.nextLine();
                System.out.printf("WHERE: %s\n",whereJSON(students, set));
                break;
            case 2:
                try{
                    logFile = new File("logBubble.txt");
                    fileWriter = new FileWriter(logFile);
                    int[] unsortArr = new int[] {12, 3, 5, 11, 23, 65, 1, 15, 78, 4, 7};
                    System.out.println("Дан несортированный массив:");
                    System.out.println(printArr(unsortArr));
                    System.out.println();
                    System.out.println("Отсортированный массив:");
                    System.out.println(printArr(sortArrBubble(unsortArr)));
                    System.out.println();
                    fileWriter.close();
                }
                catch(Exception ex){
                    System.out.println("Приложение будет закрыто");
                }
                    break;
            case 0:
                check=false;
                System.out.println("Завершение работы приложения.");
                break;
            default:
                System.out.println("Вы указали некорректный номер действия.\n Повторите попытку.");
                break;
        }
    }
    }       
    static String whereJSON (String stud, String s) {
        StringBuilder out = new StringBuilder();
        String[] tempstr = stud.split(",");
        for (int i = 0; i < tempstr.length; i++) {
            if (tempstr[i].indexOf(s)==-1){
                out.append(tempstr[i]+" ");
            }
        }
        return out.toString();
        }
    
    static int[] sortArrBubble(int[] arr){
        try{
            int temp = 0;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = arr.length-1; j>i; j--) {
                    if (arr[j-1]>arr[j]){
                        temp = arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                
                fileWriter.append(printArr(arr)+'\n');    
                fileWriter.flush();
                }
            }
        }
        catch(Exception ex){
                System.out.println("Ошибка записи файла");
        }   
    return arr;            
    }
    
    static String printArr(int[] arr){
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            SB.append("|"+arr[i]+"| ");
        }
        return SB.toString();
    }
               
    }


    
    

