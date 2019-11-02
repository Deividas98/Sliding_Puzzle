import java.util.HashSet;

public class NumberGeneration {
    static int[] generateRandomNumberIntoArray(){

        int[] result = new int[16];

        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < 16; i++) {
            int add = (int)(Math.random() * 16); //this is the int we are adding
            while (used.contains(add)) { //while we have already used the number
                add = (int) (Math.random() * 16); //generate a new one because it's already used
            }
            //by this time, add will be unique
            used.add(add);
            result[i] = add;
            //System.out.print(result[i]+" ");
        }

        return result;
    }

    //array to 2d array
    public static void convertArrayTo2dArray(Table table, int[] generatedArray){

        for(int i=0; i<4;i++){
            for(int j=0;j<4;j++){
                //table.getTable()[i][j] = result[(j*4) + i];
                table.getTable()[i][j] = generatedArray[(j*4) + i];
                if (table.getTable()[i][j] < 10)
                    System.out.print(" " + table.getTable()[i][j] + " ");
                else
                    System.out.print(table.getTable()[i][j] + " ");
            }
            System.out.println();
        }
        table.getTable();
    }
}
