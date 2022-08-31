import java.io.*;
class Terceiro
{
	public static void main(String[] args) throws Exception{
	
		float x,y;
		String a;
		DataInputStream A = new DataInputStream (System.in);
		System.out.println("Calculo da media");
		System.out.println("Digite dois numeros:");
		x = Float.valueOf (A.readLine()).floatValue();
		y = Float.valueOf (A.readLine()).floatValue();
		
		//System.out.println("digite outro valor:");
		//y = Integer.valueOf (A.readLine()).intValue();
		System.out.println("calculo da media eh igual a =" +(x+y)/2);
		a = A.readLine();
			
	}

}
