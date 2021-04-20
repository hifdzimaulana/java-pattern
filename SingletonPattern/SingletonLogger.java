package SingletonPattern;

public class SingletonLogger {
    
    //Eager initialization
    private static SingletonLogger instance = new SingletonLogger();
    
    private SingletonLogger(){}
    
    public static synchronized SingletonLogger getInstance(){
        return instance;
    }
    public void logMessageStart(){
        System.out.println("Start message is logged");
    }
    public void logMessageStop(){
        System.out.println("Stop message is logged");
    }
}
