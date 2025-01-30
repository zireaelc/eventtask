import java.time.LocalDateTime;
import java.util.Map;

public abstract class Event {
    private final String type;
    private final LocalDateTime time;
    private final Map<String, String> context;

    public Event(String type, LocalDateTime time, Map<String, String> context) {
        this.type = type;
        this.time = time;
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Map<String, String> getContext() {
        return context;
    }

    public abstract void action();
}
