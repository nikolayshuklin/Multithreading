public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if ( i % 10 == 0 ) System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int n = 0; n < 3; n ++) {
            new Thread(new MyThread()).start();
        }
    }
}
