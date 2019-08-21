import java.util.stream.IntStream;

public class CandyCrush {

    public boolean hasMovableFields(char[][] gameboard) {
        boolean heeft3OpRijHorizontaal = IntStream.range(0, gameboard.length)
                .anyMatch(rijnummer -> heeftDrieOpRij(gameboard[rijnummer]));
//        boolean heeft3OpRijVerticaal = false;
        return heeft3OpRijHorizontaal;// || heeft3OpRijVerticaal;
    }

    private boolean heeftDrieOpRij(char[] gameRow) {
        char lastChar = gameRow[0];
        int counter = 0;
        for (char c : gameRow) {

            if (lastChar == c) {
                counter++;
                if (counter == 3) {
                    return true;
                }
            } else {
                lastChar = c;
                counter = 1;
            }
        }
        return false;
    }
}
