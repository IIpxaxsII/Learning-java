import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please enter ur name: ");
        String name = input.next();
        System.out.println("Welcome " + name);
        System.out.print(name + " Please enter ur age : ");
        int age = input.nextInt();
        System.out.println(name + " Your age is " + age);



    }
}
