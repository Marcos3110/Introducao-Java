
package Questao1;

import java.util.Arrays;

    public static void main(String args[]) {
        
       int[][] matriz = { 
            {23, 6, 54345, 1321, 333},
            {33, 28, 4234, 341341, 6},
            {7900, 456789, 496, 496, 33},
            {8128, 6, 14431, 33550336, 890},
            {6, 496, 33550336, 3456, 34524}
        };
        
        int[] numerosPerfeitos = percorrerMatriz(matriz);
        
        System.out.println(Arrays.toString(numerosPerfeitos));
    }
    
    public static int[] percorrerMatriz(int[][] matriz){
        
        int[] numerosP = new int[25];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(verificarPerfeito(matriz[i][j]) && !verificarNaLista(matriz[i][j], numerosP)){
                    for(int k = 0; k < numerosP.length; k++){
                        if(numerosP[k] == 0){
                            numerosP[k] = matriz[i][j];
                            break;
                        }
                    }
                }
            }
        }
        int[] ndef = novoVetor(numerosP);
        return ndef;
    }
    
    public static boolean verificarPerfeito(int numero){
        int valorSoma = 0;
        
        for(int k = 1; k < numero; k++){
            if(numero % k == 0){
              valorSoma += k;  
            }
        }
        
        if(valorSoma == numero){
            return true;
        }
        return false;
    }
    
    public static boolean verificarNaLista(int numero, int[] numerosP){
        
        for(int i = 0; i < numerosP.length; i++){
            if(numero == numerosP[i]){
                return true;
            }
        }
        return false;
    }
    
    public static int[] novoVetor(int[] vetor){
        
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0){
                count++;
            }
        }
        
        int[] novoVetor = new int[count];
        
        for (int i = 0; i < count; i++) {
            novoVetor[i] = vetor[i];
        }
        Arrays.sort(novoVetor);
        return novoVetor;
    }
    
}