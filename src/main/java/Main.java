import java.time.LocalDateTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EventHandler handler = new EventHandlerImpl();

        Event event1 = new Event1(LocalDateTime.now().minusMinutes(10), Map.of("ключ1", "значение1"));
        Event event2 = new Event2(LocalDateTime.now().minusMinutes(5), Map.of("info", "информация"));
        Event event3 = new Event3(LocalDateTime.now().minusMinutes(2), Map.of("email", "example@mail.com"));
        Event event4 = new Event4(LocalDateTime.now().minusMinutes(1), Map.of("phone", "88005553535"));

        handler.handle(event1);
        handler.handle(event2);
        handler.handle(event3);
        handler.handle(event4);
    }
}
