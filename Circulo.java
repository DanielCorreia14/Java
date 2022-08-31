class Circulo 
{
	float raio;//atributo = variavel de instancia

	//construtores 

	//public Circulo(){}

	public Circulo(float raio){
		//this.atributo = parametro;
		this.raio = raio;
	
	
	
	}
	
	//metodos especiais

	//demais metodos
	public float diametro(){
	return this.raio * 2f;
	
	}	
	public double area(){
	return Math.PI * Math.pow (this.raio,2);
	}
	double comprimento(){
	return 2 * Math.PI * this.raio;
	
	}
	
	double area(float comprimento)//sobrecarga/overloading
	{
		float raio;
		raio = comprimento/2;
	return (Math.pow(raio,2));
	}


	public void mostrarDados(){
		System.out.println("diametro: "+this.diametro());
		System.out.println("area: "+this.area());
		System.out.println("Comprimento: "+this.comprimento());
	
	
	}
}
