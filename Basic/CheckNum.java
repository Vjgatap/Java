// WAP to check given number is postive negitive or zero
import java.util.*;
public class CheckNum{
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(num+" is postive number !");
        }else if(num < 0){
            System.out.println(num + " is negitive number !");
        }else{
            System.out.println(num +" is zero !");
        }
    }
}