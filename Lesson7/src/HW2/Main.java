package HW2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("директор");
        Worker worker = new Worker("рабочий");
        Accountant accountant = new Accountant("бухгалтер");
        director.print();
        worker.print();
        accountant.print();
    }
}
