package AbstractFactoryPattern;

public class App {
    public static void main(String[] args) {
        AbstractFactory portableFactory = FactoryProducer.getClass(true);
        AbstractFactory tvFactory = FactoryProducer.getClass(false);
        
        Computer computer1 = portableFactory.getComputer("laptop");
        computer1.compute();
        
        Computer computer2 = tvFactory.getComputer("smart tv");
        computer2.compute();
    }
}
