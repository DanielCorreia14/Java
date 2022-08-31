class Pessoa 
{
	String nome;
	String cor;
	float altura;
	float peso;
	char sexo;
	int anoNascimento;

 public void comer (float kg) {
	peso = peso + kg;
 }
 public void andar (float km) {
 peso=peso -km/2f;
 
 }
 public void correr (float km) {
 peso=peso-km;
 
 
 }
 public void  falar () {
 System.out.println("ola!!");
 }
 public void pensar () {}
 public void sorrir () {}
 public void reagir () {}
 public int idade (){
 return(2021-anoNascimento); 
 }


}
