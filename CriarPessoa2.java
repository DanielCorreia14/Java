class  CriarPessoa2
{
	public static void main(String[] args) throws Exception
	{
		Pessoa pessoa1;//declaração
		pessoa1=new Pessoa();//instância
		Pessoa pessoa2=new Pessoa();



		System.out.println("criando uma pessoa");
		System.out.println("qual seu nome?");
		pessoa1.nome=JUtil.readString();
		//Pessoa.falar();//contexto estatico ou imperativo
		pessoa1.falar();
		System.out.print(""+pessoa1.nome);
	}
}
