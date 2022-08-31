class criarCirculo 
{
	public static void main(String[] args) throws Exception
	{

		//Classe objeto = new Classe();
		Circulo circulo1 = new Circulo();//declaração e instancia

		circulo1.raio=9f;
		System.out.println("informacoes do circulo de raio "+ circulo1.raio);
		System.out.println("diametro = "+circulo1.diametro());
		System.out.println("area = "+circulo1.area());
		System.out.println("comprimento = " + circulo1.comprimento());
		System.out.println("area = "+circulo1.area(18));
		JUtil.pause();

	}
}
