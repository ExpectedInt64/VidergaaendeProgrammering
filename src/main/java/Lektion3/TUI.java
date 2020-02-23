package Lektion3;

import java.util.Scanner;

public class TUI {
    IFunktionalitet funktionalitet;
    public TUI(IFunktionalitet funktionalitet){
        this.funktionalitet = funktionalitet;
    }

    public void show (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write CPR- Number");
        String cpr = scan.nextLine();
        try {
            System.out.println("person's name" + funktionalitet.getNavn(cpr));
            System.out.println(funktionalitet.getTextualBMI(cpr));
        }
        catch (DataException e){
            System.out.println("not found");
        }
        scan.close();

    }


}
