package Lektion2.BMI;

public class Funktionalitet implements IFunktionalitet {

    IData data;
    @Override
    public double getBMI(String cpr) {
        double bmi;
        bmi = (data.getVaegt(cpr)/Math.pow(data.getHoejde(cpr),2));
        return bmi;

    }

    @Override
    public String getTextualBMI(String cpr) {
        String text = null;
       if (getBMI(cpr)< 18.5){
           text = "Du vejer for lidt";
       }
       if (getBMI(cpr)< 25 && getBMI(cpr) >= 18.5){
           text= "Din vægt er passende";
       }
       if (getBMI(cpr)>=25 && getBMI(cpr)<=30){
           text = "Du er overvægtig";}
       if (getBMI(cpr)>30){
           text = "Du er svært overvægtig";
       }
       return text;
    }

    @Override
    public String getNavn(String cpr) {
        return data.getNavn(cpr);
    }
}
