package com.djsongs.design_patterns.state;

/**
 * author : dengjiejie
 * date : 2020/7/30 7:49 下午
 * description :
 */
public enum StateClasses implements StateEx {

    STATEA{
        @Override
        public void print() {
            System.out.println("STATEA");
        }
    },
    STATEB{
        @Override
        public void print() {
            System.out.println("STATEB");
        }
    };
}
