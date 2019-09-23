public class Passagem{

	int numero;
	String nome;
	int poltrona;
	String horario;
	double preco;
	String destino;

	public static void main(String[]args){
		
		Passagem p1 = new Passagem();
		
		p1.numero = 10;
		p1.nome = "Cesar";
		p1.poltrona = 2;
		p1.horario = "12h";
		p1.preco = 120.0;
		p1.destino = "Curitiba";
		
		Passagem p2 = new Passagem();
		
		p2.numero = 20;
		p2.nome = "Garrafa Rosa";
		p2.poltrona = 24;
		p2.horario = "24h";
		p2.preco = 69;
		p2.destino = "Colombo";
		
		Passagem[] passagem = new Passagem[2];
		passagens[0] = p1;
		passagens[1] = p2;
		
			for (int[i] i =0; i<=1; i++){
		
		System.out.print(passagens[i].numero);
		System.out.print(passagens[i].nome);
		
		
			}	
	//System.out.println(p1.numero);
	//	System.out.println(p1.nome);
	//System.out.println(p1.poltrona);
	//	System.out.println(p1.horario);
	//	System.out.println(p1.preco);
	//	System.out.println(p1.destino);
		
	//	System.out.println();
		
	//	System.out.println(p2.numero);
	//	System.out.println(p2.nome);
		//System.out.println(p2.poltrona);
		//System.out.println(p2.horario);
		//System.out.println(p2.preco);
		//System.out.println(p2.destino);//
		
		
		
		
		
		
		
    }
}