package Lektion4;

import java.util.List;

public interface Stak <T> {
    void push (T a);
    T pop();
    boolean isEmpty();
    boolean isFull();
    void show();

}


