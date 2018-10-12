
public class Factory implements absfactory{

  private Car car;
  public Car createcar(String code){
    car = new Concar(code);
    return car;
  }
}
