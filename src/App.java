public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = {10, 0, -5, 5, 15, 2};
        // runBubbleSort();
        runBubblesortAvz();
    }
    public static void runBubblesortAvz() {
        int[] array = new int[]{9, 2, 3, 0, 8, 5, 10, 50, 100};
        //Instanciar la clase
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort(true);
        bSortAvz.printArray();
    }
    // public static void runBubbleSort(){
        // System.out.println("Metodo Burbuja");
        // int[] numeros = {-5, 10, 2, 0, 7};
        // //Instancia de la clase
        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);

        // bubbleSort.sort(numeros, true);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros, false);
        // bubbleSort.printArreglo(numeros);
    //}
}