package com.djsongs.design_patterns.chain_of_responsibility;

/**
 * author : dengjiejie
 * date : 2020/7/30 8:40 下午
 * description :
 */
public abstract class ChainNode {
    private ChainNode mNextNode;

    public ChainNode() {

    }

    public ChainNode(ChainNode chainNode) {
        mNextNode = chainNode;
    }

    public final void handleRequest(RequestConfig config) {
        if (config.getmLevel() > getNodeLevel()) {
            handle(config);
        }
        if (mNextNode != null) {
            mNextNode.handleRequest(config);
        }

    }

    public abstract int getNodeLevel();
    public void handle(RequestConfig config) {
        config.addmString( " " + this.getClass().getSimpleName());
        System.out.println(config.getmString());
    }

}
