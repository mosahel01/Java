public class Fish implements Prey, Predator {

    @Override
    public void flee() {
        System.out.println("smaller fish flees bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("bigger fish hunts smaller  fish");
    }

}
