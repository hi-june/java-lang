package com.java.ch07;

class BankAccount{
    int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref); // '참조 값'의 전달
    }

    public static void check(BankAccount account) { // 참조변수이자 매개변수인 account가 같은 인스턴스를 가리킴
        account.checkMyBalance();
    }
}
