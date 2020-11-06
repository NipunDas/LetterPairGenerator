public class letterGenerator {

    public static String getCornerPair() {
        //Declaring characters to store final letter pair that the method returns
        char letter1, letter2;

        //Character arrays declared and initialized to contain all possible corner letters
        char[] piece1, piece2, piece3, piece4, piece5, piece6, piece7;
        piece1 = new char[]{'A', 'Y', 'N'};
        piece2 = new char[]{'B', 'M', 'J'};
        piece3 = new char[]{'D', 'R', 'E'};
        piece4 = new char[]{'U', 'S', 'H'};
        piece5 = new char[]{'V', 'G', 'L'};
        piece6 = new char[]{'W', 'K', 'P'};
        piece7 = new char[]{'T', 'X', 'O'};
        char[][] pieces = new char[][]{piece1, piece2, piece3, piece4, piece5, piece6, piece7};

        //Random number generators to help pick random letter pair
        int piecePicker1 = (int) (7 * Math.random());
        int piecePicker2 = (int) (7 * Math.random());
        while (piecePicker2 == piecePicker1) {piecePicker2 = (int) (7* Math.random());}
        int orientationPicker = (int) (3 * Math.random());

        //Picking random letters and assigning variables to those values
        letter1 = pieces[piecePicker1][orientationPicker];
        orientationPicker = (int) (3 * Math.random());
        letter2 = pieces[piecePicker2][orientationPicker];

        //Returning the two characters in the form of a String
        return String.valueOf(letter1) + letter2;
    }

    public static String getEdgePair() {
        //Declaring characters to store final letter pair that the method returns
        char letter1, letter2;

        //Character arrays declared and initialized to contain all possible corner letters
        char[] piece1, piece2, piece3, piece4, piece5, piece6, piece7, piece8, piece9, piece10, piece11;
        piece1 = new char[]{'A', 'M'};
        piece2 = new char[]{'B', 'I'};
        piece3 = new char[]{'D', 'Y'};
        piece4 = new char[]{'F', 'L'};
        piece5 = new char[]{'G', 'U'};
        piece6 = new char[]{'H', 'R'};
        piece7 = new char[]{'J', 'P'};
        piece8 = new char[]{'K', 'V'};
        piece9 = new char[]{'N', 'T'};
        piece10 = new char[]{'O', 'Z'};
        piece11 = new char[]{'S', 'X'};
        char[][] pieces = new char[][]{piece1, piece2, piece3, piece4, piece5, piece6, piece7, piece8, piece9, piece10, piece11,};

        //Random number generators to help pick random letter pair
        int piecePicker1 = (int) (11 * Math.random());
        int piecePicker2 = (int) (11 * Math.random());
        while (piecePicker2 == piecePicker1) {piecePicker2 = (int) (11 * Math.random());}
        int orientationPicker = (int) (2 * Math.random());

        //Picking random letters and assigning variables to those values
        letter1 = pieces[piecePicker1][orientationPicker];
        orientationPicker = (int) (2 * Math.random());
        letter2 = pieces[piecePicker2][orientationPicker];

        //Returning the two characters in the form of a String
        return String.valueOf(letter1) + letter2;
    }
}
