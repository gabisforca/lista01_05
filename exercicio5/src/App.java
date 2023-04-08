import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double metro;
    double centimetro;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Mostre o seu valor em metro:");
    metro = teclado.nextDouble();
    //passo 3: calculo
    centimetro = metro * 100;
    // passo 4: exibir resposta
    System.out.println("Seu valor em centimetros é:" + centimetro);
  }
}
