public class StoreSimulation{
    public void simulateDay(){
        String[] flavorios= ["vanil", "chocolat", "mit","cokie","coffe"];
        SpecialIceCreamOrder me = new SpecialIceCreamOrder(100.00, "aadil", 20, 2000.00, 1000000.00, CUP, flavorios);
        IceCreamOrder lebron = me;
        lebron.calculateTotal();
        lebron.addScoop("vanil");
        lebron.addScoop("vanil", 20000000);
        lebron.getOrderMessage();
        lebron.getContainerType();
        lebron.hasFlavor();
        lebron.countValidFlavors();
        lebron.prepareScoops();
        lebron.estimatePreparationMinutes();
    }
}