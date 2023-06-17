package 백준;

import java.util.Scanner;
 
//baekjoon_1157
public class 단어공부{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toUpperCase();
        int cnt[] = new int[26];
        int max = 0;
        char result = 'c';
        
        int index;
        for(int i=0; i<st.length(); i++) {
            index = st.charAt(i)-65;
            
            cnt[index]++;
            if(max < cnt[index]) {
                max = cnt[index];
                result = st.charAt(i);
            } else if(max == cnt[index])
                result = '?';
        }
        System.out.println(result);
    }
}



