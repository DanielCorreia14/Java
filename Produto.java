class Produto
{
	int codigo, quantidade, unidade;
	float valort,valoruni1,valoruni2;
	String nome;
		
		public Produto(int codigo, String nome,int quantidade,int unidade, float valoruni1){
		this.nome=nome;
		this.codigo=codigo;
		this.quantidade=quantidade;
		this.unidade=unidade;
		this.valoruni1=valoruni1;
		}

		public float caro(){
		return((Math.max(valoruni1,valoruni2)));
		}
		public float barato(){
		return((Math.min(valoruni1,valoruni2)));
		
		}
		public void mostrarDados(){
		System.out.println("o valor do produto mais caro eh: "+this.caro());
		System.out.println("nome = "+nome);
		System.out.println("codigo = "+codigo);
		System.out.println("quantidade = "+quantidade);
		System.out.println("unidade = "+unidade);
		System.out.println("valoruni1 = "+valoruni1);
		}


}
