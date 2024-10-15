package Handler_patterns;

class LocationCheckHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.getLocation().equals("valid_location_1") || request.getLocation().equals("valid_location_2")) {
            System.out.println("Location is serviceable.");
            return "Request Approved: Car is on its way.";
        } else {
            return "Request Denied: Unserviceable location.";
        }
    }
}