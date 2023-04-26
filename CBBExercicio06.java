import java.util.Scanner;
public class CBBExercicio06 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior;
        for (int i = 0; i < numeros.length;i++){
            System.out.println("Informe um número: ");
            numeros[i] = leitor.nextInt();
        }
        maior = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > numeros[i-1]){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: "+maior);
    }
}
