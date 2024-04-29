package week1;

public class InstanceOfDemo {
    public static void main(String[] args) {
        InstanceOfDemo x = new InstanceOfDemo();
        int[] y = {1,2,3};
        String z = "heh";

        System.out.println( x instanceof InstanceOfDemo );
        System.out.println( x instanceof Object );
        System.out.println( y instanceof Object );
        System.out.println( z instanceof Object );
    }
}
