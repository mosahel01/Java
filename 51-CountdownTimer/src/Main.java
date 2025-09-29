void main() {

    // Java countdown timer

    Scanner scanner = new Scanner(System.in);
    Timer timer = new Timer();

    System.out.print("Enter the # of seconds to count from: ");
    int response = scanner.nextInt();
    TimerTask task = new TimerTask() {

        int count = response;

        @Override
        public void run() {
            System.out.println(count);
            count--;

            if (count <= 0) {
                System.out.println("Happy New Year!");
                timer.cancel();
            }
        }

        ;
    };

    timer.schedule(task, 0, 1000);


}
