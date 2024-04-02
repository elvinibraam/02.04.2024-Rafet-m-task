import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

         /*Kicik bir proqram yazin,istifadeciden adini ve aldigi bali alsin ve aldigi bala gore ona
        hansi qiymeti aldigini cap etsin
        100-91 bal arasi -A qiymet
        90-81 bal arasi- B qiymeti
        80-71 bal arasi -C qiymeti
        70-61 bal arasi- D qiymeti
        60-51 bal arasi- E qiymeti
        ALtinda ise F
            */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your name and surname");
        String name = scanner.nextLine();
        System.out.println("Please add your score");
        int score = scanner.nextInt();
        String mark = " ";
        if (score >= 91 && score <= 100) {
            mark = "A";
        } else if (score >= 81 && score <= 90) {
            mark = "B";
        } else if (score >= 71 && score <= 80) {
            mark = "C";
        } else if (score >= 61 && score <= 70) {
            mark = "D";
        } else if (score >= 51 && score <= 60) {
            mark = "E";
        } else {
            mark = "F";
        }


        System.out.println("Your mark is " + mark);


    }

}
