import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Table table = new Table();
        System.out.println("Move with: w, a, s, d.\nTo exit press: p.\nYou will win when you sort every number ascending order. (0 should be the last number)\n");

        //patikrinti ar sito reikia
        ArrayList<Integer> numbers = new ArrayList<>();
        Random randomGenerator = new Random();
        while (numbers.size() < 4) {

            int random = randomGenerator .nextInt(4);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        //got generated numbers to array without duplication
        int[] generatedArray = NumberGeneration.generateRandomNumberIntoArray();
        /*for (int i=0; i<generatedArray.length;i++){
            System.out.print(generatedArray[i]+" ");
        }*/
//==================================================
        //System.out.println("\n");

       NumberGeneration.convertArrayTo2dArray(table, generatedArray);

        UserInputControl userControl = new UserInputControl(table);
        while (true) {
            try {
                userControl.userInputDirection();
            } catch (Exception e) {
                System.out.println("Negalimas veiksmas. bandyti eiti kitur.");
                continue;
            }

            for (int i = 0; i < table.getTable().length; i++) {
                for (int j = 0; j < table.getTable().length; j++) {
                    if (table.getTable()[i][j] < 10)
                        System.out.print(" " + table.getTable()[i][j] + " ");
                    else
                    System.out.print(table.getTable()[i][j] + " ");
                }
                System.out.println();
            }

            CheckLogic.convertToRow(table);
            /*for (int i=0;i<16;i++)
                System.out.print(sumMatrix(table)[i]+" ");
            System.out.println();*/

            if (CheckLogic.sorted()){
                System.out.println("You completed the game!");
                System.exit(0);
            }
        }

    }

}
