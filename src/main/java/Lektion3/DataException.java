package Lektion3;

public class DataException extends Exception {
    public DataException (){
        super("No Data found!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
