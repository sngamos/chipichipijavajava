package week1;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo md = new MethodDemo(); // Object instantiation

        md.printNTimes(5, "HOHO");
    }
    public String printNTimes(int n, String message) {
        for (int i=0; i<n; i++) {
            System.out.println(message);
        }
      return message;
    }
}