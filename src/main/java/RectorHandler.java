public class RectorHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        System.out.println("Rector: Final approval granted.");
        if (next != null) next.handle(request);
    }
}