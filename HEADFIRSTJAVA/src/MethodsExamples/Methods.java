package MethodsExamples;

public class Methods {

    public static void main(String[] args) {
        hello();
        int number1 = 5;
        int number2 = 5;
        int result = sum(number1,number2);
        System.out.println(result);
        display("Khaknazar",3);

        sum(1,6,10,15);
        double r = sum(10.5,5);
        System.out.println(r);


    }
    static void hello(){
        System.out.println("Hello!");
    }

    static void display(String name, int age){

        System.out.println("Baby name: "+ name + ", age - " + age);
    }

    static int sum(int num1, int num2){
        return num1+num2;
    }

    static double sum(double num1, double num2){
        return num1+num2;
    }

    static double sum(double num1, int num2){
        double d= num2;
        return num1+ d;
    }

    static void sum(int ...nums){
        int result = 0;
        for (int number:nums
             ) {
            result+=number;
        }
        System.out.println("Сумма чисел = " + result);
    }

}