interface A{
     void config();
     void show();

}

class B implements A{
    @Override
    public void config(){
        System.out.println("In config");
    }
    @Override
    public void show(){
        System.out.println("In show");
    }
}




public class Interface07 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.config();
    }
}
