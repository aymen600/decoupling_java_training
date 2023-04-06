package fr.lernejo.logger;

import java.util.function.Predicate;


public class LoggerFactory {
    public static Logger getLogger(String name) {
        //return new ContextualLogger(name, new ConsoleLogger());
        //return new ContextualLogger(name, new FileLogger("/home/aymen-lahouel/mylog.txt"));

        //return new ContextualLogger(name, new CompositeLogger(new ConsoleLogger(), new FileLogger("/home/aymen-lahouel/mylog.txt")));
        Predicate<String> condition = message -> message.contains("simulation");
        Logger filteredLogger = new FilteredLogger(new FileLogger("/home/aymen-lahouel/mylog.txt"), condition);
        return new ContextualLogger(name, new CompositeLogger(new ConsoleLogger(), filteredLogger));
    }
}


