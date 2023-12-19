import java.util.Scanner;
public class Shop {
    private Client[] ClientBase = new Client[100];
    private int numberOfClients = 0;
    public void register() throws InvalidINNException{
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String INN = "";
        while(name.isEmpty() || INN.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.next();
            System.out.print("Enter your INN: ");
            INN = scanner.next();
        }

        checkINN(INN);
        ClientBase[numberOfClients] = new Client(name, INN);
        ++numberOfClients;
    }
    public void authorise(String INN) throws NoSuchClientException, InvalidINNException{
        if (numberOfClients == 0) throw new NoSuchClientException("The base of clients is empty!");
        checkINN(INN);
        boolean f = false;
        for (Client client: ClientBase){
            if (client.INN.equals(INN)){
                System.out.println("Welcome back, " + client.name + "!");
                f = true;
                break;
            }
            if (!f) {
                throw new NoSuchClientException("There`s no such client!");
            }
        }
    }
    public static class NoSuchClientException extends RuntimeException{
        NoSuchClientException(String errorMessage){
            super(errorMessage);
        }
    }
    public static class InvalidINNException extends RuntimeException{
        InvalidINNException(String errorMessage){
            super(errorMessage);
        }
    }
    private void checkINN(String INN) throws InvalidINNException{
        boolean isCorrect = (INN.length() == 10);
        try{
            Integer.parseInt(INN);
        } catch (NumberFormatException ex){
            isCorrect = false;
        }
        if (!isCorrect) throw new InvalidINNException("INN is invalid!");
    }
}
