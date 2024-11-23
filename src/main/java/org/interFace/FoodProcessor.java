package org.interFace;

@FunctionalInterface
public interface FoodProcessor <T,U> {
    U process(T t);

}
