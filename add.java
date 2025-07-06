import java.util.Scanner;


public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number YOU HAVE: ");
        int first = input.nextInt();

        System.out.print("Please enter second number YOU HAVE: ");
        int second = input.nextInt();
        int sum = first+second;

        System.out.println("The sum is: "+ sum);
        
    }


    
}
