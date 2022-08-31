class Cubo 
{
	private double aresta;
	public Cubo(float aresta){
	this.aresta=aresta;
	System.out.println("construtor iniciado");
	}
	public double getAresta(){
	return this.aresta;
	
	}
	public void setAresta(double aresta){
	this.aresta=aresta;
	
	}
	public double area (){
	return(6*(Math.pow(this.aresta,2)));
	
	}
	public double volume(){
	return(Math.pow(this.aresta,3));
	
	}
	public void mostrarDados(){
	System.out.println("a area do cubo eh:" +this.area());
	System.out.println("o volume do cubo eh: "+this.volume());
	}
}
