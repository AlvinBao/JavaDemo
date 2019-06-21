package com.hulu.proxy;

import java.io.IOException;

public class CommandRunnerImpl implements CommandRunner {
    @Override
    public void run(String cmd) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(cmd);
            System.out.println("Executed: " + cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
