import java.time.LocalDateTime;
import java.util.Map;

public class Event3 extends Event{
    public Event3(LocalDateTime time, Map<String, String> context) {
        super("type3", time, context);
    }

    @Override
    public void action() {
        String email = getContext().get("email");
        // какая-то большая проверка с регулярным выражением
        System.out.println("Провалидирована почта: " + email);
    }
}
