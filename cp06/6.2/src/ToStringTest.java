package classes;

class Apple{
    private String color;
    private float weight;

    public Apple(){}

    public Apple(String color, float weight){
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Apple {color = " + color + ", weight = " + weight + "}";
    }
}


public class ToStringTest{
    
    public static void main(String[] args){
        Apple apple = new Apple("红色", 5.68f);
        System.out.println(apple);
    }
}
