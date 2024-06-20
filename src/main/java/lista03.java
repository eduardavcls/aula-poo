import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class lista03 {
public void ex01() {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número de 1 a 59: ");
int segundos = scanner.nextInt();

if (segundos < 1 || segundos > 59) {
 System.out.println("Número inválido. Digite um valor de 1 a 59.");
  return;
 }

 Timer timer = new Timer();
 TimerTask tarefa = new TimerTask() {
   int contagem = segundos;

 public void run() {
  if (contagem > 0) {
 System.out.println("Segundos restantes: " + contagem);
 contagem--;
} else {
 System.out.println("Cronômetro encerrado!");
 timer.cancel();
   }
  }
 };
timer.scheduleAtFixedRate(tarefa, 0, 1000);
 }

public void ex02(){
    Scanner scanner = new Scanner(System.in);
    int numeroDigitado;
    int multiplicador;
    int resultado;
    
    System.out.println("Digite um número para saber a tabuada dele até o 10:");
    numeroDigitado = scanner.nextInt();
    
    multiplicador = 0;
    while (multiplicador <= 0) {
        resultado = numeroDigitado * multiplicador;
    System.out.println( numeroDigitado + " X " + multiplicador + " = " +  resultado);
    
    multiplicador++;
      scanner.close();  
    }
    }

public void ex03(){
Scanner scanner = new Scanner(System.in);

int numero1;
int numero2;

System.out.println("Digite o primeiro número:");
numero1 = scanner.nextInt();
 
System.out.println("Digite o segundo número:");
numero2 = scanner.nextInt();

for (int numero = numero1; numero <= numero2; numero++) {
  if (numero % 2 == 0) {
      System.out.print(" " + numero);

  }
  System.out.print("Os números pares entre " + numero1 + " e " + numero2 + " são:");
  scanner.close();  
}
}


}


    

