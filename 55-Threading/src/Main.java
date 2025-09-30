void main() {

    // Threading -> Allows a program to run multiple task simuntaneously
    //              Helps improve performance with time-consuming operations
    //              (File I/O, network communications, or any background tasks)

    // How to create a thread
    // Option 1 : Extend the thread class (simpler)
    // Option 2 : Implement the runnable interface (better)

    Scanner scanner = new Scanner(System.in);
    myRunnable runnable = new myRunnable();
    Thread thread = new Thread(runnable);
    thread.setDaemon(true);
    thread.start();

    System.out.println("Enter your name within 5 seconds: ");
    System.out.print("Enter your name : ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);

    scanner.close();

}
