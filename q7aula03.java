class q7aula03 
{
	public static void main(String[] args) throws Exception
	{
	float receita,gastos;
	System.out.println("informe o a receita da empresa: ");
	receita=JUtil.readFloat();
	System.out.println("informe os gastos da empresa no mes: ");
	gastos=JUtil.readFloat();
	if(receita-gastos>0){
System.out.println("houve lucro");
	}else{
		System.out.println("houve prejuizo");
	}



	}
}
