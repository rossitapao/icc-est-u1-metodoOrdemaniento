public class App {
public static void main (String [] args ) throws Exception {
    int [] numeros = { 10,0,-5,5,15,2};
    runBubbleSort();
}



public static void runBubbleSort () {
    System.out.println("Metodo Burbuja");
    int[] numeros = {-5,10,2,0,7};
    //instancia de la clase !! es new....
    // poner parentesis -> ejectutar un metodo
    // poner parentesis a la clase es el metodo constructor 
    // porque consytruye la instancia de la clase
    BubbleSort bubbleSort = new BubbleSort();
    // bubbleSort.printArreglo(numeros);
    // bubbleSort.sortAscendente (numeros);
    // bubbleSort.printArreglo(numeros);
    // bubbleSort.sortDescendet(numeros);
    // bubbleSort.printArreglo(numeros);

    bubbleSort.printArreglo(numeros);
    bubbleSort.sort(numeros,sortAscendente:true );
    bubbleSort.printArreglo(numeros);
    bubbleSort.sort(numeros,sortAscendente: false);
    bubbleSort.printArreglo(numeros);

    

}

}
