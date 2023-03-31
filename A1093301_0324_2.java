import java.util.*;

public class A1093301_0324_2
{
    public static void main(String[] args)
    {
        A1093301_0324_1 snowbaby = new A1093301_0324_1("Snowbaby",1.1,52,100);
        A1093301_0324_1 donkey = new A1093301_0324_1("Donkey",1.5,99,200);
        A1093301_0324_1 anna = new A1093301_0324_1("Anna",1.7,48,120);
        A1093301_0324_1 elsa = new A1093301_0324_1("Elsa",1.7,50,120);
        System.out.println("All attribute : ");
        snowbaby.show();
        System.out.println("");
        donkey.show();
        System.out.println("");
        anna.show();
        System.out.println("");
        elsa.show();
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入速度(x)跟加速度(y)來計算跑步距離");

        System.out.print("Snowbaby : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double snowbabyDistance = snowbaby.distance(x,y);
        System.out.println("Snowbaby的跑步距離 : "+snowbabyDistance+"公尺");

        System.out.print("Donkey : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double donkeyDistance = donkey.distance(x,y);
        System.out.println("Donkey的跑步距離 : "+donkeyDistance+"公尺");

        System.out.print("Anna : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double annaDistance = anna.distance(x,y);
        System.out.println("Anna的跑步距離 : "+annaDistance+"公尺");

        System.out.print("Elsa : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double elsaDistance = elsa.distance(x,y);
        System.out.println("Elsa的跑步距離 : "+elsaDistance+"公尺");
        sc.close();
    }
}