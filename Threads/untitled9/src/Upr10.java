public class Upr10 {
    public static void main(String[] args) throws Exception {
     Worker worker = new Worker();
     Runner1 r1 = new Runner1();
     Runner2 r2 = new Runner2();
     Thread t1 = new Thread(worker);
     Thread t2 = new Thread(r1);
     Thread t3 = new Thread(r2);
     t1.start();
     t2.start();
     t3.start();
    }
}
