package Diesu;

import java.util.ArrayList;
import java.util.Random;

public class Die {
  protected ArrayList<String> faces;
  public Die(){
    faces = new ArrayList<>(6);
    for(int i = 1 ; i <= 6 ; i++){
      String str = Integer.toString(i);
      faces.add(str);
    }
  }
  public Die(String[] faces){
    this.faces = new ArrayList<>(6);
    for(int i = 0 ; i < faces.length; i++){
      this.faces.add(faces[i]);
    }
  }
  public void displayAllFaces(){
    for(int i = 0 ; i < faces.size(); i++){
      System.out.println(faces.get(i));
    }
  }
  public void roll(){
    Random rand = new Random();
    int random = rand.nextInt(faces.size());
    System.out.println(faces.get(random));
  }
}
