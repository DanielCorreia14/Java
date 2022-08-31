 class CriarPessoa
 { public static void main(String[] args)
 {Pessoa pessoa1;//declaração
 pessoa1 = new Pessoa ();//instancia
 pessoa1.nome = "pedro";
 pessoa1.cor = "morena";
 pessoa1.altura = 1.95f; // metros
 pessoa1.peso = 95f; // Kg
 pessoa1.sexo = 'M';
 System.out.println ("Nome "+ pessoa1.nome +"\nCor " + pessoa1.cor +"\nAltura " + pessoa1.altura +"\nPeso " + pessoa1.peso +"\nSexo " + pessoa1.sexo);

 }
 }