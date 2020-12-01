import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double notaprova,notaprojeto,notaexercicios,media;
	
	Scanner entrada = new Scanner(System.in);
System.out.println("Digite a nota da prova: ");
notaprova = entrada.nextDouble();

System.out.println("Digite a nota do projeto: ");
notaprojeto = entrada.nextDouble();

System.out.println("Digite a nota do exercício: ");
notaexercicios = entrada.nextDouble();

media = (notaprova+notaprojeto+notaexercicios)/3;
System.out.println("A Média do aluno é: "+media);

if(media>7.9) {
	System.out.println("Aluno aprovado.");}

else { System.out.println(" Aluno reprovado.");}
}
}
	