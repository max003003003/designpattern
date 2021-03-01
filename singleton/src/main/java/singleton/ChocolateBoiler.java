package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;


    private static ChocolateBoiler boilerInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

     public static ChocolateBoiler getBoilerInstance() {
        if (boilerInstance == null) {
            boilerInstance = new ChocolateBoiler();
        }
        return boilerInstance;

    }




}
