package com.urise.webapp;

import com.urise.webapp.model.SectionType;

import java.util.Arrays;

import static com.urise.webapp.model.SectionType.values;

public class TestSingleton {
    private static TestSingleton instance/* = new TestSingleton()*/; // Not lazy Initialization

    // for single-threaded application
    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();  // Lazy Initialization
        }
        return instance;
    }

    @Override
    public String toString() {
        return "TestSingleton{}";
    }

    private TestSingleton() {
    }

    public static void main(String[] args) {
        String s = getInstance().toString();
        System.out.println(s);
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.ordinal());
        Arrays.stream(SectionType.values())
                .map(SectionType::getTitle)
                .forEachOrdered(System.out::println);

    }

    public enum Singleton {
        INSTANCE
    }
}
