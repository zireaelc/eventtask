import java.time.Duration;
import java.time.LocalDateTime;

public class EventHandlerImpl implements EventHandler{
    public void handle(Event event) {
        System.out.println("Тип события: " + event.getType());
        System.out.println("Время события: " + event.getTime());
        System.out.println("Ключи контекста: " + event.getContext());

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(event.getTime(), now);
        System.out.println("Время между событием и текущим: " + duration.toMillis() + " мс");

        // Обрабатываем событие
        event.action();

        // Логируем конец обработки
        System.out.println("Событие обработано");
    }
}
