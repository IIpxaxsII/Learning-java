class Parent1{
     public void show(){
        System.out.println("In parent1");

     }
    }

     class Parent2 extends Parent1{

    }



public class inheritance05 {
    public static void main(String[] args) {
       Parent2 obj = new Parent2();

       obj.show();
        
 
    }
}