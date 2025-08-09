public class Friend {

    static int NumOfFriend;
    String name;

    Friend(String name) {
        this.name = name;
        NumOfFriend++;
    }

    static void showFriends() {
        System.out.println("You have " + NumOfFriend + " Friends");
    }

}
