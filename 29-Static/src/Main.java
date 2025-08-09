public class Main {

    public static void main(String[] args) {

        // Static -> makes a Variable/Method belong to the class
        // rather any specific object

        // commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Mooooos");
        Friend friend3 = new Friend("Squid");
        Friend friend4 = new Friend("Narcos");

        System.out.println(Friend.NumOfFriend);
        Friend.showFriends();
        // System.out.println(friend1.NumOfFriend);
        // System.out.println(friend2.NumOfFriend);
        // System.out.println(friend3.NumOfFriend);

    }

}
