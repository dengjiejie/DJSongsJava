package com.djsongs.design_patterns.chain_of_responsibility;

/**
 * author : dengjiejie
 * date : 2020/7/30 8:34 下午
 * description :
 */
public class ChainMain {

    public static void main(String[] args) {
        ChainNodeA nodeA = new ChainNodeA(new ChainNodeB(new ChainNodeC()));
        RequestConfig config = new RequestConfig();
        config.setmLevel(ChainLevel.FOUTH);
        nodeA.handleRequest(config);
    }
}
