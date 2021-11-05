package Grouppractice;

public class UsingParent {
    String color;

    public UsingParent(String color) {
        this.color = color;
    }

    public void name(String name){
        System.out.println(name+" Hello");
    }

    @Override
    public String toString() {
        return "UsingParent{" +
                "color='" + color + '\'' +
                '}';
    }
}
