package AbstractFactoryPattern;

public class PortableFactory extends AbstractFactory{

    @Override
    Computer getComputer(String type) {
        
        if (type.equalsIgnoreCase("smart tv")){
            return new SmartTV();
        }
        else if (type.equalsIgnoreCase("laptop")){
            return new Laptop();
        }
        
        return null;
    }
}
