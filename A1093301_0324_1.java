public class A1093301_0324_1
{
    private String name;
    private double height;
    private double weight;
    private double speed;

    public A1093301_0324_1(String name, double height, double weight, double speed)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    public void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Height : "+height+"公尺");
        System.out.println("Weight : "+weight+"公斤");
        System.out.println("Speed : "+speed+"m/min");
    }
    public double distance(double time, double acceleration)
    {
        return time*acceleration*speed;
    }
    public double distance(double time)
    {
        return time*speed;
    }
}