package Lektion4;

import java.util.ArrayList;
import java.util.List;

public class ListStack <T> implements Stak <T> {
    private int top = -1;
    private List<T> list;

    public ListStack(){
        list = new ArrayList<T>();
    }

    @Override
    public void push( T t) {
        list.add(t);
        top++;
    }



    @Override
    public T pop() {
       if (!isEmpty()) {
           T t = list.get(top);
            list.remove(t);
            return t;
       }
       return
               null;

    }

    @Override
    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if (top <0)
            System.out.println("--Nothing inside--");
           else
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        Stak<String> stringStak = new ListStack<String>();
        stringStak.push("dette");
        stringStak.push("er");
        stringStak.push("godt");
        stringStak.push("nok");
        stringStak.pop();
        stringStak.show();
        System.out.println("--------Welcome------");

        Stak<Integer> integerStak = new ListStack<Integer>();
        integerStak.push(20);
        integerStak.push(8);
        integerStak.push(97);
        integerStak.show();
        System.out.println("--------Welcome------");
    }
}
