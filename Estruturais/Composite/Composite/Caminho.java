import java.util.ArrayList;

public class Caminho extends Trecho {

  protected ArrayList<Trecho> caminhos;

  public Caminho(){
    super("-");
    this.caminhos = new ArrayList<Trecho>();
  }
  public void addTrecho(Trecho trecho) {
      this.caminhos.add(trecho);
  }

  public void printrecho(){
    for (Trecho caminho : caminhos) {
      caminho.printrecho();
    }
  }
}
