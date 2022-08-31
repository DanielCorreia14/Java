class q6aula04 
{
	public static void main(String[] args) throws Exception
	{
		int x;
		System.out.println("digite um valor: ");
		x=JUtil.readInt();
		while (x!=0)
		{
			System.out.println("valor absoluto: "+Math.abs(x));
			System.out.println("Cubo: "+Math.pow(x,3));
			System.out.println("raiz quadrada: "+
				(x>0 ?""  + Math.sqrt(x):"invalida"));
			System.out.println("digite um valor: ");
			x=JUtil.readInt();
		}
		System.out.println("numero invalido!");
	}
}
