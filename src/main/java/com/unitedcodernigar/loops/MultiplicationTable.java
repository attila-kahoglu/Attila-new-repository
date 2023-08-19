package com.unitedcodernigar.loops;

import io.netty.channel.epoll.EpollServerChannelConfig;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                int multiply=i*j;
                System.out.print(String.format("%d * %d = %d\t",i,j,multiply));
            }
            System.out.println();
        }
    }
}
