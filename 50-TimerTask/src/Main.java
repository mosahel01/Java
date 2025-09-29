void main() {

    // Timer -> Class that schedules tasks at specific times or periodically
    //         Useful for: sending notifications, schedules updates, repetitive actions.

    // TimerTasks -> Represents the task that will be executed by the Timer
    //               You will extend your timetask class to define your task
    //                Create a subclass of TimerClass and @Override run()

    Timer timer = new Timer();
    TimerTask timertask = new TimerTask() {

        int count = 3;

        @Override
        public void run() {
            System.out.println("Hello!");
            count--;
            if (count <= 0) {
                System.out.println("Tasks Completed");
                timer.cancel();
            }
        }
    };

    timer.schedule(timertask, 0, 1000);


}
