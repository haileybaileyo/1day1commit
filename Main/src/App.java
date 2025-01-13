// //9498
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         System.out.println(num <= 100 && num >= 90  ? "A" : num <= 89 && num >= 80 ? "B" : num <= 79 && num >= 70  ? "C" : num <= 69 && num >= 60  ? "D" : "F");
//     }
// } 

// //2753
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         System.out.println( num % 4 == 0 && num % 100 != 0 || num % 400 == 0 ? "1" : "0");
//     }
// } 

//프로그래머스_문자열 내 p와 y의 개수
class Solution {
    boolean solution(String s) {
        boolean answer = true;

       int p = 0;
       int y = 0;
        
        for(int i = 0; i < s.length(); i++){
            int ch = (int)s.charAt(i);
            if (ch == 80 || ch == 112){
                p += 1;
            }
            else if(ch == 89 || ch == 121){
                y += 1;
            }
        }
        answer = p==y? true : false;    
        

        return answer;
    }
}