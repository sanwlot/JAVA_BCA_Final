
// 17. Write a program to demonstrate multi-threading in JAVA.

class Multithread extends Thread {
  private int threadNumber;

  Multithread(int threadNumber) {
    this.threadNumber = threadNumber;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + " from thread number: " + threadNumber);

      // slowing down the execution by 1 sec (optional)
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    Multithread multithread1 = new Multithread(1);
    Multithread multithread2 = new Multithread(2);

    // we need to use .start() instead of .run() to get the multithreading feature
    multithread1.start();
    multithread2.start();
  }
}