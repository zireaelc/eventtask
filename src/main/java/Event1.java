import java.time.LocalDateTime;
import java.util.Map;

public class Event1 extends Event{
    public Event1(LocalDateTime time, Map<String, String> context) {
        super("type1", time, context);
    }

    @Override
    public void action() {

    }
}
