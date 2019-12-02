public class CheckLogic {
    //from table
    //Table table;
   /* static void convertToRow(Table table){
        int[] tableAsRow = new int[table.getTable().length*2];
        int index = 0;

        for(int i=0;i<table.getTable().length;i++){
            for(int j=0;j<table.getTable()[i].length;j++){
                tableAsRow[index++] = table.getTable()[i][j];
            }
        }
    }

    static boolean sorted(Table table){
        int[] tableAsRow = new int[table.getTable().length*2];
        int valueBetweenArrays = 1;
        for (int i=0; i<tableAsRow.length-1;i++){//kaip del pirmo 0 skc? i=1?
            if (tableAsRow[i+1] - tableAsRow[i] != valueBetweenArrays){
                return false;
            }
        }
        return true;
    }*/

    //===
    //j

    static boolean sorted(Table table){
        int[] tableAsRow = new int[table.getTable().length*table.getTable().length];
        int index = 0;

        for(int i=0;i<table.getTable().length;i++){
            for(int j=0;j<table.getTable()[i].length;j++){
                tableAsRow[index++] = table.getTable()[i][j];
            }
        }
        int valueBetweenArrays = -1;
        for (int i=0; i<tableAsRow.length-2;i++){//kaip del pirmo 0 skc? i=1?
            if (tableAsRow[i] - tableAsRow[i+1] != valueBetweenArrays /*&& tableAsRow[0] == 0*/){
                return false;
            }
        }
        return true;
    }
}
