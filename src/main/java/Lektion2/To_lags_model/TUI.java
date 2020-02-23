package Lektion2.To_lags_model;
import java.util.Scanner;

public class TUI implements IUI {

private IData data;
private Scanner scanner;

public TUI (IData data){
    this.data = data;
    scanner = new Scanner(System.in);
}
    @Override
    public void showMenu() {
        scanner = new Scanner(System.in);
        System.out.println("1.show all ingredients");
        System.out.println("2.show ingredient");
        System.out.println("3.change ingredient");
        System.out.println("4.creat ingredient");

        int menuId = scanner.nextInt();
        switch (menuId){
            case 1:
                showIngredients();
                break;
            case 2:
                showIngredient();
                break;
            case 3:
                changeIngredient();
                break;
            case 4:
                createIngredient();
                break;
        }

    }

    @Override
    public void showIngredients() {
        String[] string = data.getAllIngredients();
        for (String s:string) {
            System.out.println(s);
        }

}

    @Override
    public void showIngredient() {
        System.out.println("provide id");
        int  id = scanner.nextInt();
        String ingredient ="name: " + " " + data.getIngredientName(id) + " amount " + " " + data.getIngredientAmount(id);
        System.out.println(ingredient);
    }

    @Override
    public void changeIngredient() {
        System.out.println("provide id to change ingredient");
        int id = scanner.nextInt();
        String name = data.getIngredientName(id);

        System.out.println("you have three options");
        System.out.println("1. change the name ");
        System.out.println("2. change the amount");
        System.out.println("3. cancel");
        System.out.println("choose any of them");

        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("give new name");
                String name1 = scanner.next();
                data.setIngredientName(id,name1);
                break;
            case 2:
                System.out.println("provide new amount");
                int amount = scanner.nextInt();
                data.setIngredientAmount(id, amount);
                break;
            case 3:
                break;
        }
    }

    @Override
    public void createIngredient() {
        System.out.println("provide new id");
        int id = scanner.nextInt();
        System.out.println("provide new name");
        String name =scanner.next();
        System.out.println("provide new amount");
        int amount = scanner.nextInt();

        data.createIngredient(id,name,amount);
    }
}
