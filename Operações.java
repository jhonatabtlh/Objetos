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
   this.divisao = num1/num2;
  }
  public int getSubtracao(){
   return subtracao; 
  }
  
  public int getMultiplicacao(){
   return multiplicacao ;
  }
  public void setMultiplicacao(int num1, int num2){
  this.multiplicacao = num1*num2;
  }
  
 
    public void subtracao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro para realizar a subtração");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo número inteiro para a subtração");
        int b = teclado.nextInt();
        System.out.println("Subtração entre"+a+"-"+b+"="+(a-b));
    }	 	  	
  
    public double mediaPonderada(double nota1, double nota2, double nota3){
        double mediaPonderada = (nota1*0.225)+(nota2*0.325)+(nota3*0.35);
        return mediaPonderada;
    }
  
    public void fatorial(int numero){
        int resultado = 1;
        for(int i = 1; i<= numero; i++){
            resultado = resultado*i;
        }
        System.out.println(resultado);
    }
}

