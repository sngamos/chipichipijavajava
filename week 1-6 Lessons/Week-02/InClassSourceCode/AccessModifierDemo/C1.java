package week2.AccessModifierDemo;

public class C1 {
    public int x = 10; // public. Accessible even from different package
    int y = 5;  // default. Only accessible in week2 package
    private int z = 9;  // private. only accessible inside the C1 class
    protected String s = "hello"; // protected attribute

    protected void something(){

    }
}


