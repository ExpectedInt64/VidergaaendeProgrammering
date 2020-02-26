package Lektion1.Vektor.src;

import java.util.*;

public class Vektor implements IVektor, Comparable<Vektor> {

    final private int a;
    final private int b;

    public Vektor(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public IVektor times(int x) {
        IVektor temp = new Vektor(x * this.getA(), x * this.getB());
        return temp;
    }

    @Override
    public IVektor add(IVektor b) {
        int up = this.getA() + ((Vektor) b).getA();
        int down = this.getB() + ((Vektor) b).getB();
        Vektor temp = new Vektor(up, down);

        return temp;
    }


    @Override
    public boolean equals(IVektor a) {
        boolean temp = false;

        if (this.getA() == ((Vektor) a).getA() && this.getB() == ((Vektor) a).getB())
            return true;
        return temp;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String toString() {
        return "(" + getA() + "," + getB() + ")";
    }

    @Override
    public int compareTo(Vektor vektor) {
        double længdeA = Math.sqrt((Math.pow(this.getA(), 2)) + Math.pow(this.getB(), 2));
        double længdeB = Math.sqrt((Math.pow(vektor.getA(), 2)) + Math.pow(vektor.getB(), 2));

        if (længdeA > længdeB) {
            return (int) (længdeA - længdeB);
        }
        if (længdeA < længdeB) {
            return (int) (længdeA - længdeB);
        } else
            return 0;
    }

    /*
       |
       |
       |
       | Main metoden
       |
       |
       |
       |
        */
    public static void main(String[] args) {
        IVektor a = new Vektor(10, 3);
        IVektor b = new Vektor(2, 5);
        IVektor[] vektorer = new IVektor[5];
        vektorer[0] = new Vektor(3, 4);
        vektorer[1] = new Vektor(6, 7);
        vektorer[2] = new Vektor(10, 11);
        vektorer[3] = new Vektor(-5, -7);
        vektorer[4] = new Vektor(1, 0);

        /*
        |
        |
        |
        | Udskrift af resultater
        |
        |
        |
        |
         */
        System.out.println("times metoden");
        System.out.println(a.times(2));
        System.out.println("");

        System.out.println("add metoden");
        System.out.println(a.add(b));
        System.out.println("");


        System.out.println("equals metoden");
        System.out.println(a.equals(b));
        System.out.println("");


        System.out.println("compareTo metoden");
        System.out.println(((Vektor) a).compareTo((Vektor) b));
        System.out.println("");

        System.out.println("Array før sort");
        for (int i = 0; i < vektorer.length; i++) {
            System.out.println(vektorer[i]);
        }
//        Arrays.sort(vektorer);
        System.out.println("");

        System.out.println("Array efter sort(sorterer hensyn til længden");
        for (int i = 0; i < vektorer.length; i++) {
            System.out.println(vektorer[i]);
        }

        System.out.println("implementation with array list");


        IVektor vek1 = new Vektor(2, 5);
        IVektor vek2 = new Vektor(2, 2);
        IVektor vek3 = new Vektor(2, 3);
        IVektor vek4 = new Vektor(2, 7);
        IVektor vek5 = new Vektor(2, 8);

        List<IVektor> list = new ArrayList<IVektor>();
        list.add(vek1);
        list.add(vek2);
        list.add(vek3);
        list.add(vek4);
        list.add(vek5);


        System.out.println("list with out sorting");
        Iterator<IVektor> it = list.iterator();

        while (it.hasNext()) {
            IVektor vektor = it.next();
            System.out.println(vektor);
        }
        System.out.println("list with sorting");



    }
}



