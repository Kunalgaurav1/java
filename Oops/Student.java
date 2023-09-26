package Oops;

public class Student {






    public Student(){
        System.out.println("Constructor called ");

    }

    
    //constructor overloading 
    public Student(int a){

        System.out.println("this is parametrized constructor : overloading having a as argument ");

    }

    public Student(int i, String n, String c){
        studentCity = c;
        studentID = i;
        studentName = n;
    }
    

    //data : data member or instance variable 
    int studentID;
    String studentName;
    String studentCity;

    //data; member methods methods:function

    public void study (){
        System.out.println(studentName + " is studying");
    }

    public void fullDetails(){
        System.out.println("StudentID is : " + studentID );
        System.out.println("Name of the student is : "  + studentName);
        System.out.println("City of the student is : " + studentCity);
    }


    public static void main(String[] args){




        Student st1;
        st1 = new Student();

        st1.studentName = "kunal gaurav";
        st1.studentCity = "BiharSharif";
        st1.studentID = 3434334;


        st1.study();
        st1.fullDetails();





        Student st2;
        st2 = new Student(987, "sachin", "patna"); // constructor calling 
        // st2.studentCity = "nawada";
        // st2.studentName = "pranav ranjan";
        // st2.studentID = 43434;


        
        st2.study();
        st2.fullDetails();

    }


    //constructor is used to initilize the data of the object 
    //constructor is called when the object is created
    // and it is called automatically
    //constructor name is the same as the function name 
    //constructor does not return any value not even void  

    //example

    // public Student(){

    //     // this is Non-paramiterized constructor
    // } 


    // public Student(int a, int b, String s){
    //     // this is parameterized constructor 
    // }


    //when java create automatically default constructor??

   // -->>if that class does not have any constructor then java creates one default constructor 


   //Constructor overloading 
   //1.number of argument is different
   //2.type of argument is different
   //3.order of argument is different



   //method overloading 
   //havinf multiple method in same class with same name 
   //constructor me koi v return type nhi hota hai but isme method me return type hoga ye must hai 


    
}



