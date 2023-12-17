// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void f(Season season){
        switch (season){
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
        }
    }
    public static void main(String[] args) {
        for (Season season: Season.values()){
            System.out.println(season.toString());
            System.out.println(season.getTemp());
            System.out.println(season.getDescription());
            System.out.println();
        }
    }
}