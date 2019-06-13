public class NewSingleton {
    private static NewSingleton ourInstance = new NewSingleton();

    public static NewSingleton getInstance() {
        return ourInstance;
    }

    private NewSingleton() {
    }
}
