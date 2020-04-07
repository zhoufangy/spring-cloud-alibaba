package com.sandsea.orderconsumer.filter;

import com.google.common.collect.Lists;
import com.sandsea.model.User;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ZhouFangyuan on 2020-03-21.
 * Time: 01:03
 * Information:
 */

public class FilteringUsers {

    public static void main(String[] args) {
        f();
        /*List<User> userList = Arrays.asList(
                new User().setId("1").setUsername("user1").setPassword("12345").setIsDelete(1),
                new User().setId("2").setUsername("user13").setPassword("12345").setIsDelete(0),
                new User().setId("9").setUsername("user14").setPassword("12345").setIsDelete(1),
                new User().setId("4").setUsername("user15").setPassword("12345").setIsDelete(0),
                new User().setId("5").setUsername("user16").setPassword("12345").setIsDelete(1),
                new User().setId("6").setUsername("user6").setPassword("12345").setIsDelete(0)
                );
        List<User> deleteUsers = filterUsers(userList, FilteringUsers::isDelete);
        System.out.println(deleteUsers);
        List<User> delUsers = userList.stream().filter((User u) -> u.getIsDelete()>0).collect(toList());
        System.out.println(delUsers);
        userList.sort(Comparator.comparing(User::getId));
        System.out.println(userList);*/
    }

    public static boolean isDelete(User user) {
        return 1 == user.getIsDelete();
    }

    public static List<User> filterUsers(List<User> users, Predicate<User> p) {
        List<User> result = Lists.newArrayList();
        for (User u : users) {
            if (p.test(u)) {
                result.add(u);
            }
        }
        return result;
    }


    public static void f() {
        String[] a = new String[2];
        Object[] b = a;
        a[0] = "hi";
        b[1] = Integer.valueOf(42);
    }


}
