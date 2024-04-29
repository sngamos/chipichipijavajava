package week2;

public class ScopeOfVariablesDemo {
    // The x and y attributes are accessible everywhere inside the class
    int x = 100;
    static int y = 1000;

    public static void main(String[] args) {
       // Local Variable demo below here
        for (int i = 0; i < 5; i++) {// Variable i is recognized only inside this loop
            if (i % 2 == 0) {
                String text = "Even"; // Variable text only exists in this if-else block
                System.out.println(text);
            }
        }
    }

    public void method1(int n) {
    // parameter n is only recognized inside this method
            System.out.println(n);
        }
    }