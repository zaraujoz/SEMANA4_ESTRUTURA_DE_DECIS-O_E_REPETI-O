import java.util.Scanner;
public class Principal{
    public static void main(String args[]){
        ExerJavaFor1 e1=new ExerJavaFor1();
        ExerJavaFor2 e2=new ExerJavaFor2();
        ExerJavaFor3 e3=new ExerJavaFor3();
        ExerJavaFor4 e4=new ExerJavaFor4();
        ExerJavaFor5 e5=new ExerJavaFor5();
    int opcao;
            System.out.println("Escolha a opção 1 para imprimir todos os números de 150 a 300.");
            System.out.println("Escolha a opção 2 para imprimir a soma de 1 até 1000.");
            System.out.println("Escolha a opção 3 para imprimir todos os múltiplos de 3, entre 1 e 100.");
            System.out.println("Escolha a opção 4 para imprimir os fatoriais de 1 a 10.");
            System.out.println("Escolha a opção 5 para imprimir o x");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
        if (opcao == 1){
        System.out.println("Resultado Exercício 1: ");
        for(int valor=150; valor<=300;valor++){
            System.out.println(valor);
        }}
        else if (opcao == 2){
        System.out.println("Resultado Exercício 2: ");
        e2.exer2(); }
        else if (opcao == 3){
        System.out.println("Resultado Exercício 3: ");
        e3.exer3(); }
        else if (opcao == 4){
        System.out.println("Resultado Exercício 4: ");
        e4.exer4(); }
        else if (opcao == 5){
        System.out.println("Resultado Exercício 5: ");
        e5.exer5(); }
            
    }
}    
    
