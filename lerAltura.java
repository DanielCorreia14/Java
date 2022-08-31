class lerAltura 
{
	public static void main(String[] args) throws Exception
	{
		
		Altura altura1 = new Altura();
		System.out.println("leitura da altura");
		System.out.println("informe a primeira altura");
		altura1.x=JUtil.readFloat();
		//System.out.println("informe o nome da 1 altura: ");
		//altura1.x=JUtil.readString();
		while (altura1.x!=0)
		{
			System.out.println("informe a outra altura a ser comparada");
			altura1.y=JUtil.readFloat();
			altura1.mostrarDados();
			
			
			System.out.println("informe a primeira altura");
			altura1.x=JUtil.readFloat();
			

		}
	
	
	}
}
