package TryCatches;
import java.util.Scanner;
public class TryCatches {

    public static void main(String[] args) {

        try {
            int n[] = new int[]{1,5,8};
            n[2]=20/0;
            System.out.println(n[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error!");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception!");
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");

    }

}