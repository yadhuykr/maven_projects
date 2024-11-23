package org.interFace;

public class FoodMain {
    public static void main(String[] args) {
        FoodProcessor<String,String> fp = (b)->b+" Samosa ready";
        System.out.println(fp.process("Aloo"));
        System.out.println(fp.process("Onion"));
        System.out.println(fp.process("Chicken"));
    }
}
