package Task1;

import java.math.BigDecimal;

public class Computer {

    int year;
    BigDecimal price = BigDecimal.valueOf(0);
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operatingSystem;

    public void changeOperationSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void useMemory (double memory) {
        if (this.freeMemory > memory) {
            this.freeMemory = freeMemory - memory;
        } else
            System.out.println("Not enough free memory!");
    }

    public static void printSpecs (Computer[] computers) {
        for(Computer computer : computers) {
            System.out.print(computer.year + ", ");
            System.out.print(computer.price + ", ");
            System.out.print(computer.isNotebook + ", ");
            System.out.print(computer.hardDiskMemory + ", ");
            System.out.print(computer.freeMemory + ", ");
            System.out.print(computer.operatingSystem);
            System.out.println();
        }
    }



}
