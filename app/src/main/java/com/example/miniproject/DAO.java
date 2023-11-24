package com.example.miniproject;

import java.util.ArrayList;

public class DAO {
    MemberDTO mDto = new MemberDTO();
    ProductDTO pDto = new ProductDTO();
    ArrayList<MemberDTO> mList = new ArrayList<>();
    public ArrayList<ProductDTO> makeMenu(String name){
        ArrayList<ProductDTO> list = new ArrayList<>();
        if(name.equals("gimsT")){
            list.add(new ProductDTO("특공대김밥","특별한 비법소스를 첨가한 야채 김밥", 2500,10));
            list.add(new ProductDTO("참치김밥","참치와 마요네즈가 듬뿍 ", 3500,7));
            list.add(new ProductDTO("누드김밥","일반 김밥과는 다르다 나만의 매력이..", 4000,5));
            list.add(new ProductDTO("모듬김밥","이것 저것 모아모아", 4500,3));

        } else if(name.equals("ramensT")){
            list.add(new ProductDTO("특공대라면","특별한 비법소스를 첨가한 기본 라면", 3000,10));
            list.add(new ProductDTO("떡라면","떡이 추가되었습니다~", 3500,8));
            list.add(new ProductDTO("치즈라면","치즈가 추가되었어요~", 3500,7));
            list.add(new ProductDTO("해물라면","특공대 라면에 갖은 해물이~", 4500,5));

        } else if(name.equals("noodlesT")){
            list.add(new ProductDTO("특공대국수","특별한 비법소스를 첨가한 잔치 국수", 4000,10));
            list.add(new ProductDTO("비빔국수","특별한 비법소스를 첨가한 비빔 국수", 4500,8));
            list.add(new ProductDTO("특공대쫄면","특별한 비법소스를 첨가한 쫄면", 5000,6));
            list.add(new ProductDTO("특공대우동","특별한 비법소스를 첨가한 우동", 5000,6));

        } else if(name.equals("ricesT")){
            list.add(new ProductDTO("특공대비빔밥","특별한 비법소스를 첨가한 비빔밥", 5000,10));
            list.add(new ProductDTO("제육덮밥","불 맛을 잔뜩", 6000,8));
            list.add(new ProductDTO("오징어덮밥","통통한 오징어를 듬뿍 볶은", 6000,7));
            list.add(new ProductDTO("김치볶음밥","매콤 칼칼하게 볶은", 6000,8));

        } else if(name.equals("tteoksT")){
            list.add(new ProductDTO("특공대떡볶이","특별한 비법소스를 첨가한 떡볶이", 3000,10));
            list.add(new ProductDTO("치즈떡볶이","치즈가 추가되었어요~", 3500,5));
            list.add(new ProductDTO("라뽁이","특별한 비법소스를 첨가한 라뽁이", 4000,7));
            list.add(new ProductDTO("짜장떡볶이","특별한 비법 짜장소스를 첨가한 떡볶이", 3500,6));

        } else if(name.equals("frysT")){
            list.add(new ProductDTO("고구마튀김","해남 꿀고구마를 튀긴", 1000,20));
            list.add(new ProductDTO("고추튀김","매콤한 고추를 듬뿍", 1500,12));
            list.add(new ProductDTO("오징어튀김","통통한 오징어를 도톰하게 튀긴", 2000,10));
            list.add(new ProductDTO("특공대튀김","특별한 비법 소스와 함께하는 모듬 튀김", 5000,5));

        } else if(name.equals("coffeesT")){
            list.add(new ProductDTO("에스프레소","고소함을 느낄 수 있는 에스프레소", 2500,10));
            list.add(new ProductDTO("아메리카노","원두를 갈아만든 커피", 3000,10));
            list.add(new ProductDTO("카페라떼","아메리카노와 우유가 만난 커피", 4000,10));
            list.add(new ProductDTO("바닐라라떼","우유와 바닐라가 조화를 이루는 음료", 4000,10));
        } else if(name.equals("adesT")){
            list.add(new ProductDTO("자몽에이드","달콤 쌉쌀한 자몽에이드", 5000,10));
            list.add(new ProductDTO("한라봉에이드","제주 한라봉으로 만든 에이드", 5000,10));
            list.add(new ProductDTO("레몬에이드","상큼하게 즐기는 레몬에이드", 5000,10));
            list.add(new ProductDTO("라임에이드","새콤달콩한 라임에이드", 5000,10));
        } else if(name.equals("colasT")){
            list.add(new ProductDTO("콜라","코카콜라 뚱캔입니다", 2000,10));
            list.add(new ProductDTO("사이다","칠성사이다 뚱캔입니다", 2000,10));
            list.add(new ProductDTO("환타","환타 뚱캔입니다", 2000,10));
            list.add(new ProductDTO("마운틴듀","마운틴듀 뚱캔입니다", 2000,10));
        }
        return list;
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
