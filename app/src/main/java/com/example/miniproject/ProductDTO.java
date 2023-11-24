package com.example.miniproject;

import java.util.ArrayList;

public class ProductDTO {
    private String name, info;
    private int price;
    private int quantity;
    private int choice;

    public ProductDTO(String name, String info, int price, int quantity) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductDTO() {
        ArrayList<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("아메리카노","원두를 갈아만든 커피", 3000,10));
        list.add(new ProductDTO("카페라떼","아메리카노와 우유가 만난 커피", 4000,10));
        list.add(new ProductDTO("에스프레소","고소함을 느낄 수 있는 에스프레소", 2500,10));
        list.add(new ProductDTO("바닐라라떼","우유와 바닐라가 조화를 이루는 음료", 4000,10));
        list.add(new ProductDTO("콜라","코카콜라 뚱캔입니다", 2000,10));
        list.add(new ProductDTO("사이다","칠성사이다 뚱캔입니다", 2000,10));
        list.add(new ProductDTO("레몬에이드","상큼하게 즐기는 레몬에이드", 5000,10));
        list.add(new ProductDTO("자몽에이드","달콤 쌉쌀한 자몽에이드", 5000,10));
        list.add(new ProductDTO("라임에이드","새콤달콩한 라임에이드", 5000,10));
        list.add(new ProductDTO("한라봉에이드","제주 한라봉으로 만든 에이드", 5000,10));
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
