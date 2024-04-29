package week1;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        Container<String> c1 = new Container<>(); // Set the type when declaring c1

        c1.set("Hello World");

        String s = c1.get(); // Safeguard from any possible runtime error
    }
}

class Container<T> {
    private T something;
    public void set(T something) {
        this.something= something;
    }
    public T get() {
        return this.something;}
}