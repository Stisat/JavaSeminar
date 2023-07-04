package JAVA.seminar1.HomeWork.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean check = true;
        
        while(check){
            System.out.println("###########################################################");
            System.out.println("Структура приложения:");
            System.out.println("1 - Задание №1 - 'Запуск задания на работу с ArrayList;");
            System.out.println("0 - Выход из приложения.");
            System.out.println("###########################################################");
            System.out.print("Ваш выбор: ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch(choise){
                case 1:
                    int sizeArr = random.nextInt(16)+5;
                    System.out.println("Размер списка (от 5 до 20): "+sizeArr);
                    ArrayList<Integer> array1 = getArraylist(sizeArr);
                    System.err.println("Созданный список: "+array1);
                    getSortArray(array1);
                    break;
                case 0:
                    System.out.println("Завершение работы!");
                    check = false;
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте еще раз! ");
                    break;
            }
        }
    }

    static ArrayList<Integer> getArraylist (int size){  // объявление через ArrayList
        ArrayList<Integer> col = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            col.add(random.nextInt(31)-10);
        }
        return col;
    }
    static void getSortArray (ArrayList<Integer> col){
        Collections.sort(col);
        System.out.println("Отсортированный список: "+ col);
        System.out.println("Масимальное число из списка: "+ Collections.max(col));
        System.out.println("Минимальное число из списка: "+ Collections.min(col));
        Double sum = 0.00;
        for (Integer elem : col) {
            sum = sum+elem;
        }
        System.out.printf("Среднее значение в списке: %.2f\n1", sum/col.size());
                
    }
     
}
