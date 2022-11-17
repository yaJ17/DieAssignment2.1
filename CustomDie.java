package Diesu;

public class CustomDie extends Die{
  public CustomDie(String[] faces){
    super(faces);
  }

  public void addFace(String newFace){
    if(!faces.contains(newFace)){
      faces.add(newFace);
      faces.remove(0);
    }
  }

  public void removeFace(String face){
    if(faces.contains(face)){
      faces.remove(face);
    }
  }
}
