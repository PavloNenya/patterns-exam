public class ChairmanHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (request.isHasVacancy()) {
            request.setApprovedByChairman(true);
            System.out.println("Chairman: Vacancy approved.");
            if (next != null) next.handle(request);
        } else {
            System.out.println("Chairman: No vacancy available. Process terminated.");
        }
    }
}
