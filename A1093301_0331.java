import java.util.*;

class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " m/min");
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return distance(x, 1.0);
    }
}

class Human extends Animal {
    String gender;

    public Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Gender: " + gender);
    }
}

class Snow extends Human {
    boolean hasFreezingSkill;

    public Snow(String name, double height, double weight, double speed, String gender, boolean hasFreezingSkill) {
        super(name, height, weight, speed, gender);
        this.hasFreezingSkill = hasFreezingSkill;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Has Freezing Skill: " + hasFreezingSkill);
    }

    @Override
    public double distance(int x, double y) {
        return 2 * super.distance(x, y);
    }

    public double distance(int x) {
        return distance(x, 1.0);
    }
}
public class A1093301_0331
{
    public static void showInfo()
    {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
    public static void main(String[] args)
    {
        showInfo();
        Scanner sc = new Scanner(System.in);
        Animal snowbaby = new Animal("Snowbaby",1.1,52,100);
        Animal donkey = new Animal("Donkey",1.5,99,200);
        Human ak = new Human("Ak",1.9,80,150,"male");
        Human hs = new Human("Hs",1.8,78,130,"male");
        Human an = new Human("An",1.7,48,120,"female");
        Snow elsa = new Snow("Elsa",1.7,50,120,"female",true);
        snowbaby.show();
        System.out.print("輸入時間(分鐘)：");
        int x=sc.nextInt();
        System.out.print("輸入加速度：");
        double y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + snowbaby.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + snowbaby.distance(x,y) + " 公尺");
        }
        donkey.show();
        System.out.print("輸入時間(分鐘)：");
        x=sc.nextInt();
        System.out.print("輸入加速度：");
        y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + donkey.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + donkey.distance(x,y) + " 公尺");
        }
        ak.show();
        System.out.print("輸入時間(分鐘)：");
        x=sc.nextInt();
        System.out.print("輸入加速度：");
        y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + ak.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + ak.distance(x,y) + " 公尺");
        }
        hs.show();
        System.out.print("輸入時間(分鐘)：");
        x=sc.nextInt();
        System.out.print("輸入加速度：");
        y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + hs.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + hs.distance(x,y) + " 公尺");
        }
        an.show();
        System.out.print("輸入時間(分鐘)：");
        x=sc.nextInt();
        System.out.print("輸入加速度：");
        y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + an.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + an.distance(x,y) + " 公尺");
        }
        elsa.show();
        System.out.print("輸入時間(分鐘)：");
        x=sc.nextInt();
        System.out.print("輸入加速度：");
        y=sc.nextDouble();
        if(y==0)
        {
            System.out.println("跑步距離為：" + elsa.distance(x) + " 公尺");
        }
        else
        {
            System.out.println("跑步距離為：" + elsa.distance(x,y) + " 公尺");
        }
        sc.close();
    }
}