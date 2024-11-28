public class HRHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (request.isDocumentsValid()) {
            System.out.println("HR: Documents validated.");
            if (next != null) next.handle(request);
        } else {
            System.out.println("HR: Documents are invalid. Process terminated.");
        }
    }
}
