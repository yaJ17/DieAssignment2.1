package Diesu;

public class Runner {
  public static void main(String[] args){
    String[] cfaces = {"naughty", "happy", "sad", "sulky", "joy", "prankster"};
    double[] prob = {0.2, 0.2, 0.2, 0.2, 0.1, 0.1};
    Die die = new Die();
    CustomDie cdie = new CustomDie(cfaces);
    UnfairDie udie = new UnfairDie(prob,cfaces);
    udie.displayChances();
  }
}
