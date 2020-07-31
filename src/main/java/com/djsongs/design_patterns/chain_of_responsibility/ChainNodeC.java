package com.djsongs.design_patterns.chain_of_responsibility;

/**
 * author : dengjiejie
 * date : 2020/7/30 8:40 下午
 * description :
 */
public class ChainNodeC extends ChainNode {
    private ChainNodeC mNextNode;

    public ChainNodeC(ChainNode chainNode) {
        super(chainNode);
    }

    public ChainNodeC() {
        super();
    }

    public void setmNextNode(ChainNodeC mNextNode) {
        this.mNextNode = mNextNode;
    }

    @ChainLevel
    public int getNodeLevel() {
        return ChainLevel.THIRD;
    }
    public void handle(RequestConfig config) {
        config.addmString( " " + this.getClass().getSimpleName());
        System.out.println(config.getmString());
    }

}
