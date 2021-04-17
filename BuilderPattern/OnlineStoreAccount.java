package BuilderPattern;

class OnlineStoreAccount {
    
    private Long id;
    private Long budget;
    private int discountRate;
    private String name;
    private String address;
    
    protected static class Builder {
        
        private Long id;
        private Long budget;
        private int discountRate;
        private String name;
        private String address;
        
        protected Builder(Long id){
            this.id = id;
        }
        
        protected Builder withName(String name){
            this.name = name;
            return this;
        }
        
        protected Builder withAddress(String address){
            this.address = address;
            return this;
        }
        
        protected Builder withBudget(Long budget){
            this.budget = budget;
            return this;
        }
        
        protected Builder withDiscountRate(int discount){
            this.discountRate = discount;
            return this;
        }
        
        public OnlineStoreAccount build(){
            OnlineStoreAccount onlineStore = new OnlineStoreAccount();
            onlineStore.address = this.address;
            onlineStore.budget = this.budget;
            onlineStore.discountRate = this.discountRate;
            onlineStore.name = this.name;
            onlineStore.id = this.id;
            
            return onlineStore;
        }
        
    }
    
    private OnlineStoreAccount(){
    }
    
    String getName(){
        return this.name;
    }
    
    String getAddress(){
        return this.address;
    }
    
    Long getId(){
        return this.id;
    }
    
    Long getBudget(){
        return this.budget;
    }
    
    int getDiscount(){
        return this.discountRate;
    }
}
