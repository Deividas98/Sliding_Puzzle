public class IfSolvable {

    static int getInvCount(Table table)
    //static int getInvCount(int[][] arr)
    {
        int inv_count = 0;
        for (int i = 0; i < table.getTable().length - 1; i++)//table length!!!! ...length instead of 2
            for (int j = i + 1; j < table.getTable().length; j++)

                // Value 0 is used for empty space
                if (table.getTable()[j][i] > 0 && table.getTable()[j][i] > 0 &&
                        table.getTable()[j][i] > table.getTable()[i][j])
                    inv_count++;
        return inv_count;
    }

    static boolean isSolvable(Table table)
    //static boolean isSolvable(int[][] table)
    {
        // Count inversions in given 8 puzzle
        int invCount = getInvCount(table);

        // return true if inversion count is even.
        return (invCount % 2 == 0);
    }
}