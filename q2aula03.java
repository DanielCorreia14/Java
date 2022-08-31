class q2aula03 
{
	public static void main(String[] args) throws Exception
	{
		String nome;
		float total,salario, inss;
		System.out.println("informe seu nome: ");
		nome = JUtil.readString();
		System.out.println(" informe seu salario base: ");
		salario = JUtil.readFloat();
		System.out.println("informe o desconto: ");
		inss = JUtil.readFloat();
		total = salario-salario*inss /100f;
		System.out.println("o salario liquido do funcionario eh:"+total);
		JUtil.pause();
	}
}
