class q1aula3 
{
	public static void main(String[] args) throws Exception
	{
		float receita, despesa, lucro;
		System.out.println("Informe a despesa em reais: ");
		despesa = JUtil.readFloat();
		System.out.println("informe a receita em reais: ");
		receita= JUtil.readFloat();
		lucro = receita - despesa;
		System.out.println("o valor do lucro da empresa é: "+ lucro +" R$");
		JUtil.pause (); 

		//System.out.println("");
	}
}
