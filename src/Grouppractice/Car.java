package Grouppractice;

public abstract class Car {
    String name;
    public abstract void gasUsage(double mpg);
    public void drive(){
        System.out.println(name+ " is a car");
    }
}
class bmw extends Car{
    @Override
    public void gasUsage(double mpg) {
        System.out.println("Bmw is using "+mpg +" per mile");
    }

    @Override
    public void drive() {
        System.out.println(name+" is driving bmw");
    }
}





