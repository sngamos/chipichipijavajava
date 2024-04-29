package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        Integer[] a = new Integer[50000];
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(a)); //LinkedList
        int totalCnt = 100000;
        long started = System.nanoTime();
        for (int k = 0; k< totalCnt; k++) {
            linkedList.get(25000);
        }

        long time = System.nanoTime();
        long timeTaken = time - started;
        System.out.println("time taken for LinkedList:" + timeTaken/1000000.0 + "ms"); // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a));
        started = System.nanoTime();
        for (int k = 0; k< totalCnt; k++) {
            arrayList.get(25000);
        }
        time = System.nanoTime();
        timeTaken = time - started;
        System.out.println("time taken for ArrayList:" + timeTaken/1000000.0 + "ms"); }

    }
