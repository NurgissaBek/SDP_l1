package Template;

abstract class OrderProcess {
    protected abstract void checkAvailability();
    protected abstract void calculateCost();
    protected void confirmOrder(){
        System.out.println("Order confirmed");
    }
    protected void finalizeOrder() {
        System.out.println("Order finalized.");
    }
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
        finalizeOrder();
    }

}
