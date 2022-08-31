class Retangulo
{
	private float base, altura;
		public Retangulo(float base,float altura){
		this.base=base;
		this.altura=altura;
		
		}

		public float getBase(){
		return this.base;}
		public float getAltura(){
		return this.altura;}

		public void setBase(float base){
		this.base=base;
		
		}public void setAltura(float altura){
		this.altura=altura;
		
		}
		public float area(){
		return(this.base*this.altura);
		}
	public float perimetro(){
	return(2*(this.base+this.altura));
	
	}
	public boolean quadrado(){
	
	return(base==altura);
	}
	public void mostrarDados (){
	System.out.println("a area eh: "+this.area());
	System.out.println("o perimetro eh: "+this.perimetro());
	
	}
}
