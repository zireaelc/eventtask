import java.time.LocalDateTime;
import java.util.Map;

public class Event {
    private final int type;
    private final LocalDateTime time;
    private final Map<String, String> context;

    public Event(int type, LocalDateTime time, Map<String, String> context) {
        this.type = type;
        this.time = time;
        this.context = context;
    }

    public int getType() {
        return type;
    }

    public Map<String, String> getContext() {
        return context;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
