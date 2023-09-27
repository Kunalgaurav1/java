package Hashset;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();

        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("maybak");
        cars.add("volvo");

        System.out.println(cars);

        System.out.println(cars.contains("dfdf"));


    }
    
}
