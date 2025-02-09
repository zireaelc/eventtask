public interface ILogging {

    void globalProcess(Event event);

    int getEventNumber(Event event);
}
