# Objetos
 public static void main(String[] args){
    5         Operacao operacao = new Operacao();
    6         Scanner input = new Scanner(System.in);
    7         
    8         operacao.soma();
    9         
   10         double n1,n2;
   11         System.out.println("Digite o primeiro numero inteiro");
   12         n1 = input.nextInt();  
   13         System.out.println("Digite o segundo numero inteiro");
   14         n2 = input.nextInt(); 
   15         operacao.calculaMedia(n1,n2);
   16         
   17         int resposta;
   18         resposta = operacao.multiplicacao();
   19         System.out.println("O produto dos numeros e " + resposta);
   20         
   21         double num1,num2, resposta2;
   22         System.out.println("Digite o dividendo");
   23         num1 = input.nextInt();  
   24         System.out.println("Digite o divisor");
   25         num2 = input.nextInt(); 
   26         resposta2 = operacao.divisao(num1, num2);
   27         System.out.println("O resultado da divisao dos numeros e " + resposta2);
   28     }
   29     
   30     public static void subtracao(){
   31         Scanner teclado = new Scanner(System.in);
   32         System.out.println("Digite o primeiro número inteiro para realizar a subtração");
   33         int a = teclado.nextInt();
   34         System.out.println("Digite o segundo número inteiro para a subtração");
   35         int b = teclado.nextInt();
   36         System.out.println("Subtração entre"+a+"-"+b+"="+(a-b));
   37     } 
   38     public static double mediaPonderada(double nota1, double nota2, double nota3){
   39         double mediaPonderada = (nota1*0.225)+(nota2*0.325)+(nota3*0.35);
   40         return mediaPonderada;
   41     }
   42     public static void fatorial(int numero){
   43         int resultado = 1;
   44         for(int i = 1; i<= numero; i++){
   45             resultado = resultado*i;
   46         }
   47         System.out.println(resultado);
   48     }
   49 }
