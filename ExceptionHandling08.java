public class ExceptionHandling08 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        try {
            j = 18/i;

        } catch (Exception e) {
            System.out.println("Exception caught divide by zero");
        }
        System.out.println(j);
    }
}
