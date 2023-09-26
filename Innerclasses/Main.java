package Innerclasses;

class Outerclass {
    int x = 20;

    class Innterclass {
        int y = 9;
    }
}

public class Main {


    public static void main(String[] args){
        Outerclass myOuter = new Outerclass();
        Outerclass.Innterclass myInner = myOuter.new Innterclass();    

        System.out.println(myOuter.x + myInner.y);
    
    
    }


    
}
