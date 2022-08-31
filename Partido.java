class Partido 	
{
	int codigo,filiados;
	String presidente,descricao;
	float assinaturas;
		 
	public boolean aprovado()
	{
	 return (this.assinaturas>=491656);
	}
	public boolean aprovado(float NumeroDeAssinaturasMinimas){
	
	return(NumeroDeAssinaturasMinimas<=this.assinaturas);
	}
	public String classificacao(float NumeroDeAssinaturasMinimas){
	 float x=this.assinaturas/NumeroDeAssinaturasMinimas;
	 String y;
	 if (aprovado(NumeroDeAssinaturasMinimas))
	 { y=("satisfatorio");
	 }else if(x>=0.75)
		 {
	 	y=("insatisfatorio");
	 }else if(x>= 0.5){
	 y=("ruim");
	 
	 }else if(x>= 0.25){
	 y=("muito ruim");
	 
	 }else{
	 y=("pessimo");
	 
	 }
		return(y);


	}
	   public void mostrarDados(){
	System.out.println("o codigo eh: "+this.codigo);
	System.out.println("a descricao eh: "+this.descricao);
	System.out.println("o presidente eh: "+this.presidente);
	System.out.println("a quantidade de filiados sao: "+this.filiados);
	System.out.println("a quantidade de assinaturas sao: "+this.assinaturas);
	}
	
}
