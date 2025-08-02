public class User {

    String username;
    String email;
    int age;

    User() {
        this.username = "Guest";
        this.email = "Default User";
        this.age = 0;
    }

    User(String username) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = "User with Mail";
        this.age = age;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = "User with Mail n Age";
        this.age = 69;
    }

}
