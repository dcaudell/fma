package com.xtrafe.server.log;

public class Log {

    public static void out(String message) {
        if (message == null) {
            return;
        }
        StringBuilder outBuffer = new StringBuilder();
        outBuffer.append(new Exception().getStackTrace()[1]);
        outBuffer.append(": ");
        outBuffer.append(message);
        System.out.println(outBuffer.toString());
    }
}
