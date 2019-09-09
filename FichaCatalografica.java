import java.util.Scanner;

public class FichaCatalografica {


	int codigoCatalog;
	String doacao;
	String nomeObra;
	String nomeAutor;
	String editora;
	long numeroPag;
	long[]CE = new long[500]; 
	long[]CH = new long[500]; 
	long[]CB = new long[500];


		public static void main(String[] args) {

	FichaCatalografica[] CE = new FichaCatalografica[500];

	Scanner scan = new Scanner(System.in);
	int edit;
	
			for(int i=0; i<500; i++){


	CE[i] = new FichaCatalografica();

	CE[i].codigoCatalog = 15;
	CE[i].doacao = "Esta pendente";
	CE[i].nomeObra = "Calculo Volume";
	CE[i].nomeAutor = "James Stewart";
	CE[i].editora = "Companhia das letras";
	CE[i].numeroPag = 900;

	System.out.println ("O código é: " +CE[i].codigoCatalog);	
	System.out.println ("Doação do livro: " +CE[i].doacao);	
	System.out.println ("O nome da obra é: " +CE[i].nomeObra);	
	System.out.println("O nome do autor é: " +CE[i].nomeAutor);	
	System.out.println("A editora é: " +CE[i].editora);	
	System.out.println("O numero de páginas é: " +CE[i].numeroPag);	
	}

	FichaCatalografica[] CH = new FichaCatalografica[500];


			for(int j=0; j<500; j++){

	CH[j] = new FichaCatalografica();


	CH[j].codigoCatalog = 10;
	CH[j].doacao = "Doado";
	CH[j].nomeObra = "Homo Deus";
	CH[j].nomeAutor = "Yuval Noah Harari";
	CH[j].editora = "Companhia das letras";
	CH[j].numeroPag = 448;	

	System.out.println("O código é: " +CH[j].codigoCatalog);	
	System.out.println("Doação do livro: " +CH[j].doacao);	
	System.out.println("O nome da obra é: " +CH[j].nomeObra);	
	System.out.println("O nome do autor é: " +CH[j].nomeAutor);	
	System.out.println("A editora: " +CH[j].editora);	
	System.out.println("O numero de páginas é: " +CH[j].numeroPag);
	}

	FichaCatalografica[] CB = new FichaCatalografica[500];


			for(int k=0; k<500; k++){

	CB[k] = new FichaCatalografica();

	CB[k].codigoCatalog = 33;
	CB[k].doacao = "Doado";
	CB[k].nomeObra = "A Origem das Espécies";
	CB[k].nomeAutor = "Charles Darwin";
	CB[k].editora = "Martin Claret";
	CB[k].numeroPag = 592;

	System.out.println("O código é: " +CB[k].codigoCatalog);	
	System.out.println("Doação do livro: " +CB[k].doacao);	
	System.out.println("O nome da obra é: " +CB[k].nomeObra);	
	System.out.println("O nome do autor é: " +CB[k].nomeAutor);	
	System.out.println("A editora: " +CB[k].editora);	
	System.out.println("O numero de páginas é: " +CB[k].numeroPag);
	}

	System.out.println("Digite o codigo do Livro: ");

	edit = scan.nextInt();

			for(int i = 0; i < 500; i++){
				if(edit == CE[i].codigoCatalog){
		

	System.out.println("O código é: " +CE[i].codigoCatalog);	
	System.out.println("Doação do livro: " +CE[i].doacao);	
	System.out.println("O nome da obra é: " +CE[i].nomeObra);	
	System.out.println("O nome do autor é: " +CE[i].nomeAutor);	
	System.out.println("A editora: " +CE[i].editora);	
	System.out.println("O numero de páginas é: " +CE[i].numeroPag);

				} else {
					System.out.println("erro");
				


			for(int j = 0; j < 500; j++){
				if(edit == CH[i].codigoCatalog){


	System.out.println("O código é: " +CH[i].codigoCatalog);	
	System.out.println("Doação do livro: " +CH[i].doacao);	
	System.out.println("O nome da obra é: " +CH[i].nomeObra);	
	System.out.println("O nome do autor é: " +CH[i].nomeAutor);	
	System.out.println("A editora: " +CH[i].editora);	
	System.out.println("O numero de páginas é: " +CH[i].numeroPag);


			}else {
				System.out.println("erro");
			

		for(int k = 0; k < 500; k++){
			if(edit == CB[i].codigoCatalog){


	System.out.println("O código é: " +CB[i].codigoCatalog);	
	System.out.println("Doação do livro: " +CB[i].doacao);	
	System.out.println("O nome da obra é: " +CB[i].nomeObra);	
	System.out.println("O nome do autor é: " +CB[i].nomeAutor);	
	System.out.println("A editora: " +CB[i].editora);	
	System.out.println("O numero de páginas é: " +CB[i].numeroPag);

			} else {
	System.out.println("erro");
		}
		}
		}
			}
			}
			}
		}

			
}	
