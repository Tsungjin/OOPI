import java.util.Scanner;

public class A1093301_0224_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temperature;
        System.out.print("請輸入攝氏溫度:");
        temperature = input.nextInt();
        System.out.printf("華氏為 %d 度",(temperature*9/5)+32);
    }
}