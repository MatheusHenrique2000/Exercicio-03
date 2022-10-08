import java.util.Scanner;

public class App {
    public static void main(String args []) {
        // Faça um programa que peça dois números e imprima a soma
        // Colocando os números
        double numero1;
        double numero2;
        double resultado;
        // 1) Ação do usuário: digitar dois numeros
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro Numero: ");
        numero1 = teclado.nextDouble();
        System.out.print("Segundo Numero: ");
        numero2 = teclado.nextDouble();
        teclado.close();
        // 2) Tarefa do programa
        resultado = numero1 + numero2;
        // 3) Resposta do programa: Mostrar o Resultado da soma 
        System.out.print("O resultado é ");
        System.out.print(resultado);
    }

}