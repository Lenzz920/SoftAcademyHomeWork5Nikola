package Task3;

import java.math.BigDecimal;

public class GSM {

    String model;
    String manufacturer;
    BigDecimal price = BigDecimal.valueOf(0);
    int totalCallNumber;
    Battery battery;
    Display display;

    public void call(int seconds) {
        totalCallNumber++;
        battery.phoneUsageTime = battery.phoneUsageTime + seconds;
    }

    public void printPhoneDetailInformation() {
        System.out.println("The model of the phone is: " + model + ", ");
        System.out.println("The manufacturer of the phone is: " + manufacturer + ", ");
        System.out.println("The price of the phone is: " + price + ", ");
        System.out.println("The total number of calls of the phone is: " + totalCallNumber + ", ");
        System.out.println("The battery model of the phone is: " + battery.model + ", ");
        System.out.println("The idle time of the batter of the phone is: " + battery.idleTime + ", ");
        System.out.println("The phone usage of the phone is: " + battery.phoneUsageTime + ", ");
        System.out.println("The display size of the phone is: " + display.displaySize + ", ");
        System.out.println("The display colors of the phone are: " + display.displayColors);
        System.out.println();
    }

}
