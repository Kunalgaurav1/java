package constructor;

/* 
 
public class Main {

    int x; //create class attribute

    public Main(){  // constructor does not have return type
     x = 6; // set the class attributes

    }


    public static void main(String[] args){
        Main myobj = new Main(); // creation of the object of class

       System.out.println(myobj.x); // printing x
    }
    
}
*/


//Constructor Parameters
public class Main{
    int x;

    public Main( int y){
        x = y;


    }

    public static void main(String[] args){
        Main myobj = new Main(89);

        System.out.println(myobj.x);
    }
}
