import java.util.*;

class trafficLights {
    private String color;
    private int duration;

    public trafficLights(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public boolean isRed(){
        return this.color.equalsIgnoreCase("Red");
    }

    public boolean isGreen(){
        return this.color.equalsIgnoreCase("Green");
    }

    public String changeColor(String newcolor) {
        return this.color = newcolor;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }
}

class Lights {
    public static void main(String[] args) {
        trafficLights lights = new trafficLights("Red", 60);
        System.out.println(lights.isGreen());
        System.out.println(lights.getColor());
        lights.changeColor("Green");
        System.out.println(lights.isRed());
        System.out.println(lights.isGreen());
        System.out.println(lights.getDuration());
    }
}
