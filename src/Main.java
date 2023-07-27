import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//
//
//
//
//            p++;
//        }while (p <=100);

//        String[][] questions  = {
//                {"What is 9 + 1 ?: ","10"},
//                {"What is color of the sun?: ","yellow"},
//                {"What is capital of Oman?: ","muscat"},
//                {"what is 10 * 0 ?: ","0"},
//                {"What is capital of Egypt?: ","cairo"}
//        };
//
//        Scanner read = new Scanner(System.in);
//        System.out.println("<<<>>>Welcome User<<<>>>");
//        System.out.print("Please Enter your name: ");
//        String name = read.nextLine();
//        System.out.print("Enter number of Questions out of 5: ");
//        int Q = read.nextInt();
//
//        if (Q < 0 || Q > 5){
//            System.out.println("Error, number");
//        }else {
//            int score = 0;
//            for(int i =0; i < Q;i++){
//                System.out.println();
//                System.out.print(questions[i][0]);
//                String ans = read.next();
//
//                if (ans.equals(questions[i][1])){
//                    score ++;
//                    System.out.println("Your answer Correct <>");
////                    System.out.println("Your Score is: "+ score);
//                }else {
//                    System.out.println("You answer Wrong");
////                    System.out.println(name+" Your Score is: "+ score);
//                }
//            }
//            System.out.println();
//            System.out.println();
//            System.out.println(name + " Your score: "+ score +" out of "+ Q);
//        }

        String[] x = {"helloo", "in", "ourwwwwwwwwww", "newg", "wwworld"};
//        System.out.println("*******");
        int max = 0;
        int c = 0;
        for (String word : x) {
//            System.out.println(word);
            for (int j = 0; j < word.length(); j++) {
//                System.out.println(word.charAt(j));
                c++;
                if (c > max) {
                    max = c;
                }
            }
            c = 0;
        }
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                for (int n = 0; n < max + 2; n++) {
//                    System.out.println("*".repeat(max+2));
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.printf("*%-" + max + "s*\n", x[i]);
        }
        for (int i = 0; i < max + 2; i++) {

            System.out.print("*");
        }


    }}