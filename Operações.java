public class Operacoes{
  private int media;
  private int soma;
  private int divisao;
  private int subtracao;
  private int multiplicacao;
  private double mediaPonderada;
  private int fatorial;
  
  public int getMedia(){
    return media;
  }
  public void setMedia(int valor1, int valor2){
   this.media = valor1+valor2/2; 
  }
  public int getSoma(){
   return soma; 
  }
  public void setSoma(int num1, int num2){
    this.soma = num1+num2;
  }
  public int getDivisao(){
   return divisao; 
  }
  public void setDivisao(int num1, int num2){
   this.divisao = divisao; 
  }
  public int getSubtracao(){
   return subtracao; 
  }
  public void setSubtracao(int num1, int num2){
   this.subtracao = subtracao; 
  }
}
