package AbstractFactoryPattern;

public class FactoryProducer {
    static AbstractFactory getClass(boolean isPortable){
        if (isPortable){
            return new PortableFactory();
        }
        else {
            return new TVFactory();
        }
    }
}
