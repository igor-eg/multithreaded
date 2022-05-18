public class MyThread extends Thread {
    private static final int FLOW_DELAY_TIME = 2500;

    MyThread(String name) {
        super(name);
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
