public class Concar extends Car{
  public Concar(String code){
    super(code);
  }

  @Override
  public void addcar(){
    System.out.println("Produto X adicionado no carrinho" + carcode);
  }

  @Override
  public void removecar(){
    System.out.println("Produto X retirado no carrinho" + carcode);
  }

  @Override
  public void finalzar(){
    System.out.println("Compra finalizada" + carcode);
  }
}
