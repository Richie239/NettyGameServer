package com.wolf.shoot.service.net;

import java.net.InetSocketAddress;

/**
 * Created by jwp on 2017/2/4.
 * 抽象的tcp服务
 */
public abstract class AbstractTcpServerService extends  AbstractServerService{

    protected int serverPort;
    protected InetSocketAddress serverAddress;


    public AbstractTcpServerService(String serviceId, int serverPort) {
        super(serviceId);
        this.serverPort = serverPort;
        this.serverAddress = new InetSocketAddress(serverPort);
    }
}
