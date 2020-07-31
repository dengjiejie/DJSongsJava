package com.djsongs.design_patterns.state;

/**
 * author : dengjiejie
 * date : 2020/7/30 7:47 下午
 * description :
 */
public class StateMain {


    public static void main(String[] args) {
        StateControl stateControl = new StateControl();
        stateControl.switchA();
        stateControl.print();
        stateControl.switchB();
        stateControl.print();
    }

    public static class StateControl{
        private StateClasses stateClasses;

        public void switchA() {
            stateClasses = StateClasses.STATEA;
        }

        public void switchB() {
            stateClasses = StateClasses.STATEB;
        }

        public void print() {
            stateClasses.print();
        }
    }







}
