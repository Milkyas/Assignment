package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by owner on 7/4/2016.
 */
public class UserDB {
    /*
        private static ArrayList<User> users = new ArrayList<User>();

        public static ArrayList<User> getUsers() { return users;}

        public static void setUsers(ArrayList<User> users){UserDB.users= users;}
    */
    private static LinkedList<User> users = new LinkedList<User>();
    public static LinkedList<User> getUsers(){return users;};
    Iterator<User> roll = users.iterator();

    public Iterator<User> getRoll() {
        return roll;
    }


    //     Users user= users.add(new User("I'm lost!"));

    }