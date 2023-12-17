import java.text.NumberFormat;
import java.util.*;
import java.text.Format;

public class Converter {
    private float value;
    private final Map<String, Double> map;


    Converter(){
        map = new HashMap<>();
        map.put("RUStoUSD", 1/90.0);
        map.put("RUStoEUR", 1/100.0);
        map.put("USDtoEUR", 90/100.0);
        map.put("USDtoRUS", 90.0);
        map.put("EURtoUSD", 100/90.0);
        map.put("EURtoRUS", 100.0);
    }
    public void convert(float sum ,String from, String to){
        String str = from + "to" + to;
        if (map.containsKey(str)){
            NumberFormat numberFormat;
            if (to.equals("USD")){
                numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.println(numberFormat.format(sum * map.get(str)));
            } else if (to.equals("EUR")) {
                numberFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
                System.out.println(numberFormat.format(sum * map.get(str)));
            } else if (to.equals("RUS")) {
                System.out.println(sum * map.get(str) + "Р");
            }
        }
        else{
            System.out.println("Operation denied!");
        }

    }
}
