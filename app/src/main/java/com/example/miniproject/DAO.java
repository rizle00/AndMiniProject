package com.example.miniproject;

import java.util.ArrayList;

public class DAO {
    MemberDTO mDto = new MemberDTO();
    ProductDTO pDto = new ProductDTO();
    ArrayList<MemberDTO> mList = new ArrayList<>();
    ArrayList<ProductDTO> pList = new ArrayList<>();
    public void makeMenu(String name, String info, int price, int quantity){
        pList.add(new ProductDTO(name, info, price, quantity));
    }
//    public void makeMember(String id, String pw, String address, int money, ArrayList<ProductDTO> cart){
//        mList = new ArrayList<>();
//        mList.add(new MemberDTO(id, pw, address, 0, null));
//        mDto.setId(id);
//        mDto.setPw(pw);
//        mDto.setAddress(address);
//        mDto.setMoney(0);
//        mDto.setCart(null);
//
//    }
}
