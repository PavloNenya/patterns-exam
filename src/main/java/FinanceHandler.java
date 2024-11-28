public class FinanceHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (request.isHasFunding()) {
            System.out.println("Finance: Funding approved. Process completed.");
        } else {
            System.out.println("Finance: No funding available. Process terminated.");
        }
    }
}
