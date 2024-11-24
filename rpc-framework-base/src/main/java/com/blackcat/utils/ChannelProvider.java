package com.blackcat.utils;

import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * channel池
 *
 * @author fjw
 * @since 24.11.22
 */
public class ChannelProvider {
    private static final Map<String, Channel> CHANNEL_MAP = new ConcurrentHashMap<>();

    public static Channel getChannel(InetSocketAddress address) {
        return CHANNEL_MAP.get(address.toString());
    }

    public static void addChannel(InetSocketAddress address, Channel channel) {
        CHANNEL_MAP.put(address.toString(), channel);
    }

    public static void removeChannel(Channel channel) {
        // TODO 如何保证并发下：正确删除，如何实现在add时根据active情况删除
        CHANNEL_MAP.remove(channel.remoteAddress().toString());
    }
}
