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




public class NestedClasses06 {
    public static void main(String[] args) {
        
        // A obj1 = new A();
        // obj1.show1();
        
        // A.B obj2 = obj1.new B();
        // obj2.show2();

        Second obj1 = new Second(){
            @Override
            public void show(){
            System.out.println("In new show!");
            }
        };

        obj1.show();
        

    }

    
}

/*Anonymous Inner Classes */
class first {
    public void show(){
        System.out.println("In show 1");
    }

}
class Second extends first {
    
    @Override
    public void show(){
        System.out.println("In show 2");
    }

}
