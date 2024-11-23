package org.interFace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GamePlay {
    public static void main(String[] args) {
        IGame game =(a,b)-> Math.random()>0.5?a:b;
        System.out.println(game.play("ManC", "Tottenham"));
        game.noShow();

        List<String> list= Arrays.asList("Abc","Adc","bcf","anm","amd","zwe");
        List<String> guest=new ArrayList<>(list);
        System.out.println(guest);
        list.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(list);
        guest.removeIf(a->a.startsWith("A"));
        System.out.println(guest);
    }
}
