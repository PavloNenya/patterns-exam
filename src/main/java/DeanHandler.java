
public class DeanHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (request.isApprovedByChairman()) {
            request.setApprovedByDean(true);
            System.out.println("Dean: Request approved.");
            if (next != null) next.handle(request);
        } else {
            System.out.println("Dean: Chairman has not approved the request. Process terminated.");
        }
    }
}