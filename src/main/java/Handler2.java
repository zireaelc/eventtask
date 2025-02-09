public class Handler2 extends AbstractHandler{
    @Override
    protected void childProcess(Event event) {
        String info = event.getContext().get("info");
        // делаем вид, будто отправляем на почту
        System.out.println("Отправили на почту: " + info);
    }
}
