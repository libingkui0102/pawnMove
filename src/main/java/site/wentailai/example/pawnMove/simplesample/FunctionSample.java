package site.wentailai.example.pawnMove.simplesample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionSample {
    public static void main(String[] args) {
        FunctionSample obj = new FunctionSample();
        List<User> allUser = obj.getUserList2();
        List<User> list = obj.filterUserList(allUser, x -> x.getAge() > 50);
        List<User> list2 = obj.filterUserList(allUser,
                x -> x.getAge() < 30,
                x -> x.getGender() == 0,
                x -> x.getFee() >= 150
        );
        Function<Predicate<User>, List<User>> filter = obj.filter(allUser);
        List<User> ageGreater30 = filter.apply(x -> x.getAge() >= 30);
        List<User> maleVip = filter.apply(x -> x.getAge() >= 30 && x.getGender() == 0);
        maleVip.stream()
                .forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    public static class User {
        private String name;
        private long fee;
        private int age;
        private int gender;
    }

    List<User> getVipUserList(List<User> list) {
        List<User> vipUserList = new ArrayList<>();
        for(User u : list) {
            if(u.getFee() >= 100) {
                vipUserList.add(u);
            }
        }
        return vipUserList;
    }

    List<User> getVipUserList2(List<User> list, long fee) {
        List<User> vipUserList = new ArrayList<>();
        for(User u : list) {
            if(u.getFee() >= fee) {
                vipUserList.add(u);
            }
        }
        return vipUserList;
    }

    List<User> getYoungUserList(List<User> list, int age) {
        List<User> yountUserList = new ArrayList<>();
        for(User u : list) {
            if(u.getAge() <= age) {
                yountUserList.add(u);
            }
        }
        return yountUserList;
    }

    List<User> getMaleOrFemaleUserList(List<User> list, int gender) {
        List<User> userList = new ArrayList<>();
        for(User u : list) {
            if(u.getGender() == gender) {
                userList.add(u);
            }
        }
        return userList;
    }

    List<User> getYountVipUserList(List<User> list, int age, long fee) {
        List<User> youngVipUserList = new ArrayList<>();
        for(User u : list) {
            if(u.getAge() <= age && u.getFee() >= fee) {
                youngVipUserList.add(u);
            }
        }
        return youngVipUserList;
    }

    List<User> getYountVipUserList(List<User> list, int age, long fee, int gender) {
        List<User> youngVipUserList = new ArrayList<>();
        for(User u : list) {
            if(u.getAge() <= age && u.getFee() >= fee && u.getGender() == gender) {
                youngVipUserList.add(u);
            }
        }
        return youngVipUserList;
    }

    List<User> filterUserList(List<User> list, Predicate<User> predicate) {
        List<User> userList = new ArrayList<>();
        for(User u : list) {
            if(predicate.test(u)) {
                userList.add(u);
            }
        }
        return userList;
    }

    Function<Predicate<User>, List<User>> filter(List<User> list) {
        return predicate -> {
            List<User> userList = new ArrayList<>();
            for(User u : list) {
                if(predicate.test(u)) {
                    userList.add(u);
                }
            }
            return userList;
        };
    }


    List<User> filterUserList(List<User> list, Predicate<User>... predicate) {
        List<User> userList = new ArrayList<>();
        for(User u : list) {
            for(Predicate p : predicate) {
                if(!p.test(u)) {
                    break;
                }
            }
            userList.add(u);
        }
        return userList;
    }

    List<User> xxxList(List<User> list) {
        return filterUserList(list, x -> x.getAge() > 20, x -> x.getFee() >= 100);
    }

    List<User> getUserList2() {
        Random random = new Random();
        return IntStream.range(0, 100)
                .mapToObj(x -> {
                    User u = new User("user" + x, x * 20, 15 + random.nextInt(65), random.nextInt(1));
                    return u;
                })
                .collect(Collectors.toList());
    }

    List<User> getUserList1() {
        Random random = new Random();
        List<User> userList = new ArrayList<>();
        for(int i = 0; i < 100; i ++) {
            User u = new User("user" + i, i * 20, 15 + random.nextInt(65), random.nextInt(1));
            userList.add(u);
        }
        return userList;
    }


}
