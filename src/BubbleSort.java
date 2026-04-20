public class BubbleSort {
 // Constructor   
    public BubbleSort () {
        System.out.println("se creo la clase en el constructor");
     }
    
     public void sortAscendente (int numeros []) {
        for (int i = 0; i < numeros.length; i++){
            for(int j = i+1; j< numeros.length; j++){
                //comparaciopn
                if(numeros[i]>numeros[j]){
                    // si cumple -> intercambio
                    int aux = numeros[i];
                    numeros [i] = numeros [j];
                    numeros [j] = aux;
                }


            }

        }
        

        }
        public void sortDescendet(int[]numeros){
    }
    public void printArreglo(int[] numeros) {
        for (int i : numeros) {
          // ln salta la linea  
            System.out.print(i + ",");
        }
        System.out.println();
    public void sort(int[]numeros, boolean sortAscendente){ 
        if(sortAscendente){
            sortAscendente(numeros)
        }

    }
    
    }  


        
}
