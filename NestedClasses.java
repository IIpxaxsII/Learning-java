class A{
    int age;
    public void show1(){
        System.out.println("In class 1");
    }
    class B {
        public void show2(){
            System.out.println("In class B");
        }

    
    }
}




public class NestedClasses {
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.show1();
        
    }

    
}
