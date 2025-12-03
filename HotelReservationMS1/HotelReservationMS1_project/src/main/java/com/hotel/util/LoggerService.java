package com.hotel.util;

import java.io.IOException;
import java.util.logging.*;

public class LoggerService {

    private static final Logger logger = Logger.getLogger("HotelLogger");
    private static boolean initialized = false;

    public static Logger getLogger() {
        if (!initialized) {
            setup();
            initialized = true;
        }
        return logger;
    }

    private static void setup() {
        logger.setUseParentHandlers(false);
        try {
            FileHandler fileHandler = new FileHandler("system_logs.%g.log",
                    1024 * 1024, 10, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
