package HashMap;

import java.util.HashMap;

public class Main1 {

    public static void main(String[] args){

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("kunal" , 23);
        people.put("pranav" , 24);
        people.put("niks", 20);


        for(String name: people.keySet()){
            int age = people.get(name);
            if(age>20){
                System.out.println(name + " is " + age + " years old ." );

            }
        }




    }
    
}
