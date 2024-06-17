import java.util.Scanner;

public class lista01_java{
 public class ex1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero1;
            int numero2;
            int resultado;
    
            System.out.println("Digite um número:");
            numero1 = scanner.nextInt();
    
            System.out.println("Digite o segundo número:");
            numero2 = scanner.nextInt();
    
            resultado = numero1 + numero2;
    
            System.out.println("O resultado da soma é: " + resultado);
            scanner.close();
        }
    }
    
public class ex02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.println(" Qual é o seu primeiro nome?\n");
        nome=scanner.nextLine();
        System.out.println(" Qual é o seu sobrenome?\n");
        sobrenome=scanner.nextLine();

        System.out.println("Olá, "+nome+ ""+sobrenome+ "!");

        scanner.close();

    }
}
    
public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TAXA_DE_CONVERSAO = 5.25;
        double valorDigitadoEmReais;
        double valorConvertidoParaDolar;

        System.out.println("--- Bem vindo ao nosso app ---");
        System.out.println("------------------------------\n");
        System.out.print("Digite um valor em reais para converter em dólar: ");
        valorDigitadoEmReais = scanner.nextDouble();
        // Simulando limpa() em Java
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        valorConvertidoParaDolar = valorDigitadoEmReais / TAXA_DE_CONVERSAO;

        System.out.printf("O valor em dólar é: $%.2f", valorConvertidoParaDolar);

        scanner.close();
    }
}

public class ex04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int antecessor;
        int sucessor;

        System.out.println("Digite um número para saber seu antecessor e sucessor");
        numeroDigitado = scanner.nextInt();

        antecessor = numeroDigitado - 1;
        sucessor = numeroDigitado + 1;

    System.out.println("O sucessor de " + numeroDigitado + " é " + sucessor + " e seu antecessor é " + antecessor);
    scanner.close();
    }

}

public class ex05{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int larguraTerreno;
            int comprimentoTerreno;
            int area;
            int valorDoM2;
    
            System.out.println("Qual a largura do terreno em metros?");
            larguraTerreno = scanner.nextInt();
    
            System.out.println("Qual o comprimento do terreno em metros?");
            comprimentoTerreno = scanner.nextInt();
    
            area = larguraTerreno * comprimentoTerreno;
    
            System.out.println("Qual o valor do m2 na região em R$?");
            valorDoM2 = scanner.nextInt();
    
            System.out.println("O valor total do terreno é: R$" + (valorDoM2 * area));
            scanner.close();
        }
    }

public class ex06{
        public static void main(String[] args) {
            final double CUSTO_LITRO = 5.25;
            Scanner scanner = new Scanner(System.in);
            int distanciaPercorrida;
            double custoTotalCombustivel;
    
            System.out.println("Qual a distancia percorrida?");
            distanciaPercorrida = scanner.nextInt();
    
            System.out.println("Qual o custo de combustível?");
            custoTotalCombustivel = scanner.nextDouble();
    
            double autonomia = distanciaPercorrida / (custoTotalCombustivel / CUSTO_LITRO);
    
            System.out.printf("Sua autonomia foi de: %.2f Km/L.%n", autonomia);
            scanner.close();
        }
    }
  
public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a nota 1:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4:");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno foi: " + media);
        scanner.close();
    }
}

public class ex08{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaEmFahrenheit;
        double temperaturaEmCelsius;

        System.out.println("Digite a temperatura em Fahrenheit:");
        temperaturaEmFahrenheit = scanner.nextDouble();

        temperaturaEmCelsius = (temperaturaEmFahrenheit - 32) / 1.8;

        System.out.println(temperaturaEmFahrenheit + " °F corresponde a " + temperaturaEmCelsius + " °C");
        scanner.close();
    }
}

}






