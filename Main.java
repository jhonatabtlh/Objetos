import java.util.*;
public class Main{

    public static void main(String[] args){
        Operacao operacao = new Operacao();
        Scanner input = new Scanner(System.in);
        
        operacao.soma();
        
        //estou editando para testar
        
        double n1,n2;
        System.out.println("Digite o primeiro numero inteiro");
        n1 = input.nextInt();  
        System.out.println("Digite o segundo numero inteiro");
        n2 = input.nextInt(); 
        operacao.calculaMedia(n1,n2);
        
        int resposta;
        resposta = operacao.multiplicacao();
        System.out.println("O produto dos numeros e " + resposta);
        
        double num1,num2, resposta2;
        System.out.println("Digite o dividendo");
        num1 = input.nextInt();  
        System.out.println("Digite o divisor");
        num2 = input.nextInt(); 
        resposta2 = operacao.divisao(num1, num2);
        System.out.println("O resultado da divisao dos numeros e " + resposta2);
    }
    
    public static void subtracao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro para realizar a subtração");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo número inteiro para a subtração");
        int b = teclado.nextInt();
        System.out.println("Subtração entre"+a+"-"+b+"="+(a-b));
    }	 	  	  		  	    	    	     	 	    	 	
    public static double mediaPonderada(double nota1, double nota2, double nota3){
        double mediaPonderada = (nota1*0.225)+(nota2*0.325)+(nota3*0.35);
        return mediaPonderada;
    }
    public static void fatorial(int numero){
        int resultado = 1;
        for(int i = 1; i<= numero; i++){
            resultado = resultado*i;
        }
        System.out.println(resultado);
    }
}
