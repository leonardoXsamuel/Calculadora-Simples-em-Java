package secao11;

import java.util.Scanner;

public class projetoCalculadora {
    public static void main(String[] args) {
        Scanner lerEnt = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        double a = lerEnt.nextDouble();

        System.out.println("Digite o valor de b");
        double b = lerEnt.nextDouble();

        int opcao = 0;

        //Repete até que a opção digitada estejsa dentro do intervalo de 1 a 4
        do {
        System.out.println("Selecione a opção desejada.");
        System.out.println("1)Multiplicação\n2)Divisão\n3)Soma\n4)Substração");
        opcao = lerEnt.nextInt();


        if(opcao == 1){
            //funcao multiplicação
            System.out.println("O resultado é: "+ multiplicacao(a, b));
        } else if (opcao == 2){
            //funcao divisão
            System.out.println("O resultado é: "+ divisao(a, b));
        } else if (opcao == 3){
            //funcao soma
            System.out.println("O resultado é: " + soma(a, b));
        } else if (opcao == 4) {
            //funcao sub
            System.out.println("O resultado é: "+ sub(a, b));
        } else {
            System.out.println("Digite uma opção válida!");
        }
        } while (opcao>4);


        lerEnt.close();

}  

    public static double divisao (double a, double b) {
        double result = a/b;
        return result;
    }

    public static double multiplicacao (double a, double b) {
        double result = a*b;
        return result;
    } 

    public static double soma (double a, double b) {
        double result = a+b;
        return result;
    } 

    public static double sub (double a, double b) {
        double result = a-b;
        return result;
    } 
    
}