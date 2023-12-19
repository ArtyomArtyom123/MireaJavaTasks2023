public class Client {
    public String name;
    public String INN;
    Client(String name, String INN){
        this.name = name;
        this.INN = INN;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nINN: %s\n", name, INN);
    }
}
