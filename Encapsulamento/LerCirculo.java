class LerCirculo 
{
	public static void main(String[] args) throws Exception 
	{
		//Objeto*circulo1* (Ponteiro) variavel de referÍncia
		
		Circulo circulo1 = new Circulo(5);
		circulo1.mostrarDados();
		System.out.println("dados do circulo!");
		System.out.println("digite o raio: ");
		circulo1.setRaio(JUtil.readFloat());
		while (circulo1.getRaio()!=0)
		{	
		circulo1.mostrarDados();
		
		System.out.println("digite o raio: ");
		circulo1.setRaio(JUtil.readFloat());

		}//while

	}//main
}//class
