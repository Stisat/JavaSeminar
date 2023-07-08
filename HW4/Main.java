package JAVA.seminar1.HomeWork.HW4;

import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static File logFile = null;
    static FileWriter fileWriter = null;
    static ArrayDeque<String> dequeArr = new ArrayDeque<>();
    static void homeTask1(){
        LinkedList<String> lList = new LinkedList<>();
        System.out.println("Введите строку, если желаете выйти вместо ввода нажмите <Enter>: ");
        boolean ch = true;
        while (ch){
            System.out.println("Введите строку: ");
            String inputStr = scan.nextLine();
            if (inputStr.equals("")){
                System.out.println("Завершение работы.");
                ch = false;
                continue;
            }
            lList.add(inputStr);
        }
        //Collections.reverse(lList);
        System.out.println("Лист в обратном порядке:");
        for (int i=lList.size();i>0;i--){
            System.out.print("|"+lList.get(i-1)+"| ");

        }
        System.out.println();
    }

    static void printDeq(ArrayDeque<String> arr){
        System.out.println("~~~~~~~~~~~~~");
        for (String item: arr) {
            System.out.println(item);
        }
        System.out.println("~~~~~~~~~~~~~");
    }

    static void addFile(ArrayDeque<String> arr){
        try {
            logFile = new File("log.txt");
            fileWriter = new FileWriter(logFile);
            try {
                for (String item : arr) {
                    fileWriter.append(item);
                }
                fileWriter.flush();
                fileWriter.close();
            }
            catch (Exception ex) {
                System.out.println("Произошла ошибка записи в файл.");
            }
        }
        catch(Exception ex){
            System.out.println("Произошла ошибка.");
        }
    }


    static ArrayDeque<String> addDeque (ArrayDeque<String> deq, String a){
        deq.add(a);
        return deq;
    }
    static ArrayDeque<String> delDeque (ArrayDeque<String> deq){
        deq.removeLast();
        return deq;
    }
    static void sumNum() {
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.printf("Результат: %d\n", a+b);
        String tSrt = a +" + "+ b + " = " + (a + b) + '\n';
        addDeque(dequeArr, tSrt);
           
    }
    static void diffNum(){
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.printf("Результат: %d\n", a-b);
        String tSrt = a +" - "+ b + " = " + (a - b) + '\n';
        addDeque(dequeArr, tSrt);
       
    }
    static void multNum(){
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.printf("Результат: %d\n", a*b);
        String tSrt = a +" * "+ b + " = " + (a * b) + '\n';
        addDeque(dequeArr, tSrt);
        
    }
    static void divNum(){
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Введите второе число: ");
        double b = Double.parseDouble(scan.nextLine());
        if (b==0){
            System.out.println("На 0 делить нельзя!!!");
            String tSrt = a + " / " + b + " = " + "Incorrect operation with '0'" + '\n';
            addDeque(dequeArr, tSrt);
        }
        else {
            System.out.printf("Результат: %.2f\n", a/b);
            String tSrt = a + " / " + b + " = " + (a / b) +'\n';
            addDeque(dequeArr, tSrt);
        }
    }
    static void calcChoise(){
        System.out.println("Добро пожаловать в примитивный калькулятор ;) ");
        boolean f = true;
        while(f){

            System.out.println("Выберите действие: ");
            System.out.println("1 - Сложить");
            System.out.println("2 - Вычесть");
            System.out.println("3 - Умножить");
            System.out.println("4 - Разделить");
            System.out.println("5 - Удалить последнее действие");
            System.out.println("0 - Выход из калькулятора");
            System.out.println("===========================================");
            System.out.print("Ваш выбор: ");
            int no = Integer.parseInt(scan.nextLine());
            switch(no){
                case 1:
                    sumNum();
                    printDeq(dequeArr);
                    break;
                case 2:
                    diffNum();
                    printDeq(dequeArr);
                    break;
                case 3:
                    multNum();
                    printDeq(dequeArr);
                    break;
                case 4:
                    divNum();
                    printDeq(dequeArr);
                    break;
                case 5:
                    delDeque(dequeArr);
                    printDeq(dequeArr);
                    break;
                case 0:
                    System.out.println("Завершение работы калькулятора.");
                    System.out.println(dequeArr);
                    addFile(dequeArr);
                    //printDeq(dequeArr);
                    f = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер действия.\n Повторите попытку.");
                    break;

            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Добро пожаловать!");
        boolean check = true;
        while(check){
            System.out.println("###########################################################");
            System.out.println("Структура приложения:");
            System.out.println("1 - 'Примитивный калькулятор';");
            System.out.println("2 - 'LinkedList';");
            System.out.println("0 - Выход из приложения.");
            System.out.println("###########################################################");
            System.out.print("Ваш выбор: ");
            int task = Integer.parseInt(scan.nextLine());
            switch(task){
               case 1:
                   calcChoise();
                   break;
               case 2:
                   homeTask1();
                   break;
               case 0:
                    System.out.println("Завершение работы приложения.");
                    check = false;
                    break;
               default:
                    System.out.println("Вы указали некорректный номер действия.\n Повторите попытку.");
                    break;
            }


        }


    }

}