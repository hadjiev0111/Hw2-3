package com.company;

public class Main {

    public static void main(String[] args) {
        boolean b = true;
        BankAccount user = new BankAccount(0);
        user.deposit(10000);
         while (b){
            try {
                System.out.println(user.withDraw(6000));
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    System.out.println(user.withDraw(user.getAmount()));
                    b = false;
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
            }
        }
        System.out.println(user.getAmount());
    }
}
