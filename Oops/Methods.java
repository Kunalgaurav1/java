package Oops;


/*
 
public class Methods {
    static void myfunc(){
        System.out.println("function called");
    }


    public static void main(String[] args){
        myfunc();
    }
}
 */


//static vs public 

/*
 
public class Methods{
    static void myfunc(){

        System.out.println("static function can be called without creating object ");


    }

    public void myfunc2(){
        System.out.println("public function can be called with creating object ");
    }


    public static void main(String[] args){
        myfunc();

        Methods myobj = new Methods();
        myobj.myfunc2();
    }
}
 */


//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:


public class Methods{

    public void fullThrottle(){
        System.out.println("car is runnig as fast as it can");
    }

    public void speed(int maxspeed){

        System.out.println("my speend is  : "  + maxspeed);

    }


    public static void main(String[] args){
        Methods myobj = new Methods();
        myobj.fullThrottle();
        myobj.speed(180);
    }
}



