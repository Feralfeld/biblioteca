package biblioteca;

import java.util.Scanner;

import biblioteca.carregamentos.Carregamento;
import biblioteca.model.Livro;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carregamento carregar = new Carregamento();
		
		Livro[] livros = carregar.carregaLivros();
		
		boolean loop = true;
		int opcao;
		
		while(loop) {
			System.out.println("Digite uma opcao");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 0: //sai do programa
				loop = false;			
				break;
			case 1: // imprimi os livros
				for(int i =0 ; i < livros.length ; i++) {
					System.out.println("livro " + i);
					System.out.println(livros[i].autor);
					System.out.println(livros[i].titulo);
				}
				break;
			case 2: // adiciona livro
				livros = carregar.adicionaLivro(livros);
				break;
			default:
				break;
			}
			
		}
		
		
	}
	
}
