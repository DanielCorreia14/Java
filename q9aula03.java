class q9aula03 
{
	public static void main(String[] args) throws Exception
	{
		float a,km1,km2,litros,quilometragem;
		float b,c,capacidade,preco,d;
		float limite;
		System.out.println("informe a km do odometro antes da viagem: ");
		km1=JUtil.readFloat();
		System.out.println("informe a km do odometro depois da viagem: ");
		km2=JUtil.readFloat();
		System.out.println("informe a quantidade de litros gastos: ");
		litros = JUtil.readFloat();
		System.out.println("informe o preco do litro: ");
		preco = JUtil.readFloat();
		System.out.println("informe a capacidade: ");
		capacidade = JUtil.readFloat();
		System.out.println("informe o limite saudavel para o seu carro:");
		limite=JUtil.readFloat();
		a= km2-km1;
		b=a/litros;
		c=b* capacidade;
		d=litros*preco;
			if(b<limite){
			System.out.println("seu carro precisa de uma revisão");
						}
		
		System.out.println("a quilometragem rodada eh: "+a+" o consumo eh: "+b+" a autonomia do veiculo eh: "+c+" e o custo eh: "+d);
		JUtil.pause();

	}
}
