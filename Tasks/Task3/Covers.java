public class Covers {
    static public void main(String[] args){
        Double d1 = Double.valueOf("1.23");
        Double d2 = Double.valueOf(4);
        Double d3 = Double.valueOf(7.12f);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        double d = Double.parseDouble("1.2345");
        System.out.println(d);

        Double d4 = Double.valueOf("5.6789");
        int i = d4.intValue(); // or int i = (int)(double)d4;
        short s = d4.shortValue();
        long l = d4.longValue();
        byte b = d4.byteValue();
        float f = d4.floatValue();

        Double d5 = Double.valueOf("789.987");
        String string = Double.toString(d5);
        System.out.println(string);
    }
}
