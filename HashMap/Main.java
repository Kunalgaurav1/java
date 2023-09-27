package HashMap;
import java.util.HashMap;


public class Main {

    public static void main(String[] args){
        
        //creating hashmap object-- capitalcity

        HashMap<String, String>  capitalcities = new HashMap<String, String>();

        capitalcities.put("England", "London");
        capitalcities.put("Germany", "Berlin");
        capitalcities.put("Norway", "Oslo");
        capitalcities.put("USA", "California");
 

       // capitalcities.clear(); // to clear all the element from the hashmap
        System.out.println(capitalcities.get("Norway")); // to get a perticular element 
        System.out.println(capitalcities.remove("England")); // to remove a perticular element 
        System.out.println(capitalcities);
        System.out.println(capitalcities.size()); // to get the size of the hashmap

        //loop through the hashmap

        for(String i : capitalcities.keySet()){
            System.out.println(i);
        }

        System.out.print("printing values");

        for(String i: capitalcities.values()){
            System.out.println(i);
        }

    


        
    }


    
}
