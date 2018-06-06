public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arrayComparator = new ArrayComparator();

        int[][] tab1 = {{11, 66, 7}, {89, 4, 2}, {8, 99, 180}};
        int[][] tab2 = {{11, 61, 7}, {89, 4, 2}, {8, 99, 180}};

        if (arrayComparator.compare(tab1, tab2)) System.out.println("The arrays are equal!");
        else System.out.println("The arrays are not equal!");
    }
}
