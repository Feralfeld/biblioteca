package biblioteca.carregamentos;

import java.util.Scanner;

import biblioteca.model.Livro;

public class Carregamento {

	
	public Livro[] carregaLivros(){
		
		Livro[] livros = new Livro[3];

		Livro livro1 = new Livro();
		livro1.autor = "jubileu";
		livro1.quantidade = 5;
		livro1.titulo = "o gato comeu";

		livros[0] = livro1;

		Livro livro2 = new Livro();
		livro2.autor = "xerischeide";
		livro2.quantidade = 2;
		livro2.titulo = "a arte do cozimento";

		livros[1] = livro2;

		Livro livro3 = new Livro();
		livro3.autor = "hugo baitola";
		livro3.quantidade = 5;
		livro3.titulo = "como chupar uma rola";

		livros[2] = livro3;

		return livros;
	}
	
	public Livro[] adicionaLivro(Livro[] existentes) {
		Livro[] novoEstoque = new Livro[existentes.length + 1];
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < existentes.length; i++) {
			novoEstoque[i] = existentes[i];
		}
		
		System.out.println("Digite o autor e titulo");
		Livro novo = new Livro();
		novo.autor = scan.nextLine();
		novo.titulo = scan.nextLine(); 		
		
		novoEstoque[novoEstoque.length-1] = novo;
		
		return novoEstoque;
	}
	
	
}
