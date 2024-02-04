package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Application3_2 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {

        BufferedReader br = toBufferedReader(input);
        int n = Integer.parseInt(br.readLine());

        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            arr.add(new Time(x, y));
        }

        int cnt=0;
        Collections.sort(arr);
        int endTime=0;
        for(Time ob : arr){
            if(ob.start>=endTime){
                cnt++;
                endTime=ob.end;
            }
        }
        return cnt;
    }
}

class Time implements Comparable<Time> {
    public int start, end;
    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o){
        if(this.end ==o.end) return this.start-o.start;
        else return this.end -o.end;
    }
}
