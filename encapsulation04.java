class human {
    private int age;
    private String name;



    public void showName(){
        System.out.println("Name : "+name);
    }
    public void showAge(){
        System.out.println("Age : "+age);
    }

}

public class encapsulation04 {
    public static void main(String[] args) {
        
      human h1 = new human();
        h1.showName();
        h1.showAge();

    }
}
