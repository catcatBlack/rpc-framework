package com.blackcat.discovery;

import com.blackcat.remoting.entity.RpcRequest;

import java.net.InetSocketAddress;

@SPI
public interface ServiceDiscovery {
    /**
     * 查找服务
     *
     * @param rpcRequest request
     * @return service address
     */
    InetSocketAddress findService(RpcRequest rpcRequest);
}
