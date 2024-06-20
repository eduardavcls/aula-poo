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
scanner.close();
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
    


}
    
