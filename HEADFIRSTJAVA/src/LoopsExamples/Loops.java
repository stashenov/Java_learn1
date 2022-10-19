package LoopsExamples;

public class Loops {

    public static void main(String[] args) {
        //WHILE LOOP
        int x = 14;
        while (x<15){
            System.out.println("x = " + x);
            x+=1;
        }
        System.out.println("end loop. x = "+x);
        x=10;

        // DO WHILE LOOP
        do{
            x-=1;
            System.out.println("x: " + x);
        }
        while(x>5);

        //FOR LOOP

        for (int i = 10; i>=0; i--){

            if (i==8) continue;
            if(i==5){
                break;
            }
            System.out.println("i = " + i);

        }

        System.out.println(midGrade(new int[]{1,2,3,4,5,6,7,8}));


    }
    //метод, в котором выводится средняя оценка

    public static double midGrade(int[] numbers) {
        int grade = 0;

        for (int num : numbers) {
            grade = num + grade;
        }
        return ((double) grade / numbers.length);

    }

}