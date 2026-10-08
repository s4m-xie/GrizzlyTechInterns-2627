public class SpecialIceCreamOrder extends IceCreamOrder{
    private double specialFee;
    public IceCreamOrder(double specialFee,String customerName, int scoopCount, double pricePerScoop, boolean paid, HolderType holderType, String[]  flavors){
        super.customerName = customerName;
        super.scoopCount = scoopCount;
        super.pricePerScoop = pricePerScoop;
        super.paid = paid;
        super.holderType = holderType;
        super.flavors = flavors;
        if (specialFee<0){
            this.specialFee=0;
        }else{
            this.specialFee=specialFee;
        }
    }
    @Override
    public double calculateTotal(){
        subtotal=calculateSubtotal()
        if (subtotal>=20){
            subtotal=subtotal-(.10*subtotal);
        }
        total = subtotal+specialFee;
        return total;
    }
    
}