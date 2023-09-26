package inheritence;

public class vehicles {

    protected String brand = "ford";

    public void honk(){
        System.out.println("honking");
    }




    
}




class  car extends vehicles {
    private String modelName = "mustang";


    public static void main(String[] args){
        
        //creating object 
        car mycar = new car();

        mycar.honk();

        System.out.println(mycar.brand + " " + mycar.modelName);
    }
}
