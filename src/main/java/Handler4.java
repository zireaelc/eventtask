public class Handler4 extends AbstractHandler{
    @Override
    protected void childProcess(Event event) {
        String phone = event.getContext().get("phone");
        System.out.println(phone.length() == 11 ? "Номер " + phone + " валиден" :
                "Номер " + phone + " не валиден");
    }
}
