import processing.core.PApplet;

public class Main extends PApplet {

    public void settings(){
        size(600,600);
    }

    public void setup(){}
    public void draw(){
        ellipse(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}