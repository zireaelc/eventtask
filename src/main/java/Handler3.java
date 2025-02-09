public class Handler3 extends AbstractHandler{
    @Override
    protected void childProcess(Event event) {
        String email = event.getContext().get("email");
        // какая-то большая проверка с регулярным выражением
        System.out.println("Провалидирована почта: " + email);
    }
}
