package abstraction;

abstract class Animal{
    public abstract void animalSound();  // abstraction me abstract krke koi function hum nhi bna skte hai , jab function banana ho tab extend krke uss class ko usme hum us function ko define kr payenge 
    public void sleep(){
        System.out.println("dfdf");
    }
}

class Pig extends Animal {

    public void animalSound(){
        System.out.println("the pig say : wee wee");
    }

}

public class Main {


    public static void main(){

        //it is not possible to create object of abstract class  so resolve krne k liye humko inherit class banana hoga 
        // Animal myobj = new Animal();  //ye nhi ho payega

        Pig myobj = new Pig();

        myobj.sleep();
        myobj.animalSound();
    }
    
}
