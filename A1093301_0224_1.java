import java.util.Scanner;
public class A1093301_0224_1{
    public static void main (String[] args){
        int number;
        Scanner input = new Scanner(System.in); 
        System.out.print("請輸入整數:");
        number = input.nextInt();
        if(number%2==0){
            System.out.printf("%d是偶數",number);
        }
        else{
            System.out.printf("%d是奇數",number);
        }
    }
}