package SingletonPattern;

public class App {
    public static void main(String[] args) {
        SingletonLogger.getInstance().logMessageStart();
        SingletonLogger.getInstance().logMessageStop();
    }
}
