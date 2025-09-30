void main() {

    // Multithreading -> Enable a program to run multiple threads simultaneously
    //                   (Thread - A set of instructions that run  independently)
    //                   Useful for background tasks or time-consuming operations

    Thread thread1 = new Thread(new MyRunnable("PING"));
    Thread thread2 = new Thread(new MyRunnable("PONG"));

    // thread1.setDaemon(true);
    // thread2.setDaemon(true);

    IO.println("GAME STARTS");

    thread1.start();
    thread2.start();

    try {
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        IO.println("Main thread was interrupted");
    }

    IO.println("GAME ENDS");
}
