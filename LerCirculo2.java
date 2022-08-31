class LerCirculo2 
{
	public static void main(String[] args) throws Exception 
	{

		Circulo circulo1 = new Circulo();
		System.out.println("dados do circulo!");
		System.out.println("digite o raio: ");
		circulo1.raio = JUtil.readFloat();
		while (circulo1.raio!=0)
		{	
		circulo1.mostrarDados();
		
		
		System.out.println("digite o raio: ");
		circulo1.raio = JUtil.readFloat();

		}//while

	}//main
}//class
