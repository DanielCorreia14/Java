class lerProduto
{
	public static void main(String[] args) throws Exception
	{
		Produto produto1 = new Produto(10,"joao",20,15,35);
		produto1.mostrarDados();
		System.out.println("leitura do produto");
		System.out.println("informe o valor do produto 1: ");
		produto1.valoruni1=JUtil.readFloat();

		while(produto1.valoruni1!=0){
	
		
		System.out.println("informe o valor do produto 2: ");
		produto1.valoruni2=JUtil.readFloat();
		System.out.println("informe o valor do produto 1: ");
		produto1.valoruni1=JUtil.readFloat();
		
		}
		produto1.mostrarDados();
	
	}
}
