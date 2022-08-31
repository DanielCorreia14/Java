class q11aula03 
{
	public static void main(String[] args) throws Exception
		
	{
		String nome,sexo;
		char letra;
		float peso;
		float altura,ideal;
		double homem, mulher,resto;
		System.out.println("informe seu nome: ");
		nome=JUtil.readString();
		System.out.println("informe seu sexo: ");
		sexo=JUtil.readString();
		System.out.println("informe seu peso: ");
		peso = JUtil.readFloat();
		System.out.println("informe sua altura: ");
		altura=JUtil.readFloat();
		homem=(72.7*altura)-58.00;
		mulher=(62.10 * altura) - 44.70;
		System.out.println("Peso ideal para sua altura se for homem = "+homem+" se for mulher ="+mulher);
		
			
			if(sexo.equals("mulher")){
			if(peso>mulher){
				resto=peso-mulher;
				System.out.println("vc esta acima do peso por "+resto+"kilogramas");
			}else{
				resto=mulher-peso;
				System.out.println("vc esta abaixo do peso por = "+resto+ " kilogramas");
			}
			}
			if(sexo.equals("homem")){
			if(peso>homem){
				resto=peso-homem;
				System.out.println("vc esta acima do peso por "+resto+"kilogramas");
			}else{
				resto=homem-peso;
				System.out.println("vc esta abaixo do peso por = "+resto+ " kilogramas");
			}
			}

		
		JUtil.pause();

	}
}
