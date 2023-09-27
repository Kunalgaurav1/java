package Hashset;
import java.util.HashSet;

public class Main1 {

    public static void main(String[] args){
        HashSet<Integer> number  =  new HashSet<Integer>();

        number.add(4);
        number.add(9);
        number.add(6);

        for(int i=1; i<=10; i++){
            if(number.contains(i)){
                System.out.println(i + " is found ");
            }else{
                System.out.println(i + " is not found ");
            }
        }


    }
    
}
