package com.ohgiraffers.common;

/* 설명.
 *  DAO 클래스는 Data Access Object를 줄인 말로 Repository 계층과 마찬가지로 java application과
 *  DB를 연동시켜주기 위한 계층의 클래스로 활용한다.
 */

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/* 설명.
 *  DB와 연동하기 위해 사용되는 클래스에 추가하는 어노테이션으로 bean으로 관리될 수 있게 어노테이션을 추가한다.
 *  @Repository 는 @Component와 크게 기능이 있진 않으나 DB에 에러가 난 경우 java exception으로 치환해준다.
 */
@Repository

/* 설명. 클래스에 계층의 의미가 없이(추가적인 기능 없이) 단순히 bean으로 관리될 클래스는 @Component를 붙일 수 있다. */
//@Component
public class MemberDAO {
    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(1, new MemberDTO(2, "user02", "pass02", "유관순"));
    }

    /* 설명. 회원 조회용 메소드 */
    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    /* 설명. 회원 가입용 메소드 */
    public int insertMember(MemberDTO newMember) {
        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after - before;
    }
}
