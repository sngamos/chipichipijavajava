package week2.AccessModifierDemo;

public class C2 {
    public static void main(String[] args) {
        C1 c = new C1(); // Create C1 object

        // Can only access x and y.
        System.out.println( c.x );
        System.out.println( c.y );
    }
}
