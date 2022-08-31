class Altura 
{

	float x,y;
	String z;
	public float conta(){
	return((Math.max(x,y))-(Math.min(x,y)));}
	public void mostrarDados(){
	System.out.println("O valor da diferenca das alturas eh: "+this.conta());
	
	}
	public String aloc(){
		return(z);
	}
	
}
