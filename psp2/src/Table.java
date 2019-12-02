import javafx.scene.control.Tab;

import java.util.Scanner;

public class Table /*extends CommonTable*/{
    //this is singleton
    static Table objectTable = new Table();
    private Table(){
         int[][] table = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0} };
    }

    public static Table getObjectTable() {
        return objectTable;
    }

    /*public static Table getInstance()
    {
        if (objectTable == null)
            objectTable = new Table();

        return objectTable;
    }*/
    //===============

    private int[][] table = {{0, 0, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0} };
    //private int[][] tbl2 = new int[setTableSize()][setTableSize()];

    /*private int[][] table = {{0, 0},
            {0, 0}};*/

    public int[][] getTable() {
        return this.table;
    }

    /*{for (int i = 0; i <setTableSize()*setTableSize(); i++){
        for (int j=0;j <setTableSize()*setTableSize();j++)
        tbl2[i][j]=0;
    }
    }

    public int[][] getTbl2() {
        return this.tbl2;
    }*/

    //test new abstraction
    /*private int[][] table1 = new int[size()][size()];
    @Override
    int[][] table() {
        for (int i=0; i<size();i++){
            for (int j=0; j<size();j++)
            table1[i][j] = 0;
        }
        return table1;
    }*/

    /*@Override
    int size() {
        return 2;
    }

    public int[][] getTable1() {
        return table1;
    }*/

    public int setTableSize(){
        Scanner key = new Scanner(System.in);
        return key.nextInt();
    }
}
