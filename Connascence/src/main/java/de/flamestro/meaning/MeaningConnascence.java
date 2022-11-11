package de.flamestro.meaning;

import java.util.Map;

public class MeaningConnascence {

    static Map<Integer, String> errorCodes = Map.of
            (1, "Fatal Error",
            2, "Not so fatal error");

    public static String mapErrorCodeToMessage(int errorCode) {
        return errorCodes.get(errorCode);
    }
}




