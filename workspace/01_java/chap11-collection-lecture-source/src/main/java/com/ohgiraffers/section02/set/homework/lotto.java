package com.ohgiraffers.section02.set.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lotto {
    public static void main(String[] args) {
        List<Integer> candidateNumbers = new ArrayList<>();  // 로또 후보 번호 ArrayList
        for (int i = 1; i < 46; i++) {      // 1~45 번호 넣기
            candidateNumbers.add(i);
        }

        List<Integer> winningNumbers = new ArrayList<>();   // 당첨 번호 저장할 ArrayList

        while (winningNumbers.size() < 6) {     // 당첨 배열 크기가 6보다 작은 동안 반복

            int winningNumber = (int) (Math.random() * candidateNumbers.size());    // 후보배열 크기만큼 랜덤값 뽑아서 인덱스 추출
            winningNumbers.add(candidateNumbers.get(winningNumber));    // 후보배열에서 뽑힌 인덱스번호값 당첨번호에 넣기
            candidateNumbers.remove(winningNumber);     // 뽑힌 후보배열 인덱스 값 삭제(후보배열 크기 -1)
        }

        Collections.sort(winningNumbers);   // 정렬

        System.out.println(winningNumbers);
    }
}
