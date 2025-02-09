import java.time.Duration;
import java.time.LocalDateTime;

public abstract class AbstractHandler implements ILogging {
    @Override
    public void globalProcess(Event event){
        System.out.println("Тип события: " + event.getType());
        System.out.println("Время события: " + event.getTime());
        System.out.println("Ключи контекста: " + event.getContext());

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(event.getTime(), now);
        System.out.println("Время между событием и текущим: " + duration.toMillis() + " мс");

        childProcess(event);

        System.out.println("Событие обработано \n");
    }

    @Override
    public int getEventNumber(Event event) {
        return event.getType();
    }

    protected abstract void childProcess(Event event);
}
