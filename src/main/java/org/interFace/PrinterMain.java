package org.interFace;

public class PrinterMain {
    public static void main(String[] args) {
        Printer<String> printer= a->System.out.println(a+" printing");
        printer.print("Main printer");
    }
}
