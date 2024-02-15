package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {

    private int sequence;               // 회원번호
    private String name;                  // 이름
    private String phone;                 // 휴대폰번호
    private String email;                // 이메일
    private Account persnalAccount;     // 개인계좌
}
