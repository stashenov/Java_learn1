package Recursions;

public class Recursions {

    public static void main(String[] args) {

        System.out.println("RESULT = "+factorial(3));

    }

    private static int factorial(int n){
        int result = 1;
        if(n==1||n==0){
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }

}