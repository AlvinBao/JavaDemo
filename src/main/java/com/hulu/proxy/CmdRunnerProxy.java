package com.hulu.proxy;

public class CmdRunnerProxy implements CommandRunner {

    private boolean isAdmin;
    private CommandRunner runner;

    public CmdRunnerProxy(String user, String password) {
        if ("admin".equals(user) && "fdsfdsfs".equals(password)) {
            isAdmin = true;
        }

        runner = new CommandRunnerImpl();
    }

    @Override
    public void run(String cmd) throws Exception {
        if (isAdmin) {
            runner.run(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("Invalid cmd: " + cmd);
            } else {
                runner.run(cmd);
            }
        }
    }
}
