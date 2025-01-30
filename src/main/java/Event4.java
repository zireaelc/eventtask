import java.time.LocalDateTime;
import java.util.Map;

public class Event4 extends Event{
    public Event4(LocalDateTime time, Map<String, String> context) {
        super("type4", time, context);
    }

    @Override
    public void action() {
        String phone = getContext().get("phone");
        System.out.println(phone.length() == 11 ? "Номер " + phone + " валиден" :
                "Номер " + phone + " не валиден");
    }
}
