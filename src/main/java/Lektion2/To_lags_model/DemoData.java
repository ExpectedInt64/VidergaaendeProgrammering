package Lektion2.To_lags_model;
import java.util.ArrayList;
import java.util.List;
public class DemoData implements IData {

    private class Ingredient{
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount){
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }
        public int getId(){
            return id;
        }
        public int getAmount(){
            return amount;
        }
        public String setName (String name){
            return this.name= name;
        }
        public int setAmount (int amount){
            return this.amount=amount;
        }

        @Override
        public String toString() {
            return "Ingredient{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
    private List<Ingredient> ingredients;
    public DemoData(){
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1,"mel",60));
        ingredients.add(new Ingredient(2,"vand",10));
        ingredients.add(new Ingredient(3,"natron",30));
    }
    public int getIngredientSize (){
        return ingredients.size();
    }

    @Override
    public String[] getAllIngredients() {

        String [] temp = new String[ingredients.size()];
        for (int i = 0; i < ingredients.size() ; i++) {
            temp[i] = ingredients.get(i).toString();
        }
        return temp;

    }

    @Override
    public String getIngredientName(int id) {

        for (int i = 0; i < ingredients.size() ; i++) {
            if (ingredients.get(i).getId() == id){
               return ingredients.get(i).getName();
            }
        }
        return null;
    }

    @Override
    public int getIngredientAmount(int id) {

        for (int i = 0; i < ingredients.size() ; i++) {
            if (ingredients.get(i).getId() == id){
                return ingredients.get(i).getAmount();
            }
        }
        return -1;

    }

    @Override
    public void setIngredientName(int id, String name) {
        for (int i = 0; i < ingredients.size() ; i++) {
            if (ingredients.get(i).getId() == id){
                ingredients.get(i).setName(name);
            }
        }
    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        for (int i = 0; i < ingredients.size() ; i++) {
            if (ingredients.get(i).getId() == id) {
                ingredients.get(i).setAmount(amount);
            }
        }
    }
    public void createIngredient(int id, String name, int amount){
        ingredients.add(new Ingredient(id,name,amount));
    }
}
