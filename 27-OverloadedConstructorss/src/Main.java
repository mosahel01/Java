public class Main {
    public static void main(String[] args) {
        // Overloaded Constructors -> Allow a Class to have multiple Constructors
        // with different params list, enabling objects to initialised in various ways

        User user1 = new User("Spongebob", 23);
        User user2 = new User("Spaghetti", "Italian@Mafia.com");
        User user3 = new User("Mos", "dawood@ibrahim.com", 21);
        User user4 = new User("Spongebob", 23);

        System.out.print(user1.username + ", ");
        System.out.print(user1.email + ", ");
        System.out.println(user1.age);

        System.out.print(user2.username + ", ");
        System.out.print(user2.email + ", ");
        System.out.println(user2.age);

        System.out.print(user3.username + ", ");
        System.out.print(user3.email + ", ");
        System.out.println(user3.age);

        System.out.print(user4.username + ", ");
        System.out.print(user4.email + ", ");
        System.out.println(user4.age);

    }
}
