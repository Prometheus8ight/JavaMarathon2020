package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private boolean isPayed;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.plusPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        } else if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
            salary+=70000;
            isPayed = true;

    }
}
