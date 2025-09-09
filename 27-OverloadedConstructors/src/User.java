public class User {
    String username;
    String email;
    int age;

    // Constructor for username and age (email defaults)
    User(String username, int age) {
        this.username = username;
        this.email = "default@example.com";
        this.age = age;
    }

    // Constructor for username and email (age defaults to 0)
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    // Constructor for all three fields
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // Default constructor
    User() {
        this.username = "Guest";
        this.email = "default@example.com";
        this.age = 0;
    }
}
