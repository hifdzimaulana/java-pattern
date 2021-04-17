package TheFactoryPattern;

public class ComputerFactory {
    
    Computer getComputer(String computer){
        
        if (computer.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if (computer.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        else if (computer.equalsIgnoreCase("smart tv")){
            return new SmartTV();
        }
        return null;
    }
}