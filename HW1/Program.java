package JAVA.seminar1.HomeWork.HW1;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Добро пожаловать! В приложении представлены основные домашние задания к семинару №1 ");
        boolean check = true;
        while(check){
            System.out.println("#############################");
            System.out.println("Структура приложения:");
            System.out.println("1 - Задание №1.");
            System.out.println("2 - Задание №2.");
            System.out.println("3 - Задание №3.");
            System.out.println("0 - Выход из приложения");
            System.out.println("#############################");
            System.out.print("Ваш выбор: ");
            int task = Integer.parseInt(scanner.nextLine());
            switch(task){
                case 1:
                    System.out.println("Укажите число N: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    System.out.printf("n-ое треугольное число: %d\n",angleNum(num1));
                    System.out.printf("Факториал n! равен: %d\n",factorialN(num1));
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
    public static boolean isSimple(int number) {
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
        System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a+b);
    }
    static void diffNum(){
        System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a-b);
    }
    static void multNum(){
        System.out.println("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.printf("Результат: %d\n", a*b);
    }
    static void divNum(){
            System.out.println("Введите первое число: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Введите второе число: ");
            double b = Double.parseDouble(scanner.nextLine());
            if (b==0){
                System.out.println("На 0 делить нельзя!!!");
                }
            else {
                System.out.printf("Результат: %.2f\n", a/b);
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
