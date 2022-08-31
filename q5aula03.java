class q5aula03 
{
	public static void main(String[] args) throws Exception
	{
		String nome;
		float peso;
		float altura;
		double homem, mulher;
		System.out.println("informe seu nome: ");
		nome=JUtil.readString();
		System.out.println("informe seu peso: ");
		peso = JUtil.readFloat();
		System.out.println("informe sua altura: ");
		altura=JUtil.readFloat();
		homem=(72.7*altura)-58.00;
		mulher=(62.10 * altura) - 44.70;
		System.out.println("Peso ideal para sua altura se for homem = "+homem+" se for mulher ="+mulher);
		JUtil.pause();

	}
}
