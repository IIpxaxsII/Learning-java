import java.util.Scanner;

public class function {
    
    public static void main(String[] args) {
// printhello();

// name();
pattern();

        }
          public static  void printhello() {
                System.out.println("Hello all!");
    }
    public static void name(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Your name is: " + name);
        
    }
    public static void pattern(){
        for (int i = 1; i < 10; i++) {
            System.out.print( "* \n");
            
        }
    }
    }

