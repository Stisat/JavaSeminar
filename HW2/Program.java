package JAVA.seminar1.HomeWork.HW2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static File logFile = null;
    static FileWriter fileWriter = null;
    public static void main(String[] args) {
    System.out.println("Добро пожаловать! В приложении представлены основные домашние задания к семинару №1 ");
        boolean check = true;
        while(check){
            System.out.println("###########################################################");
            System.out.println("Структура приложения:");
            System.out.println("1 - Задание №1 - 'Треугольное число и факториал числа N';");
            System.out.println("2 - Задание №2 - 'Вывод простых чисел от 1 до 1000';");
            System.out.println("3 - Задание №3 - 'Примитивный калькулятор';");
            System.out.println("0 - Выход из приложения.");
            System.out.println("###########################################################");
            System.out.print("Ваш выбор: ");
            int task = Integer.parseInt(scanner.nextLine());
            try{
                logFile = new File("log.txt");
                fileWriter = new FileWriter(logFile, true);
                switch(task){
                    case 1:
                        System.out.println("Укажите число N: ");
                        int num1 = Integer.parseInt(scanner.nextLine());
                        int anG = angleNum(num1);
                        int factN = factorialN(num1);
                        System.out.printf("n-ое треугольное число: %d\n",anG);
                        System.out.printf("Факториал n! равен: %d\n",factN);
                        fileWriter.append("n-triangular number "+" = "+anG+'\n');
                        fileWriter.append("Factorial "+num1+" = "+factN+'\n');
                        fileWriter.flush();
                        break;
                    case 2:
                        System.out.println("Вывод всех простых чисел от 1 до 1000:");
                        primeNumbers(1000);
                        System.out.println();
                        break;
                    case 3:
                        calcChoise();
                        break;
                    case 0:
                        System.out.println("Завершение работы приложения.");
                        check = false;
                        break;
                    default:
                        System.out.println("Вы указали некорректный номер действия.\n Повторите попытку.");
                    break;
                }
                fileWriter.close();        
            }
            catch(Exception ex){
                System.out.println("Приложение будет закрыто");
            }
        }    
    }
    static int angleNum(int n) {
        if(n==1) {
            return 1;
        }
        else {
            return( n + angleNum(n-1) );
        }
    }
    static int factorialN(int n) {
        if (n==1)
            return 1;
        else {
            return (n*factorialN(n-1));
        }
    }
    static boolean isSimple(int number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void primeNumbers(int n) {
        for (int i=2; i<=n;i++){
            if (isSimple(i)==true){
                System.out.printf("%d ",i);
            }
        }
    } 
    static void sumNum() {
        try{
            System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a+b);
            fileWriter.append(a + " +  " + b + " = " + (a + b) + '\n' );
            fileWriter.flush();
        }
        catch(Exception ex){
            System.out.println("Произошла ошибка записи в файл.");
        }
    }
    static void diffNum(){
        try{
            System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a-b);
            fileWriter.append(a + " - " + b + " = " + (a - b) + '\n' );
            fileWriter.flush();
        }
        catch(Exception ex){
            System.out.println("Произошла ошибка записи в файл.");
        }
    }
    static void multNum(){
        try{
            System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a*b);
            fileWriter.append(a + " * " + b + " = " + (a * b) + '\n' );
            fileWriter.flush();
        }
        catch(Exception ex){
            System.out.println("Произошла ошибка записи в файл.");
        }
    }
    static void divNum(){
        try{
            System.out.println("Введите первое число: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Введите второе число: ");
            double b = Double.parseDouble(scanner.nextLine());
            if (b==0){
                System.out.println("На 0 делить нельзя!!!");
                fileWriter.append(a + " / " + b + " = " + "Incorrect operation with '0'" + '\n' );
                fileWriter.flush();
                }
            else {
                System.out.printf("Результат: %.2f\n", a/b);
                fileWriter.append(a + " / " + b + " = " + (a / b) + '\n' );
                fileWriter.flush();
            }
            
        }
        catch(Exception ex){
            System.out.println("Произошла ошибка записи в файл.");
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
            System.out.println("0 - Выход из калькулятора");
            System.out.println("===========================================");
            System.out.print("Ваш выбор: ");
            int no = Integer.parseInt(scanner.nextLine());
            switch(no){
                case 1:
                    sumNum();
                    break;
                case 2:
                    diffNum();
                    break;
                case 3:
                    multNum();
                    break;
                case 4:
                    divNum();
                    break;
                case 0:
                    System.out.println("Завершение работы калькулятора.");
                    f = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер действия.\n Повторите попытку.");
                break;

            }
        }
    }
}
