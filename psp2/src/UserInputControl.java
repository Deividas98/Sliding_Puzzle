import java.io.IOException;
import java.util.Scanner;

public class UserInputControl {

    private Table table;

    public UserInputControl(Table table) throws IOException {//why exception?
        this.table = table;
    }

    private int sourceI =0, sourceJ=0, destinationI = 0, destinationJ=0;
    public void userInputDirection(){
        Scanner keyboard = new Scanner(System.in);
        char direction = keyboard.next().charAt(0);

        switch (direction){
            case 'd':
                pressedD();
                break;
            case 'a':
                pressedA();
                break;
            case 's':
                pressedS();
                break;
            case 'w':
                pressedW();
                break;
            case 'p':
                System.exit(0);
            default:
                System.out.println("Tokio veiksmo nėra. ivesti kita raide");
        }

    }

    private void pressedD(){
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable().length; j++) {
                if (table.getTable()[i][j] == 0) {
                    sourceI = i;
                    sourceJ = j;
                    destinationJ = j + 1;
                    destinationI = i;
                }
            }
        }
        setNewControlPosition();
    }

    private void pressedA(){
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable().length; j++) {
                if (table.getTable()[i][j] == 0) {
                    sourceI = i;
                    sourceJ = j;
                    destinationJ = j - 1;
                    destinationI = i;
                }
            }
        }
        setNewControlPosition();
    }

    private void pressedS(){
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable().length; j++) {
                if (table.getTable()[i][j] == 0) {
                    sourceI = i;
                    sourceJ = j;
                    destinationJ = j;
                    destinationI = i+1;
                }
            }
        }
        setNewControlPosition();
    }

    private void pressedW(){
       // setSourceValue();
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable().length; j++) {
                if (table.getTable()[i][j] == 0) {
                    sourceI = i;
                    sourceJ = j;
                    destinationJ = j;
                    destinationI = i-1;
                }
            }
        }
        setNewControlPosition();
    }

    private void setNewControlPosition(){
        int tempR = table.getTable()[sourceI][sourceJ];
        table.getTable()[sourceI][sourceJ] = table.getTable()[destinationI][destinationJ];
        table.getTable()[destinationI][destinationJ] = tempR;
        //System.out.println(tempR);
    }

    /*public void setSourceValue(){
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable().length; j++) {
                if (table.getTable()[i][j] == 0) {
                    sourceI = i;
                    sourceJ = j;
                }
            }
        }
    }*/

}
