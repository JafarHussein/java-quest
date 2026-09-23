public class Friend {

    String name;

    static int numOfFriends;

    Friend(String name){
        this.name=name;
        numOfFriends++;
    }

    void showFriends(){
        System.out.printf("You have %d friends", numOfFriends);
    }
    
}
