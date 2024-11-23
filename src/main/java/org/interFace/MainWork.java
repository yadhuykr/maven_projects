package org.interFace;

public class MainWork{
    public static void main(String[] args) {
        Work work=new Work() {
            @Override
            public void work() {
                System.out.println(" First job");
            }

            @Override
            public double getPaid(int hours, double wage) {
                return hours*wage;
            }
        };

        work.work();
        System.out.println(work.getPaid(8, 30));


        Work work2=new Work() {
            @Override
            public void work() {
                System.out.println("Extra hours");
            }

            @Override
            public double getPaid(int hours, double wage) {
                return hours*wage*1.5;
            }
        };
        work2.work();
        System.out.println(work2.getPaid(3, 30));

        int test=10;


    }
}
