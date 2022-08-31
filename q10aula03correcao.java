class q10aula03correcao 
{
	public static void main(String[] args) throws Exception
	{
		String nome,sexo;
		
		int idade;
		System.out.println("informe seu nome:");
		nome=JUtil.readString();
		System.out.println("informe sua idade: ");
		idade=JUtil.readInt();
		System.out.println("voce eh homem ou muie: ");
		sexo=JUtil.readString();
		if(sexo.equals("homem")&&idade>=25 && idade<=30){
			if(idade>=25 && idade<=30){
			
				System.out.println("aprovado !!");
			}else{
			System.out.println("reprovado !!");
			}
		} else {

			if(sexo.equals("mulher")&&idade>=18 && idade<=25){
				if(idade>=18 && idade<=25){
				System.out.println("aprovada!!");
				}else{
				System.out.println("reprovada .");
				}
			}else{
				System.out.println("cadastro incompleto .");
			}
		}
			


	}
}
