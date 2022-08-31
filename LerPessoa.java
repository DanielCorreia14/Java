class LerPessoa 
{
	public static void main(String[] args) throws Exception
	{	//tipo variavel
		//classe objeto
		Pessoa pessoa1 = new Pessoa();//declaração e instancia
		float valor;
		System.out.println("Ler Pessoa!");
		System.out.println("digite seu nome: ");
		pessoa1.nome = JUtil.readString();
		System.out.println("Digite seu peso: ");
		pessoa1.peso = JUtil.readFloat();
		System.out.println("peso atual " + pessoa1.peso);
		System.out.println("vc almocou? quantos kg? ");
		valor=JUtil.readFloat();
		pessoa1.comer(valor);
		System.out.println("peso atual" + pessoa1.peso);

		System.out.println("vc andou? quantos km? ");
		pessoa1.andar(JUtil.readFloat());
		System.out.println("peso atual" + pessoa1.peso);
		System.out.println("vc correu? quantos km? ");
		pessoa1.correr(JUtil.readFloat());
		System.out.println("peso atual" + pessoa1.peso);
		System.out.println("informe seu ano de nascimento: ");
		pessoa1.anoNascimento=JUtil.readInt();
		if (pessoa1.idade()<0)
		{System.out.println("ainda nao era nascido.");
		}else{
		System.out.println("sua idade eh: "+pessoa1.idade());
		}
	}
}
 