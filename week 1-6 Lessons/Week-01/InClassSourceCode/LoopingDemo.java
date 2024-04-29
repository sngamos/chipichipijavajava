package week1;

public class LoopingDemo {
    public void hehe() {
        LoopingDemo ld = new LoopingDemo();

    }
    public static void main(String[] args) {
        // For Loop
        for (int i=1;i<=4;i++) {
            System.out.println("i is " + i);
        }

        // For-each loop
        double[] numbers = {1.5, 3.0, 4.5, 6.0, 7.5};
        for (double number: numbers) {
            System.out.println(number);
        }

        System.out.println("DEMO ONLY");
        for (int i=2; i<numbers.length; i+=2) { // Starts from index 2, increment idx by 2
            System.out.println(numbers[i]);
        }

        // While Loop
        int x = 0;
        while (x <= 5)
        {
            System.out.println("x = " + x);
            x += 1;
        }
    }
}
