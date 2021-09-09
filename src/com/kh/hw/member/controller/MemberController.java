package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class MemberController {

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@gmail", 'm', 24);
        m[1] = new Member("abd", "김철수", "4567", "abd@gmail", 'm', 25);
        m[2] = new Member("abf", "고길동", "8910", "abf@gmail", 'm', 26);
    }

    //실제 저장된 회원의 숫자를 반환
    public int existMemberNum() {
        int count = 0; // 숫자를 세는 변수
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
            if (inputId.equals(member.getId())) {
                return false; //중복됨
            }
        }
        return true; //중복안됨
    }

    public void insertMember(String id, String name, String password, String email, String gender, int age) {
        //charAt(index) : 문자열에서 해당 위치의 글자 하나를 추출
        int count = existMemberNum();
        m[count] = new Member(id, name, password, email, gender.charAt(0), age);
    }

    // 아이디를 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchId(String id) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                return m[i];
            }
        }
        return null;    //아이디를 못찾았을때
    }

    // 이름을 입력하면 그 아이디에 해당하는 회원들의 정보 리턴
    public Member[] searchName(String name) {

        //이름이 일치하는 회원들을 저장할 배열
        Member[] foundMembers = {};

        for (int i = 0; i < existMemberNum(); i++) {
            if (name.equals(m[i].getName())) {
                foundMembers = pushMember(foundMembers, m[i]);
            }
        }
        return foundMembers;
    }

    //멤버 배열에 데이터를 추가하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {

        //1. 원본 배열보다 사이즈가 1개 더 큰 새 배열을 생성
        Member[] temp = new Member[targets.length + 1];

        //2. 기존 배열 데이터를 복사해서 신규배열로 이동
        for (int i = 0; i < targets.length; i++) {
            temp[i] = targets[i];
        }

        //3. 추가할 데이터를 맨 마지막 위치에 저장
        temp[temp.length - 1] = newMember;

        return temp;
    }

    // 이메일 입력하면 그 아이디에 해당하는 회원 1명의 정보 리턴
    public Member searchEmail(String email) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (email.equals(m[i].getEmail())) {
                return m[i];
            }
        }
        return null;
    }

    public boolean updatePassword(String id, String password) {
        Member member = searchId(id);
        if (member != null) {
            member.setPassword(password);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateName(String id, String name) {
        Member member = searchId(id);
        if (member != null) {
            member.setName(name);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmail(String id, String email) {
        Member member = searchId(id);
        if (member != null) {
            member.setEmail(email);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String id) {

        int count = existMemberNum();
        //삭제할 데이터 인덱스 구하기
        int delIdx = -1;
        for (int i = 0; i < count; i++) {
            if (id.equals(m[i].getId())) {
                delIdx = i;
                break;
            }
        }

        //삭제 알고리즘
        if (delIdx != -1) {
            for (int i = delIdx; i < count - 1; i++) {
                m[i] = m[i+1];
            }
            m[count - 1] = null; //마지막 데이터 null로 변경
            return true;
        }
        return false;
    }

    //회원정보를 전체 삭제하는 메서드
    public void delete() {
        for (int i = 0; i < m.length; i++) {
            m[i] = null;
        }
    }

    //회원정보 전체를 출력하는 메서드
    public Member[] printAll() {
        return m;
    }
}