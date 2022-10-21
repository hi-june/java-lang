package com.hi_june.choi.ch16;

class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

class UniFriend extends Friend{
    private String major;

    public UniFriend(String name, String major, String phone) {
        super(name, phone);
        this.major = major;

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

class CompFriend extends Friend{
    private String department;

    public CompFriend(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        Friend[] friends = new Friend[4];

        friends[0] = new UniFriend("LEE", "Computer", "010-999-9999");
        friends[1] = new UniFriend("KIM", "Social", "010-888-8888");
        friends[2] = new CompFriend("LEE", "Dev", "010-777-7777");
        friends[3] = new CompFriend("KIM", "Market", "010-666-6666");

        for (Friend f: friends) {
            f.showInfo();
            System.out.println();
        }
    }
}
