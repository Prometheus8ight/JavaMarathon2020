package day11.task1;

public class Task1 {
    public static void main(String[] args){
        Warehouse warehouse1 = new Warehouse();
        Worker picker1 = new Picker(warehouse1);
        Worker courier1 = new Courier(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Worker picker2 = new Picker(warehouse2);
        Worker courier2 = new Courier(warehouse2);

        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(warehouse1);

        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(picker2);
        System.out.println(courier2);
        System.out.println(warehouse2);



    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10001; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
