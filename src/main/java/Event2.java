import java.time.LocalDateTime;
import java.util.Map;

public class Event2 extends Event{
    public Event2(LocalDateTime time, Map<String, String> context) {
        super("type2", time, context);
    }

    @Override
    public void action() {
        String info = getContext().get("info");
        // делаем вид, будто отправляем на почту
        System.out.println("Отправили на почту: " + info);
    }
}
