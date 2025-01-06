public class Swap2{
    public static void main(String args []){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping the value of a is : "+a);
        System.out.println("Before swapping the value of b is : "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping the value of a is : "+a);
        System.out.println("After swapping the value of b is : "+b);
    }
}