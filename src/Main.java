import java.util.ArrayList;

public class Main {
    private static ArrayList<MyThread> myThreads = new ArrayList<>();
    private static final int THREAD_STOP_TIME = 10000;
    private static final int NUMBER_OF_THREADS = 5;
    private static ThreadGroup groupA = new ThreadGroup("Group A");

    public static void main(String[] args) {
        System.out.println("Старт потоков");
        creatingStreams();
        namingAndStartingStreams();
        stoppingStreams(THREAD_STOP_TIME);
    }

    private static void creatingStreams() {
        for (int i = 1; i < NUMBER_OF_THREADS; i++) {
            myThreads.add(new MyThread(groupA, "MyThread " + i));
        }
    }

    private static void namingAndStartingStreams() {
        int i = 1;
        for (MyThread myThread : myThreads) {
            myThread.setName("Поток " + i);
            myThread.start();
            i++;
        }
    }

    private static void stoppingStreams(int THREAD_STOP_TIME) {
        try {
            Thread.sleep(THREAD_STOP_TIME);
            groupA.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("завершаю все потоки");
    }

}
