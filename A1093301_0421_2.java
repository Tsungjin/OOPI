import java.util.*;
public class A1093301_0421_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String date;
        boolean iscorrect;

        do
        {
            System.out.print("請輸入日期(yyyy/mm/dd or mm/dd/yyyy):");
            date = sc.next();
            if(date.matches("[0-9]{4}[0-9]{1}/[0,1]{1}[0-9]{1}/[0,1,2,3]{1}[0-9]{1}") || date.matches("[0,1]{1}[0-9]{1}/[0,1,2,3]{1}[0-9]{1}/[0-9]{4}"))
            {
                iscorrect = true;
                System.out.println("輸入的日期為:"+date);
            }
            else
            {
                iscorrect = false;
                System.out.println("輸入的日期有誤!");
            }
        }
        while(!iscorrect);
        sc.close();
    }
    
}