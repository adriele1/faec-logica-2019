public class Produto {
	
	String nome;
	int codigo;
	int preco;
	String mes;
	int[] vendas = new int [30];
	
	public static void main(String[]args){


		Produto p1, p2, p3;
		
		p1 = new Produto();
		p1.nome = "Debi e loide";
		p1.codigo = 10;
		p1.preco = 50;
		p1.mes = "agosto";
		
		p2 = new Produto();
		p2.nome = "Debi e loide";
		p2.codigo = 10;
		p2.preco = 50;
		p2.mes = "agosto";
		
		p3 = new Produto();
		p3.nome = "Debi e loide";
		p3.codigo = 10;
		p3.preco = 50;
		p3.mes = "agosto";
		
			for (int i=0; i<30; i++) {
					p1.vendas[i] = i*i;
					p2.vendas[i] = i*2;
					p3.vendas[i] = i+1;			
			}
		
		int posComMaiorQtd = 0;
		int maiorQtd = -1;
		int maiorQtd1 = -1;
		int maiorQtd2 = -1;
		
		for (int pos=0; pos<30; pos++){
			
			if (p1.vendas[pos] > maiorQtd) {
			
				maiorQtd = p1.vendas[pos];
			}
			if (p2.vendas[pos] > maiorQtd1){
				
				maiorQtd1 = p2.vendas[pos];				
			}
			if (p3.vendas[pos] > maiorQtd2){
				
				maiorQtd2 = p3.vendas[pos];
			}
				
		}
		
		System.out.println("" +maiorQtd);
		System.out.println("" +maiorQtd1);
		System.out.println("" +maiorQtd2);
	}

}