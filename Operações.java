import java.util.*;
public class Operacoes{
  
  
  
  public void calculeMedia(int valor1, int valor2){
    double media = (valor1+valor2)/2; 
    return media;
  }
  
  public void Soma(int num1, int num2){
    this.soma = num1+num2;
  }
  
  public void Divisao(int num1, int num2){
   double divisao = num1/num2;
    return divisao;
  }
  
  
  public void Multiplicacao(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("entre com um numero inteiro");
      int n1 = teclado.nextInt();
    System.out.println("entre com o proximo numero inteiro");
    int n2 = teclado.nextInt();
  int multiplicacao = n1*n2;
    return multiplicacao;
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

