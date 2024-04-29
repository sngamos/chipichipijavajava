package week2.AccessModifierDemo.AnotherPackage;

import week2.AccessModifierDemo.C1;

public class C3 extends C1 {
    // C3 is in different package from C1. All accessible attributes are inherited
    void m(){
        System.out.println( this.s ); // attribute s is accessible by C3, thus get inherited
    }

    public static void main(String[] args) {
        C3 c = new C3();
        c.m();
    }

    @Override
    public void something() {  // Cannot weaken accessibility when overriding method
        super.something();
    }
}
