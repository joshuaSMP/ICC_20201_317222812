import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import processing.core.PApplet;
import processing.core.PImage;


public class Practica9 extends PApplet{


    public static void main(String[] args) {
      PApplet.main("Practica09");
    }

    @Override
    public void settings(){
        size(1000,1000);
    }

    @Override
    public void setup(){
      String archives = getClass().getResource("numeros.csv").getPath();
      printSketch(archives);
    }

    @Override
    public void draw(){
    }

    public void printSketch(String archives ){
      try{
        float rad = 50;
        List<String> lines = Files.readAllLines(Paths.get(archives));
        for(String string : lines){
          String row[] = string.split(",");
          ellipse(Float.parseFloat(row[0]), Float.parseFloat(row[1]), rad, rad);
          System.out.println("X: "+row[0]+", Y: "+row[1]);
        }

      }catch(IOException e){
        System.out.println(e.getMessage());
      }
    }

}