package BuilderPattern;

public class App {
    public static void main(String[] args) {
        OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1L)
                .withName("John Smith")
                .withAddress("California")
                .withBudget(100L)
                .withDiscountRate(2)
                .build();
        
        System.out.println(johnSmith.getAddress());
    }
}

//package onlineStore;
//
//public class App {
//    public static void main(String[] args) {
//        OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1L).withName("John Smith").withAddress("California").withBudget(100L).withDiscountRate(2).build();
//        
//        System.out.println();
//    }
//}
