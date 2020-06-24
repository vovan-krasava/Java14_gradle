package com.wrapper;

import com.service.Logger;

public class LogWrapper {
    Logger logWrap = new Logger();

    public void log(Object s) {
        logWrap.print(s);
    }

}
