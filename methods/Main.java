package methods;

public class Main {

    static float myfunc(float c, float d){
        return c + d;
    }

    static int myfunc(int a, int b){
        System.out.println("hey, myfunc");
        return a + b;
    }

    public static void main(String[] args){

        int result1 = myfunc(5, 7);
        System.out.println("Result 1: " + result1);

        float result2 = myfunc(4.6f, 4.6f);
        System.out.println("Result 2: " + result2);
    }
}
