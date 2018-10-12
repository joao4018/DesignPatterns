public class Main{
  public static void main(String[] args){
    Factory factory = new Factory();
    Car mycar = factory.createcar(" 1");
    mycar.addcar();
    mycar.removecar();
    mycar.finalzar();

    Car mycar2 = factory.createcar(" 2");
    mycar2.addcar();
    mycar2.removecar();
    mycar2.finalzar();
  }

}
