package Task2;

public class Test {
    public static void main(String[] args){
        MagicalChair mgchair = ChairFactory.createMagicalChair();
        MultiFunctionalChair mltchair = ChairFactory.createMultiFunctionalChair();
        VictorianChair vctrnchair = ChairFactory.createVictorianChair();
        Client client = new Client();
        client.sit(mgchair);
        client.sit(mltchair);
        client.sit(vctrnchair);
    }
}
