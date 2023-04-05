package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        //return new ContextualLogger(name, new ConsoleLogger());
        //return new ContextualLogger(name, new FileLogger("/home/aymen-lahouel/mylog.txt"));
        return new ContextualLogger(name, new CompositeLogger(new ConsoleLogger(), new FileLogger("/home/aymen-lahouel/mylog.txt")));
    }
}

