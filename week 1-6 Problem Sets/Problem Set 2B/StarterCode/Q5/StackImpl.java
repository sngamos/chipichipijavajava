// COPY AND PASTE YOUR SOLUTION FROM THE PREVIOUS QUESTION HERE

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements CustomStack<T> {

    private List<T> dataStorage;

    StackImpl(){
        dataStorage = new ArrayList<>();
    }

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
