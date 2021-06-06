package oa_oop_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadbookUser {

   // Attributes
   private String userName, eMail, password;

   ArrayList<HeadbookUser> friends = new ArrayList<>();
   private Scanner in = new Scanner(System.in);
   // Constructor

   public HeadbookUser(String nameOfUser, String mailOfUser, String passwordOfUser, ArrayList friendsOfUser){
      this.userName = nameOfUser;
      this.eMail = mailOfUser ;
      this.password = passwordOfUser;
      this.friends = new ArrayList<>();

   }
   // Getters

   public String getUserName(){return userName;}

   public String getEMail(){return eMail;}

   public String getPassword(){return password;}

   public ArrayList<HeadbookUser> getFriends() {return friends;}


   // Setters
   public void setUserName(String name) {
      this.userName = name;
   }

   public void setEMail(String mail) {
      this.eMail = mail;
   }

   public void setPassword(String pass) {
      this.password = pass;
   }

   public void setFriends(ArrayList<HeadbookUser> listOfFriends) {this.friends = listOfFriends; }


   // Create a new headbook user
   public HeadbookUser createUser(){
      HeadbookUser user = new HeadbookUser(null, null,null, friends);

      System.out.println("Set your username: ");
      user.setUserName(in.nextLine());
      System.out.println("Set your email: ");
      user.setEMail(in.nextLine());
      System.out.println("Set your password: ");
      user.setPassword(in.nextLine());
      user.setFriends(friends);


      return user;
   }


   // Search headbook users
   public HeadbookUser searchUsers(ArrayList<HeadbookUser> users){


      System.out.println("Type in the username you want to search for [Must be exact match]:");
      String target = in.nextLine();

      int targetIndex = 0;

      for(int i = 0; i < users.size(); i++){
         String isTarget = users.get(i).getUserName();

         if(isTarget.equals(target)){
            targetIndex = i;
         }
      }
      HeadbookUser foundUser = users.get(targetIndex);

      System.out.println("You found " + foundUser.toString());
      return foundUser;
   }


   // Adds a headbook user to arraylist friends
   public void addToFriendsList(ArrayList<HeadbookUser> users){

      HeadbookUser friendToAdd = searchUsers(users);

      System.out.println("Would you lik to add " + friendToAdd.getUserName() + " to yout friend list yes/no?");

      String answer = in.nextLine();

      if(answer.equals("yes")){
         friends.add(friendToAdd);
         System.out.println("You added " + friendToAdd.getUserName() + " to your friend list.");
      }

   }

   // Displays friends list of a headbook user
   public void displayAllFriends(){

      System.out.println("Here are your friends:");

      for (int i = 0; i < friends.size(); i++){
         System.out.println(friends.get(i).toString());
      }
   }


   @Override
   public String toString() {
      return "User: [" + this.userName + "]" + " E-Mail: [" + this.eMail + "]";
   }

   @Override
   public boolean equals(Object otherUser){
      HeadbookUser user = (HeadbookUser)otherUser;
      if(this.userName.equals(user.getUserName())){
         return true;
      }
      else{
         return false;
      }
   }


}
