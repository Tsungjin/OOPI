import java.util.*;
public class A1093301_0421_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String mail;
        boolean iscorrect;
        do
        {
            iscorrect = true;
            System.out.print("請輸入學校電子郵件:");
            mail=sc.next();
            if(mail.matches("[a]{1}[1][0,1]{1}[0-9]{1}[3][3]{1}[0-9]{2}@mail.nuk.edu.tw"))
            {
                System.out.println("電子郵件輸入正確!");
            }
            else
            {
                iscorrect = false;
                System.out.println("電子郵件輸入錯誤!");
            }
        }
        while(!iscorrect);
        sc.close();
    }
      
}