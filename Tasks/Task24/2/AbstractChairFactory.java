package Task2;

public interface AbstractChairFactory {
    public static VictorianChair createVictorianChair(){
        return new VictorianChair();
    }
    public static MagicalChair createMagicalChair(){
        return new MagicalChair();
    }
    public static MultiFunctionalChair createMultiFunctionalChair(){
        return new MultiFunctionalChair();
    }
}
