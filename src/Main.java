
public class Main {

    public static void main(String[] args) {

        System.out.println("Старт потоков");
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        myThread1.setName("Поток 1");
        myThread1.start();
        myThread2.setName("Поток 2");
        myThread2.start();
        myThread3.setName("Поток 3");
        myThread3.start();
        myThread4.setName("Поток 4");
        myThread4.start();
        try {
            Thread.sleep(15000);
            myThread4.interrupt();
            myThread1.interrupt();
            myThread2.interrupt();
            myThread3.interrupt();
            System.out.println("завершаю все потоки");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
