class q6aula03 
{
	public static void main(String[] args) throws Exception
	{
	int conta;
	float saldo,cobra,pagar,limite,novo;
	String nome;
	System.out.println("informe o numero da conta: ");
	conta=JUtil.readInt();
	System.out.println("informe seu nome: ");
	nome=JUtil.readString();
	System.out.println("informe seu saldo no inicio do mês: ");
	saldo=JUtil.readFloat();
	System.out.println("informe o total dos itens cobrados no mes: ");
	cobra=JUtil.readFloat();
	System.out.println("informe o total de pagamentos efetuados no mes: ");
	pagar=JUtil.readFloat();
	System.out.println("Limite autorizado: ");
	limite=JUtil.readFloat();
	novo=saldo+cobra-pagar;
	System.out.println("novo saldo = "+novo);
	if(novo>limite){
	System.out.println("Limite de credito excedido em R$"+ (novo-limite)+" reais");



	}else{
		System.out.println("Ainda pode comprar R$" + (limite-novo) + " reais");
	}
	}
}
