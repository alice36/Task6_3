public class ArrayComparator {
    boolean compare(int[][] tab1, int[][] tab2) {
        if (tab1 == null || tab2 == null) return false;
        if (tab1.length != tab2.length) return false;

        for (int i = 0; i < tab1.length; i++){
            for (int j = 0; j < tab1[1].length; j++) {
                int b1 = tab1[i][j];
                int b2 = tab2[i][j];
                if (b1 != b2) return false;
            }
        }
        return true;
    }
}
