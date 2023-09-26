package modifiers;

public class Main1 {

    static void myStaticMethod(){
        System.out.println("calling static method ");
    }

    public void mypublicMethod(){
        System.out.println("calling public method ");
    }


    public static void main(String[] args){
        myStaticMethod();


        Main1 myObj = new Main1();

         myObj.mypublicMethod(); // jiske andar public lag gya wo object bana ke hi chalega
    }
    
}
