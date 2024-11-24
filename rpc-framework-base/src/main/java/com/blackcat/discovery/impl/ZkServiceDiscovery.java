package com.blackcat.discovery.impl;

import com.blackcat.discovery.ServiceDiscovery;
import com.blackcat.remoting.entity.RpcRequest;

import java.net.InetSocketAddress;

public class ZkServiceDiscovery implements ServiceDiscovery {
    @Override
    public InetSocketAddress findService(RpcRequest rpcRequest) {
        return null;
    }
}
