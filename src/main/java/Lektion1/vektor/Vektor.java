package Lektion1.Vektor;

public class Vektor implements IVektor, Comparable<IVektor>{
    private final int x, y;

    public Vektor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y +")";
    }

    public IVektor times(int times) {
        int x, y;
        x = this.x * times;
        y = this.y * times;
        IVektor temp = new Vektor(x, y);
        return (IVektor) temp;
    }

    public IVektor add(IVektor v) {
        int x, y;
        x = this.x + ((Vektor) v).getX();
        y = this.y + ((Vektor) v).getY();
        IVektor temp = new Vektor(x, y);
        return (IVektor) temp;
    }

    public boolean equals(IVektor v) {
        return (this.x == ((Vektor)v).getX() && this.y == ((Vektor)v).getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(IVektor v) {

        double thisLength = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));

        double vLength = Math.sqrt(Math.pow(v.getX(),2) + Math.pow(v.getY(),2));

        return Double.compare(thisLength, vLength);
    }
}
