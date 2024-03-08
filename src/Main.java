import java.util.Scanner;

public class Main {
    static long number;
    public static void main(String[] args) {
        System.out.println("素因数分解をしたい数を入力してください");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLong();
        calculation();
    }

    public static void calculation() {
        for (long i = 2; i <= number / 2; i++) {
            if (number % 2 == 0) {
                number /= 2;
                System.out.print(2 + " x ");
                calculation2();
                return;
            }
        }
    }

    public static void calculation2(){
        for(long i = 3; i <= Math.sqrt(number); i += 2){
            if(number % i == 0){
                number /= i;
                System.out.print(i + " x ");
                calculation2();
                return;
            }
        }
        System.out.println(number);
    }
}