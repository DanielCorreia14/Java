class LerAresta 
{
	public static void main(String[] args) throws Exception
	{
		
		Cubo cubo1 = new Cubo(2);
		cubo1.mostrarDados();	
		System.out.println("leitura de cubo!");
		System.out.println("digite a aresta do cubo: ");
		cubo1.setAresta(JUtil.readDouble());
		while(cubo1.getAresta()!=0){
		cubo1.mostrarDados();	
		System.out.println("digite a aresta do cubo: ");
		cubo1.setAresta(JUtil.readDouble());
		}
		
	

	}
}
