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
// 

//백준 11719번
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
