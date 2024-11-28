public class Main {
    public static void main(String[] args) {
        // Створення обробників
        Handler chairman = new ChairmanHandler();
        Handler dean = new DeanHandler();
        Handler hr = new HRHandler();
        Handler rector = new RectorHandler();
        Handler finance = new FinanceHandler();

        // Налаштування ланцюжка
        chairman.setNext(dean);
        dean.setNext(hr);
        hr.setNext(rector);
        rector.setNext(finance);

        // Створення запиту
        Request request = new Request();
        request.setHasVacancy(true);
        request.setDocumentsValid(true);
        request.setHasFunding(true);

        // Запуск обробки
        chairman.handle(request);
    }
}
