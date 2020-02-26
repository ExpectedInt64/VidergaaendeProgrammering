package Lektion1.Vektor;

public class MainVektor {
    public static void main(String[] args) {
        Vektor aVek = new Vektor(2,2);
        Vektor bVek = new Vektor(6,5);
        Vektor cVek = new Vektor(8,7);
        System.out.println(aVek.toString());
        aVek = (Vektor) aVek.add(bVek);
        System.out.println(aVek.toString());
        System.out.println(aVek.equals(bVek));
        System.out.println(aVek.equals(cVek));
        aVek = (Vektor) aVek.times(2);
        System.out.println(aVek.toString());
    }
}
