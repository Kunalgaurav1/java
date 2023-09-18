public class Myprogram{
    public static void main(String[] args){
        System.out.println("hello kunal");
        String name = "kunal";
        float a  =  4.55f;
        double b =  3.444;
        char c = 'A';

       final int mynum = 34;

        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(mynum);


        String firstname = "kunal";
        String lastname = "gaurav";
        String Yourname  = firstname + ' ' +  lastname ;
        System.out.println(Yourname);

        byte p = 127;
        System.out.println(p);


        System.out.println("java type casting ");
         
         //widening casting 

         /*
        int myINT = 9;
        double myDouble  = myINT; //automatic widening 

        System.out.println(myINT);
        System.out.println(myDouble); */ 


        //Narrowing casting 

        double myDouble = 4.56d;
        int myINT = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myINT);


        //operators in java 

        // 1.Arithmetic operators
        // 2.Assignment operators
        // 3.Comparision operators
        // 4.Logicak operators
        // 5.Bitwise operators



        //java Strings

        //java uses + for both concatanation and addition 

        String x = "kunal";
        int z = 33;

        System.out.println(z + x);

        System.out.println(Math.min(4,8));
        System.out.println(Math.max(4,8));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-6));
        System.out.println(Math.random());


        // for loop
        for(int i = 0; i<9; i++){
            System.out.println(i);
        }

        //for each loop 
        String[] car = {"kunal", "rahul", "ayush"};
        for(String i: car){
            System.out.println(i);
        }





    }
}