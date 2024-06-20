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

 
}
