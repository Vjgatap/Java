public class Swap{
    public static void main(String agrs []){
        int a = 10;
        int b = 20;

        System.out.println("Before swapping the value of a is : "+a);
        System.out.println("Before swapping the value of b is : "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the value of a is : "+a);
        System.out.println("After swapping the value of b is : "+b);
    }
}