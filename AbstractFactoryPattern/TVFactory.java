package AbstractFactoryPattern;

public class TVFactory extends AbstractFactory{

    @Override
    Computer getComputer(String type) {
            return new SmartTV();
    }
}
