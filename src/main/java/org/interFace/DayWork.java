package org.interFace;

public interface DayWork {
    default void work(){
        System.out.println("this is second work");
    }
}
