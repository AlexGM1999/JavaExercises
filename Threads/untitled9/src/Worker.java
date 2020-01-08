public class Worker implements Runnable {
    private boolean isTerminated = false;
    public boolean isTerminated() {
        return isTerminated;
    }
    public void setTerminated(boolean terminated) {
        isTerminated = terminated;
    }
    public void run() {
        while (!isTerminated) {
            System.out.println("Hello from worker class ...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
