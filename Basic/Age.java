import java.util.Scanner;
public class Age{
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
        int userAge;
        System.out.print("Enter user's age : ");
        userAge = sc.nextInt();

        if(userAge>=18){
            System.out.println("Are u eligible for voting !");
        }else{
            System.out.println("Sorry u are not eligible for voting !");
        }
    }
}