package Lektion1.Vektor;

interface IVektor {
    String toString();
    IVektor times(int x);
    IVektor add(IVektor v);
    boolean equals(IVektor v);
    int getX();
    int getY();
}
