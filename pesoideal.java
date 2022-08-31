class pesoideal
{
	public static double cont(double x, double y,double z){
	x=(62.10 * y) - 44.70;
	z=(72.7*y)-58.0;

	
	return(x+z);
	}
	public static void main(String[] args) throws Exception
	{
		double peso,altura;
		double calculo;
		String nome,sexo;
		System.out.println("calculo do peso ideal!");
		System.out.println("digite seu nome: ");
		nome=JUtil.readString();
		while (! nome.equals("sair"))
		{
			System.out.println("informe seu sexo: ");
			sexo = JUtil.readString();
			System.out.println("informe seu peso: ");
			peso=JUtil.readFloat();
			System.out.println("digite sua altura: ");
			altura=JUtil.readFloat();
			if(sexo.equals("m")){
			if (cont(altura)=peso)
			{
				System.out.println("parabens peso ideal!");
			}if(cont(altura)>peso){
			System.out.println("abaixo do peso em "+(cont(altura)-peso)+" kilos");
			}if (cont(altura)<peso)
			{
			System.out.println("abaixo do peso em "+Math.abs(cont(altura)-peso)+" kilos");
			}
			
			
			}


		}


	}
}
