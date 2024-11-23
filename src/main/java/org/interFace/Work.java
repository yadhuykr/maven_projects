package org.interFace;

public interface Work {
    default void work(){
        System.out.println("Daywork");
    }
    double getPaid(int hours, double wage);
}
