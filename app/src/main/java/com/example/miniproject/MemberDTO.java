package com.example.miniproject;

import java.util.ArrayList;

public class MemberDTO {


    private String id, pw, address;
    static private int money;




    public MemberDTO(String id, String pw, String address, int money) {
        this.id = id;
        this.pw = pw;
        this.address = address;
        this.money = money;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        MemberDTO.money = money;
    }


}
