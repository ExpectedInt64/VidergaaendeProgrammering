package Lektion3;

public class Main {
    public static void main(String[] args) {
        IData data = new Data();
        IFunktionalitet funktionalitet = new Funktionalitet(data);
        TUI tui = new TUI(funktionalitet);
        tui.show();
    }
}
