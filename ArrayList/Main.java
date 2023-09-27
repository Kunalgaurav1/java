package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

//import Collections.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> friendName = new ArrayList<String>();  //this created dynamic array list 

        friendName.add("kunal");
        friendName.add("pranav");
        friendName.add("anish");
        friendName.add("nikhil");
        
        friendName.set(0, "sonu");// to append arrayList


        System.out.println(friendName);

     //   friendName.clear();// to clear all the element in the arrayList

        System.out.println(friendName);

        friendName.size();// to print number of element in the arraylist

        System.out.println(friendName.size());


        //To iterate in the array

        for(int i = 0; i<friendName.size(); i++){
            System.out.println(friendName.get(i));
            
        }
       //iteration throught for each loop

       for(String s: friendName){
        System.out.println(s);
       }


       //sorting in ArrayList

       System.out.println("shorting in ArrayList");

       Collections.sort(friendName);
       for(String k: friendName){
        System.out.println(k);
       }


    }
    
}
