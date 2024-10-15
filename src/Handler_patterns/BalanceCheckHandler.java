package Handler_patterns;

class BalanceCheckHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.getBalance() >= request.getRideCost()) {
            System.out.println("Balance check passed.");
            if (nextHandler != null) {
                return nextHandler.handle(request);
            }
        } else {
            return "Request Denied: Insufficient balance.";
        }
        return null;
    }
}