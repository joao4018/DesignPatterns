public class Main{
  public static void main(String[] args){

    Trecho rua = new Rua();
    Trecho avenida = new Avenida();
    Trecho rodovia = new Rodovia();

    Caminho caminho = new Caminho();
    Caminho caminho2 = new Caminho();

    caminho.addTrecho(rua);
    caminho.addTrecho(avenida);
    caminho.addTrecho(rodovia);

    caminho2.addTrecho(caminho);
    caminho2.addTrecho(rua);
    caminho2.printrecho();
  }

}
