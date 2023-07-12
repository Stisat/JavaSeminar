package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Program {


    static void hometask(String[] abonents){
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        for (String abo:abonents){
            String[] abonParts = abo.split(" ");
            String surName = abonParts[1];
            String phNumber = abonParts[0];
            if (phoneBook.containsKey(surName)){
                phoneBook.get(surName).add(phNumber);
            }
            else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(phNumber);
                phoneBook.put(surName, lst);}
        }
        System.out.println("Телефонный справочник содержит следующие записи, отсортированные по фамилии: ");
        for (Map.Entry<String, ArrayList<String>> element : phoneBook.entrySet()){
            System.out.printf("Фамилия, № телефона: %s - %s\n",element.getKey(), element.getValue());
        }


    }


    public static void main(String[] args) {
        String[] data = {
                "899123456 Иванов",
                "789321456 Васильев",
                "790234561 Петрова",
                "791234432 Иванов",
                "855654321 Иванов",
                "899654321 Петрова"

        };
        hometask(data);
    }
}
