package singletonlogger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {
    private static final SingletonLogger singletonLogger = new SingletonLogger();

    private SingletonLogger() {
    }

    public static SingletonLogger getInstance() {
        return singletonLogger;
    }

    public void log(Object obj, String info) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println("Log info: "
                + LocalDate.now().format(pattern)
                + " - "
                + obj.getClass().getName()
                + " - "
                + info);
    }
}
