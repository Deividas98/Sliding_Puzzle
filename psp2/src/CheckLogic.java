public class CheckLogic {
    //from table
    private static int[] tableAsRow = new int[16];
    static void convertToRow(Table table){
        int index = 0;

        for(int i=0;i<table.getTable().length;i++){
            for(int j=0;j<table.getTable()[i].length;j++){
                tableAsRow[index++] = table.getTable()[i][j];
            }
        }
    }

    static boolean sorted(){
        int valueBetweenArrays = 1;
        for (int i=0; i<tableAsRow.length-1;i++){//kaip del pirmo 0 skc? i=1?
            if (tableAsRow[i+1] - tableAsRow[i] != valueBetweenArrays){
                return false;
            }
        }
        return true;
    }
}
