class  CriarPessoa2
{
	public static void main(String[] args) throws Exception
	{
		Pessoa pessoa1;//declara��o
		pessoa1=new Pessoa();//inst�ncia
		Pessoa pessoa2=new Pessoa();



		System.out.println("criando uma pessoa");
		System.out.println("qual seu nome?");
		pessoa1.nome=JUtil.readString();
		//Pessoa.falar();//contexto estatico ou imperativo
		pessoa1.falar();
		System.out.print(""+pessoa1.nome);
	}
}
