package modifiers;


//abstact class

abstract class Main{


    public String fname = "kunal";
    public int age  = 4434;
    public abstract void study();


}


//subclass -- inherit from main

class Student extends Main {
    public int graduationYear = 2024;

    @Override
    public void study(){
        System.out.println("Studying all day");
    }
}


 class Abstract {


    public static void main(String[] args){

        Student myObj = new Student();

        System.out.println("Name : " +  myObj.fname);
        System.out.println("age : " + myObj.age);

        System.out.println("graduation year : " + myObj.graduationYear);
        myObj.study();

    }


    // why we use abstraction in java;


    


    
}
