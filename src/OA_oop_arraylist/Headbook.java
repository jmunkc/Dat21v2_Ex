package OA_oop_arraylist;

import java.util.ArrayList;

public class Headbook {

    public void runHeadbook(){
        ArrayList<HeadbookUser> users = new ArrayList<>();
        HeadbookMenu menu = new HeadbookMenu();
        HeadbookUser user = new HeadbookUser(null, null, null, null);

        // TEST USERS
        HeadbookUser user001 = new HeadbookUser("Lars", "lars@headbook.com", "dåsetun", null);
        HeadbookUser user002 = new HeadbookUser("Kevin", "kevin@headbook.com", "dåsetomat", null);
        HeadbookUser user003 = new HeadbookUser("Michael", "michael@headbook.com", "dåseananas", null);
        HeadbookUser user004 = new HeadbookUser("Joachim", "joachim@headbook.com", "dåseallan", null);

        users.add(user001);
        users.add(user002);
        users.add(user003);
        users.add(user004);

        System.out.println(users);

        menu.presentLogInMenu();

        int j = menu.fetchInput();

        boolean quit = false;

        switch(j){

            case 1:

                HeadbookUser myProfile = user.createUser();

                while (quit == false){
                    menu.presentHeadbookMenu();

                    int i = menu.fetchInput();

                    switch (i){

                        case 1:
                            myProfile.searchUsers(users);
                            break;

                        case 2:
                            myProfile.addToFriendsList(users);
                            break;

                        case 3:
                            if(myProfile.friends.size() < 1){
                                System.out.println("You have no friends. Loser.");
                            }
                            else {
                                myProfile.displayAllFriends();}
                            break;

                        case 4:
                            quit = true;
                            break;
                    }
                }

                break;

            case 2:
                break;
        }
    }
}
