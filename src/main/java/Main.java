import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Event event1 = new Event(1, LocalDateTime.now().minusMinutes(10), Map.of("ключ1", "значение1"));
        Event event2 = new Event(2, LocalDateTime.now().minusMinutes(5), Map.of("info", "информация1"));
        Event event3 = new Event(3, LocalDateTime.now().minusMinutes(2), Map.of("email", "example1@mail.com"));
        Event event4 = new Event(4, LocalDateTime.now().minusMinutes(1), Map.of("phone", "88005553535"));
        Event event5 = new Event(8, LocalDateTime.now().minusMinutes(15), Map.of("ключ1", "значение2"));
        Event event6 = new Event(2, LocalDateTime.now().minusMinutes(10), Map.of("info", "информация2"));
        Event event7 = new Event(3, LocalDateTime.now().minusMinutes(1), Map.of("email", "example2@mail.com"));
        Event event8 = new Event(4, LocalDateTime.now().minusMinutes(2), Map.of("phone", "88005553536"));

        var events = List.of(event1, event2, event3, event4, event5, event6, event7, event8);

        var handler1 = new Handler1();
        var handler2 = new Handler2();
        var handler3 = new Handler3();
        var handler4 = new Handler4();

        var handlers = List.of(handler1, handler2, handler3, handler4);

        events.forEach(event -> {
            int type = event.getType();
            if (type > 0 && type <= handlers.size()) {
                AbstractHandler handler = handlers.get(type - 1);
                handler.globalProcess(event);
            } else {
                System.out.println("Невалидный тип события: " + type + "\n");
            }
        });
    }
}
