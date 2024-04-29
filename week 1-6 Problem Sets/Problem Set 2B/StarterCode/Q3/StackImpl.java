// COPY AND PASTE YOUR SOLUTION FROM THE PREVIOUS QUESTION

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements CustomStack<T> {

    private List<T> dataStorage;

    // constructor must be public 
    public StackImpl(){
        dataStorage = new ArrayList<>();
    }
    
    // default statements provided below to avoid compile-time errors 

    @Override
    public void push(T t) {
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peek() {
        return null; 
    }

    private int getLastIndex(){
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
