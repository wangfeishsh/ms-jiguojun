package com.bao.config;

import com.bao.socket.MySocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by baochunyu on 2017/8/12.
 */
public class InitServer implements CommandLineRunner {

    @Autowired
    MySocketServer mySocketServer;

    @Override
    public void run(String... strings) throws Exception {
        mySocketServer.run();
    }
}
