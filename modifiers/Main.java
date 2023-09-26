package modifiers;

public class Main {

    //The public keyword is an access modifires , meaning that it is used to set the access level

     int x = 9;
    final double PI = 9.4;

    public static void main(String[] args){

        Main myObj = new Main();

        myObj.x = 4;

        System.out.println(myObj.x);

    }
    
}
