package com.djsongs.java.grammar;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {

    List<Test<Model>> tests = new ArrayList<>();

    public static void main(String[] args) {

        JavaTest javaTest = new JavaTest();
        javaTest.insert(new Model("1231565667546453"));
        javaTest.insert(new Model("fdggfhgj"));
        javaTest.insert(new Model("123ukujyhtgf1565667546453"));
        for (Test<Model> t : javaTest.tests) {
            System.out.println(t.get().s);
        }
    }

    public void insert(Model model) {
        tests.add(new Test() {
            @Override
            Model get() {
                return model;
            }
        });
    }

    public static class Model{
        String s = "shsshhss";
        public Model(String haha) {
            s = haha;
        }
    }

    public abstract class Test<T>{
        T get(){
            return null;
        };
    }

}
