package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        //System.out.println("Insertion Sort!!!");
        for (int outer = 1; outer < input.length; outer++) {
            int key = input[outer];
            int inner = outer - 1;

            while (inner >= 0 && input[inner] > key) {
                input[inner + 1] = input[inner];
                inner = inner - 1;
            }

            input[inner + 1] = key;
        }
    }
}
