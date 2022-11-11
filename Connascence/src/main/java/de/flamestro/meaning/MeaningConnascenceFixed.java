package de.flamestro.meaning;

import java.util.Map;

public class MeaningConnascenceFixed {

    enum Error {
        FATAL(1, "Fatal Error"),
        NON_FATAL(2, "Not so fatal error");

        int code;
        String message;

        private Error(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}



