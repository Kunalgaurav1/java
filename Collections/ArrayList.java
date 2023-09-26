package Collections;

public class ArrayList {

    public static void main(String[] args){
        String[] studentName = new String[30];

        studentName[0] = "kunal";
        studentName[1] = "gaurav";

        studentName[29] = "fdfd";
        studentName[30] = "dff";




        System.out.println(studentName[1]);
        //above is fixed size but in real time we need real dynamic memory allocation

        // ArrayList<String> studentname = new ArrayList<>();
        // studentName.add("rakesh");
    }
    
}
