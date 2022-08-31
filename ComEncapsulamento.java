class Classe1 
{private int atributo;


public int getAtributo(){
return this.atributo;

}
public void setAtributo(int novo){
 this.atributo= novo;
} 

}
	class ComEncapsulamento
	{public static void main (String[] args){
	Classe1 obj = new Classe1();
	obj.setAtributo(8);
	System.out.println("Atributo = "+obj.getAtributo());

	
	}
		


	};
	
