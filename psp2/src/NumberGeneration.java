import java.util.HashSet;

public class NumberGeneration /*extends Table*/{
    static int[] generateRandomNumberIntoArray(Table table){


        //int[] result = new int[16];
        int[] result = new int[table.getTable().length*table.getTable().length];

        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < table.getTable().length*table.getTable().length; i++) {
            int add = (int)(Math.random() * table.getTable().length*table.getTable().length);//16 //this is the int we are adding
            while (used.contains(add)) { //while we have already used the number
                add = (int) (Math.random() * table.getTable().length*table.getTable().length); //generate a new one because it's already used
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

        for(int i=0; i<table.getTable().length;i++){
            for(int j=0;j<table.getTable().length;j++){
                //table.getTable()[i][j] = result[(j*4) + i];
                table.getTable()[i][j] = generatedArray[(j*table.getTable().length) + i];
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
