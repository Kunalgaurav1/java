package encapsulation;



public class Main {

    private String name = "kunal";

    //getter
    public String getName() {
        return name;
    }
    

    //setter
    public void setName(String newName){
        this.name = newName;
    }


    public static void main(String[] args){

        Main myobj = new Main();

        myobj.setName("gaurav");
        System.out.println(myobj.getName());
    }
}
