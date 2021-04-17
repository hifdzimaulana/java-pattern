package TheFactoryPattern;


public class App {
    public static void main(String[] args) {
        
        ComputerFactory computerFactory = new ComputerFactory();
    
        Computer phone = computerFactory.getComputer("Phone");
        phone.compute();
        
        Computer laptop = computerFactory.getComputer("laptop");
        laptop.compute();
        
        Computer smartTv = computerFactory.getComputer("SMART TV");
        smartTv.compute();
    }
}
