package org.interFace;

public interface IGame {
    String play(String teamA,String teamB);
    default void noShow(){
        System.out.println("No game");
    }
}
