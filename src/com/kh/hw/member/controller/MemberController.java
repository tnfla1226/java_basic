package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

    //==============필드 선언부==============//
    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;


    //==============생성자 선언부==============//
    //실제 저장된 회원의 숫자를 반환
    public int existMemberNum() {
        int count = 0; //숫자를 세는 변수
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    //아이디 중복체크하는 메서드
    public boolean checkId(String inputId) {
        for (Member member : m) {
            if (member == null) break;
            if(inputId.equals(member.getId())) {
                return false;
            }
        }
        return true;
    }

    public void insertMember(String id, String name, String password, String email, String gender, int age) {
        //charAt(index) : 문자열에서 해당 위치의 글자 하나를 추출
        int count = existMemberNum();
        m[count] = new Member(id, name, password, email, gender.charAt(0), age);
    }

    //아이디를 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchId(String id) {
        for (Member member : m) {
            if (id.equals(member.getId())) {
                member.inform();
                break;
            }
        }
        return null;
    }
    //이름을 입력하면 그 아이디에 해당하는 회원들의 정보 리턴
    public Member[] searchName (String name) {
        for (Member member : m) {
            if (name.equals(member.getName())) {
                member.inform();
            }
        }
        return null;
    }
    //이메일을 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchEmail (String email) {
        for (Member member : m) {
            if (email.equals(member.getEmail())) {
                member.inform();
                break;
            }
        }
        return null;
    }

    public boolean updatePassword(String id, String password) {
        for (Member member : m) {
            if (id.equals(member.getId()) && password.equals(member.getPassword())) {

            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        return false;
    }

    public boolean updateEmail(String id, String email) {
        return false;
    }

    public boolean delete(String id) {
        return false;
    }

    public void delete() {

    }

    public Member[] printAll() {
        return m;
    }


}
