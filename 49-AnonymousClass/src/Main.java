void main() {

    // Anonymous class -> A class that doesn't have a name. Cannot be reused.
    //                    Add custom behaviour without having to create one.
    //                    Often used for one time uses (TimerTasks, Runnable, Callback)

    Dog dog1 = new Dog();
    Dog dog2 = new Dog() {
        void speak() {
            System.out.println("Scobby Doo goes *Ruh Roh*");
        }
    };

    dog1.speak();
    dog2.speak();

}
