
class TableThread extends Thread {
    int number;

    TableThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class OddThread extends Thread {

    public void run() {
        System.out.println("Odd Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiTask {
    public static void main(String[] args) {

        TableThread t1 = new TableThread(5);
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}