class LerCirculo 
{
	public static void main(String[] args) throws Exception 
	{
		//Objeto*circulo1* (Ponteiro) variavel de referÍncia
		
		Circulo circulo1 = new Circulo(5);
		circulo1.mostrarDados();
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
