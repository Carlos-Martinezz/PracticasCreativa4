package com.carlos.springboot.app.primosheldon;

/*
 «El 73 es el 21.er número primo. Al invertir sus cifras
  obtenemos 37, que es el primo número 12. Y al invertir este
   obtenemos 21, que es el producto de —agarraos fuerte— 7 y 3». 
   
   diremos que abcd es un primo de Sheldon si cumple que
    a×b×c×d = xyz y si, además, dcba es el zyx-ésimo
     número primo.
 */
public class PrimoSheldon {
	
	public static void main(String[] args) {
		
		//Iteramos el bucle para validar cada numero entre counter = 1 y N(entre 1 y 1,000,000) cantidad
		for (int counter = 1; counter <= 100000; counter ++) {
			
			//Excluimos el 71 (En desarrollo aún)
			if(counter != 71) {
				
				//Agregamos el número actual al Buffer
				int xyz = 1;
				StringBuffer numIntro = new StringBuffer();
				numIntro.append(counter);
	
				for (char valor : numIntro.toString().toCharArray()) {
					xyz *= Character.getNumericValue(valor);
				}
				
				StringBuffer dcba = new StringBuffer();
				dcba.append(numIntro);
				dcba.reverse();
				StringBuffer zyx = new StringBuffer(String.valueOf(xyz));
				zyx=zyx.reverse();
				
				//Si el número iterado es primo de Sheldon se imprime en consola
				if (PrimosSheldon.primo(dcba,zyx)) {
					System.out.println(numIntro + " es primo de Sheldon");
				} 
			}
			
		}

	}

	
}