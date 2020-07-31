package com.djsongs.design_patterns.chain_of_responsibility;

/**
 * author : dengjiejie
 * date : 2020/7/30 8:40 下午
 * description :
 */
public class ChainNodeB extends ChainNode {
    private ChainNodeB mNextNode;

    public ChainNodeB(ChainNode chainNode) {
        super(chainNode);
    }

    public void setmNextNode(ChainNodeB mNextNode) {
        this.mNextNode = mNextNode;
    }

    @ChainLevel
    public int getNodeLevel() {
        return ChainLevel.SECOND;
    }
    public void handle(RequestConfig config) {
        config.addmString( " " + this.getClass().getSimpleName());
        System.out.println(config.getmString());
    }

}
