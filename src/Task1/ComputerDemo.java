package Task1;

import java.math.BigDecimal;

import static Task1.Computer.printSpecs;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer a = new Computer();
        Computer b = new Computer();

        a.year = 2021;
        a.price = BigDecimal.valueOf(1499.99);
        a.isNotebook = true;
        a.hardDiskMemory = 4000;
        a.freeMemory = 16000;
        a.operatingSystem = "Windows 10";

        b.year = 2022;
        b.price = BigDecimal.valueOf(2499.99);
        b.isNotebook = false;
        b.hardDiskMemory = 8000;
        b.freeMemory = 32000;
        b.operatingSystem = "Windows 11";

        a.useMemory(100);
        b.changeOperationSystem("Ubuntu");

        Computer[] computers = {a, b};

        printSpecs(computers);

    }

}
