import java.util.Scanner;
public class CTExercicio03 {
    public static void main (String[] arg) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[10];
        double media = 0;
        int acima = 0 , abaixo = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Informe a nota do aluno: ");
            notas[i] = leitor.nextDouble();
            media += notas[i];
        }
        media /= 10;
        for (int i = 0; i < 10; i++){
            if(notas[i] >= media){
                acima++;
            }
            else {
                abaixo++;
            }
        }
        System.out.println("A média dos alunos é: "+media);
        System.out.println("Acima da média"+acima);
        System.out.println("Abaixo da média"+abaixo);
    }
}
