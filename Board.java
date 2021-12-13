public class Board {
    //defining the parameters of the board
    int[] row0;
    int[] row1;
    int[] row2;
    int[] row3;
    int[] row4;
   int [] row10;






//setting the board for a individual
    public Board() {
        initBoard();
    }


//creating individual boards
    private void initBoard() {

        row0 = new int[]{1,0,0,0,0,0};
        row1 = new int[]{2,0,0,0,0,0};
        row2 = new int[]{3,0,0,0,0,0};
        row3 = new int[]{4,0,0,0,0,0};
        row4 = new int[]{5,0,0,0,0,0};
        row10 = new int[]{6,1,2,3,4,5};
        }



    }


