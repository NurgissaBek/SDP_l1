package Handler_patterns;

class CarAvailabilityHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.isCarAvailable()) {
            System.out.println("Car is available.");
            if (nextHandler != null) {
                return nextHandler.handle(request);
            }
        } else {
            return "Request Denied: No cars available.";
        }
        return null;
    }
}

