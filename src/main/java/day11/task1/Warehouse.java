package day11.task1;

public class Warehouse {
    public int countPickedOrders;
    public int countDeliveredOrders;

    public String toString() {
        return countDeliveredOrders + ", " + countPickedOrders + ".";
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void plusPickedOrders(){
        countPickedOrders++;
    }

    public void plusDeliveredOrders(){
        countDeliveredOrders++;
    }
}
