package HW6;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        cats cat1 = new cats("Барсик", 6,"кот", "Валентина", "Октябрьская","белый","персидская");
        cats cat2 = new cats("Василий", 9,"кот", "Ольга", "Карла Маркса","черный","британец");
        cats cat3 = new cats("Мурзик", 4,"кот", "Петр", "Аэродромная","рыжий","персидская");
        cats cat4 = new cats("Мурка", 12,"кошка", "Анастасия", "Набережная","черно-белый","норвежская");

        System.out.println(cat1.equals(cat2));//False
        System.out.println(cat1.equals(cat3));//True


        HashSet<cats> hashCats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4));
        ArrayList<cats> templst = new ArrayList<>(hashCats);
        System.out.println("Вывод таблицы HashSet: ");
        for (cats cet:templst) {
            System.out.println(cet);
        }



    }
}
