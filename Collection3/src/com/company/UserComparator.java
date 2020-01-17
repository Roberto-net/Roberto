package com.company;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getMoney()-u2.getMoney();
    }


}
