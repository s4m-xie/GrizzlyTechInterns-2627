public abstract class IceCreamOrder{
    private String customerName;
    private int scoopCount;
    private double pricePerScoop;
    private boolean paid;
    private HolderType holderType;
    private String[] flavors;

    public IceCreamOrder(String customerName, int scoopCount, double pricePerScoop, boolean paid, HolderType holderType, String[]  flavors){
        this.customerName = customerName;
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
        this.paid = paid;
        this.holderType = holderType;
        this.flavors = flavors;
    }

    public String getName(){
        return customerName;
    }
    public int getscoopCount(){
        return scoopCount;
    }
    public boolean getpaid(){
        return paid;
    }
    public HolderType getholdertype(){
        return holderType;
    }

    public void setScoopCount(int scoopCount){
        if (scoopCount>=0){
            this.scoopCount=scoopCount;
        }
    }
    public void setPricePerScoop(double pricePerScoop){
        if (pricePerScoop>=0){
            this.pricePerScoop=pricePerScoop;
        }
    }
    public void setPaid(boolean paid){
        this.paid=paid;
    }

    public double calculateSubtotal(){
        double subtotal = scoopCount*pricePerScoop;
        return subtotal;
    }
    public int estimatePreparationMinutes(){
        int min= int(scoopCount*1.5);
        return min;
    }
    public String getOrderMessage(){
        if(scoopCount==0){
            return "ITS EMPTY";
        }else if (scoopCount>0 && paid==false ){
            return "PAYMENT IS NOT NOT REQUIRED"
        }else{
            return "its ready to prepare"
        }
    }
    public String getContainerType(){
        switch (holderType){
            case CUP:
                return "Cup"
            case SUGAR_CONE:
                return "Sugar cone"
            case WAFFLE_CONE:
                return "Waffle cone"
        }
    }
    public boolean hasFlavor(String targetFlavor){
        boolean found = false;
        for(int i = 0; i<flavors.length;i++){
            if (flavor[i].equals(targetFlavor)){
                found=true;
                break;
            }
        }
        return found;
    }
    public int countValidFlavors(){
        int count=0;
        for(int i= 0, i<flavors.length; i++){
            if (flavors[i]==null || flavors[i].isEmpty()){
                continue;
            }
            count++;
        }
        return count;
    }
    public int prepareScoops(){
        int count = 0;
        while (count<scoopCount){
            count++;

        }
        return count;
    }
    public void addScoop (String flavor){
        scoopCount++;
    }
    public void addScoop(String flavor, int quantity){
        if (quantity>0){
            scoopCount+=quantity;
        }
    }
    public abstract double calculateTotal();
}