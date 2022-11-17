package Diesu;

public class UnfairDie extends CustomDie{
  private double[] chances;
  public UnfairDie(double[] chances, String[] faces){
    super(faces);
    if(!checkChances(chances)){
      this.chances = equalChances(faces);
    }
    else{
      this.chances = chances;
    }
  }
  
  public UnfairDie(String[] faces){
    super(faces);
    chances = equalChances(faces);
  }

  private boolean checkChances(double[] chances){
    double count = 0.0;
    if(chances.length != faces.size()){
      return false;
    }
    for(int i = 0 ; i < chances.length; i++){
      count += chances[i];
    }
    if(count != 1){
      return false;
    }
    return true;
  }


  public void displayChances(){
    for(int i = 0 ; i < chances.length ; i++){
      System.out.println(chances[i]);
    }
  }

  private double[] equalChances(String[] faces) {
    double[] temp = new double[faces.length];
    double initialCount = 1.0 / (double) faces.length;
    for (int i = 0; i < faces.length; i++) {
      temp[i] = initialCount;
    }
    return temp;
  }
}
