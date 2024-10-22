package Template;

class TaxiOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost...");
    }

}

