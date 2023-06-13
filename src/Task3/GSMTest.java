package Task3;

import java.math.BigDecimal;

public class GSMTest {

    public static void main(String[] args) {
        GSM a = new GSM();
        GSM b = new GSM();
        GSM c = new GSM();

        Battery aB = new Battery();
        Battery bB = new Battery();
        Battery cB = new Battery();

        Display aD = new Display();
        Display bD = new Display();
        Display cD = new Display();

        a.model = "S22";
        a.manufacturer = "Samsung";
        a.price = BigDecimal.valueOf(1499.99);
        a.totalCallNumber = 20;
        a.battery = aB;
        a.display = aD;

        aB.model = "fpr-V160";
        aB.idleTime = 120;
        aB.phoneUsageTime = 80;
        aD.displaySize = 6;
        aD.displayColors = 160000;

        b.model = "13";
        b.manufacturer = "Iphone";
        b.price = BigDecimal.valueOf(3499.99);
        b.totalCallNumber = 12;
        b.battery = bB;
        b.display = bD;

        bB.model = "zqr-P560";
        bB.idleTime = 245;
        bB.phoneUsageTime = 520;
        bD.displaySize = 5;
        bD.displayColors = 360000;

        c.model = "Pixel 7";
        c.manufacturer = "Google";
        c.price = BigDecimal.valueOf(799.99);
        c.totalCallNumber = 50;
        c.battery = cB;
        c.display = cD;

        cB.model = "rpa-L260";
        cB.idleTime = 320;
        cB.phoneUsageTime = 120;
        cD.displaySize = 6;
        cD.displayColors = 560000;

        GSM [] phones = {a, b, c};

        for (GSM gsm : phones) {
            gsm.call(15);
            gsm.printPhoneDetailInformation();
        }

    }

}
