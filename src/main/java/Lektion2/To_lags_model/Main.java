package Lektion2.To_lags_model;
import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true) {
            ui.showMenu();
        }
    }

}
