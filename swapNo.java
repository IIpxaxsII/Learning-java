import java.util.Scanner;


public class swapNo {
    public static void main(String[] args) {
try(Scanner input = new Scanner(System.in)){


            System.out.println("Enter first number: ");
            int a = input.nextInt();
            System.out.println("Enter second  number: ");
            int b = input.nextInt();
            System.out.println("Before swapping a: "+ a);
            System.out.println("Before swapping b: "+ b);

            int c =a;
                a = b;
                b = c;

            System.out.println("After swapping a: "+ a);
            System.out.println("After swapping b: "+ b);
input.close();
    }
}   
}
