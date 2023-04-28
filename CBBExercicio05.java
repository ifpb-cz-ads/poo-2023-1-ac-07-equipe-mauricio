public class CBBExercicio05 {
    public static void main (String[] args){
        String[] diasDaSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
        int aux = 0;
        while (aux<diasDaSemana.length){
            System.out.println(diasDaSemana[aux]);
            aux++;
        }
        aux =0;
        do {
            System.out.println(diasDaSemana[aux]);
            aux++;
        }while (aux<diasDaSemana.length);
        for (aux=0;aux<diasDaSemana.length;aux++){
            System.out.println(diasDaSemana[aux]);
        }
    }
}
