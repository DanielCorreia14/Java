class lerRetangulo
{
	public static void main(String[] args) throws Exception
	{
		float base,altura;
		Retangulo retangulo1 = new Retangulo(3,4);
		retangulo1.mostrarDados();
		System.out.println("digite a base: ");
		retangulo1.setBase(JUtil.readFloat());
		while(retangulo1.getBase() !=0){
		System.out.println("digite a altura:" );
		retangulo1.setAltura(JUtil.readFloat());
		retangulo1.mostrarDados();

		System.out.println("digite a base: ");
		retangulo1.setBase(JUtil.readFloat());
		}
	}
}
