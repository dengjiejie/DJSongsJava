package com.djsongs.design_patterns.chain_of_responsibility;

/**
 * author : dengjiejie
 * date : 2020/7/30 8:46 下午
 * description :
 */
public class RequestConfig {

    public String getmString() {
        return mString;
    }

    public void addmString(String mString) {
        this.mString += mString;
    }

    private String mString = "Now ChainNode: ";

    @ChainLevel
    private int mLevel;

    @ChainLevel
    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(@ChainLevel int mLevel) {
        this.mLevel = mLevel;
    }

}
