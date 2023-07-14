package HW6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;

public class cats {
    String name;
    int age;
    String gender;
    String hostName;
    String streetResidence;
    String color;
    String breed;

    public cats(String name, int age, String gender, String hostName, String streetResidence, String color, String breed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hostName = hostName;
        this.streetResidence = streetResidence;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("%s %d лет, %s, хозяйка - %s, проживает по адресу - %s, цвет - %s, порода - %s",name,age,gender,hostName,streetResidence,color,breed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cats cats = (cats) o;
        return Objects.equals(gender, cats.gender) && Objects.equals(breed, cats.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, breed);
    }

}
