public class MyThread extends Thread {
    private static final int FLOW_DELAY_TIME = 2500;

    MyThread(ThreadGroup groupA, String name) {
        super(groupA, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(FLOW_DELAY_TIME);
                System.out.printf("Я %s,Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {
        }

    }
}
