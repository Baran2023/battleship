/*
USE FULLSCREEN FOR BEST EXPERIENCE

*/
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    // String input = sc.next();

    public static void main(String[] args){
        Board b = new Board();
        Board bshootc = new Board();
        Board c = new Board();
        Board cshootb = new Board();
        Scanner sc = new Scanner(System.in);
        String prompt1 = "Pick a spot to place the ship || example- 1(left) (press enter) 5(bottom)";
        boolean play = true;




        Object PrintBoardB = Arrays.toString(b.row0) + "\n" + Arrays.toString(b.row1) + "\n" + Arrays.toString(b.row2) + "\n" + Arrays.toString(b.row3) + "\n" + Arrays.toString(b.row4) + "\n" + Arrays.toString(b.row10);

        Object PrintBoardC = Arrays.toString(c.row0) + "\n" + Arrays.toString(c.row1) + "\n" + Arrays.toString(c.row2) + "\n" + Arrays.toString(c.row3) + "\n" + Arrays.toString(c.row4) + "\n"+ Arrays.toString(c.row10);
// below is the section used to hide the previous player's move and prevent cheating
        String hide = """
                im walkin here:)  \s




































                """;
//show a hit
        String hit =
                "ooooo ooooo ooooo ooooooooooo  oo  \n" +
                " 888   888   888  88  888  88 8888 \n" +
                " 888ooo888   888      888     8888 \n" +
                " 888   888   888      888      88  \n" +
                "o888o o888o o888o    o888o     oo \n" +
                "\n";

//show a miss
        String miss =
                "              o88                          \n" +
                "oo ooo oooo   oooo   oooooooo8  oooooooo8  \n" +
                " 888 888 888   888  888ooooooo 888ooooooo  \n" +
                " 888 888 888   888          888        888 \n" +
                "o888o888o888o o888o 88oooooo88 88oooooo88  \n"  +
                "                                                 ";

// title screen
        String title =
                "oooooooooo      o   ooooooooooo ooooooooooo ooooo       ooooooooooo  oooooooo8 ooooo ooooo ooooo oooooooooo   oo  \n" +
                " 888    888    888  88  888  88 88  888  88  888         888    88  888         888   888   888   888    888 8888 \n" +
                " 888oooo88    8  88     888         888      888         888ooo8     888oooooo  888ooo888   888   888oooo88  8888 \n" +
                " 888    888  8oooo88    888         888      888      o  888    oo          888 888   888   888   888         88  \n" +
                "o888ooo888 o88o  o888o o888o       o888o    o888ooooo88 o888ooo8888 o88oooo888 o888o o888o o888o o888o        oo  \n" +
                "                                 8 is a ship     9 is a hit    2 is a miss                                                                                                             ";


// title screen, must be opened in full screen or it looks stupid and broken
        System.out.println(title);




        System.out.println(PrintBoardB);




// the loop for player one picking their 4 ships
System.out.println("player one is about to pick their ships");
        for (int i = 0; i < 4; i++) {

            System.out.println(prompt1);
            String yinput = sc.next();
            int xinput = sc.nextInt();


            System.out.println("you have selected y cord " + yinput + " and the x cord " + xinput);
            if (Objects.equals(yinput, "1")) {
                b.row0[xinput] = 8;
                System.out.println(Arrays.toString(b.row0));

            }
            if (Objects.equals(yinput, "2")) {
                b.row1[xinput] = 8;
                System.out.println(Arrays.toString(b.row1));

            }
            if (Objects.equals(yinput, "3")) {
                b.row2[xinput] = 8;
                System.out.println(Arrays.toString(b.row2));

            }
            if (Objects.equals(yinput, "4")) {
                b.row3[xinput] = 8;
                System.out.println(Arrays.toString(b.row3));

            }
            if (Objects.equals(yinput, "5")) {
                b.row4[xinput] = 8;
                System.out.println(Arrays.toString(b.row4));

            }

        }
// same thing for the 2nd player
        System.out.println(hide);
        System.out.println("player two is about to pick their ships");
        for (int i = 0; i < 4; i++) {

            System.out.println(prompt1);
            String yinput = sc.next();
            int xinput = sc.nextInt();


            System.out.println("you have selected row " + yinput + " and the x cord " + xinput);
            if (Objects.equals(yinput, "1")) {
                c.row0[xinput] = 8;
                System.out.println(Arrays.toString(c.row0));

            }
            if (Objects.equals(yinput, "2")) {
                c.row1[xinput] = 8;
                System.out.println(Arrays.toString(c.row1));

            }
            if (Objects.equals(yinput, "3")) {
                c.row2[xinput] = 8;
                System.out.println(Arrays.toString(c.row2));

            }
            if (Objects.equals(yinput, "4")) {
                c.row3[xinput] = 8;
                System.out.println(Arrays.toString(c.row3));

            }
            if (Objects.equals(yinput, "5")) {
                c.row4[xinput] = 8;
                System.out.println(Arrays.toString(c.row4));

            }
        }
        // set the values for the win condition and hides the selections of the player
           int Bcount = 4;
           int Ccount = 4;
           System.out.println(hide);
//what decides if the game should end for player 2
        while (Ccount > 0  && Bcount > 0) {

           // System.out.println(hide);
            System.out.println("Player one pick where to shoot");
            Object BshootC = Arrays.toString(bshootc.row0) + '\n' + Arrays.toString(bshootc.row1) + '\n' + Arrays.toString(bshootc.row2) + '\n' + Arrays.toString(bshootc.row3) + '\n' + Arrays.toString(bshootc.row4) + '\n' + Arrays.toString(bshootc.row10);
            System.out.println(BshootC);
            System.out.println("-------------------");
            System.out.println(Arrays.toString(b.row0) + "\n" + Arrays.toString(b.row1) + '\n' + Arrays.toString(b.row2) + '\n' + Arrays.toString(b.row3) + '\n' + Arrays.toString(b.row4) + '\n' + Arrays.toString(b.row10));


            int yinput = sc.nextInt();
            int xinput = sc.nextInt();

            System.out.println(hide);


            if (yinput == 1) {
                if (c.row0[xinput] != 8) {

                    System.out.println(miss);
                    c.row0[xinput] = 2;
                    bshootc.row0[xinput] = 2;
                } else {
                    bshootc.row0[xinput] = 9;
                    c.row0[xinput] = 9;
                    System.out.println(hit);
                    Ccount--;

                }
            }

            if (yinput == 2) {
                if (c.row1[xinput] != 8) {

                    System.out.println(miss);
                    c.row1[xinput] = 2;
                    bshootc.row1[xinput] = 2;
                } else {
                    bshootc.row1[xinput] = 9;
                    c.row1[xinput] = 9;
                    System.out.println(hit);
                    Ccount--;

                }
            }


            if (yinput == 3) {
                if (c.row2[xinput] != 8) {

                    System.out.println(miss);
                    c.row2[xinput] = 2;
                    bshootc.row2[xinput] = 2;
                } else {
                    bshootc.row2[xinput] = 9;
                    c.row2[xinput] = 9;
                    System.out.println(hit);
                    Ccount--;

                }
            }

            if (yinput == 4) {
                if (c.row3[xinput] != 8) {

                    System.out.println(miss);
                    c.row3[xinput] = 2;
                    bshootc.row3[xinput] = 2;
                } else {
                    bshootc.row3[xinput] = 9;
                    c.row3[xinput] = 9;
                    System.out.println(hit);
                    Ccount--;

                }
            }

            if (yinput == 5) {
                if (c.row4[xinput] != 8) {

                    System.out.println(miss);
                    c.row4[xinput] = 2;
                    bshootc.row4[xinput] = 2;
                } else {
                    bshootc.row4[xinput] = 9;
                    c.row4[xinput] = 9;
                    System.out.println(hit);
                    Ccount--;

                }


            }
            //what decides if the game should end for player one
            if (Ccount == 0 ) {
                break;
            }
//player 2 shooting
            System.out.println("Player two pick where to shoot");
            Object CshootB = Arrays.toString(cshootb.row0) + '\n' + Arrays.toString(cshootb.row1) + '\n' + Arrays.toString(cshootb.row2) + '\n' + Arrays.toString(cshootb.row3) + '\n' + Arrays.toString(cshootb.row4) + '\n' + Arrays.toString(cshootb.row10);
            System.out.println(CshootB);
            System.out.println("-------------------");
            System.out.println(Arrays.toString(c.row0) + "\n" + Arrays.toString(c.row1) + '\n' + Arrays.toString(c.row2) + '\n' + Arrays.toString(c.row3) + '\n' + Arrays.toString(c.row4) + '\n' + Arrays.toString(c.row10));

            yinput = sc.nextInt();
            xinput = sc.nextInt();

            System.out.println(hide);

            if (yinput == 1) {
                if (b.row0[xinput] != 8) {

                    System.out.println(miss);
                    b.row0[xinput] = 2;
                    cshootb.row0[xinput] = 2;
                } else {
                    cshootb.row0[xinput] = 9;
                    b.row0[xinput] = 9;
                    System.out.println(hit);
                    Bcount--;

                }
            }


            if (yinput == 2) {
                if (b.row1[xinput] != 8) {

                    System.out.println(miss);
                    b.row1[xinput] = 2;
                    cshootb.row1[xinput] = 2;
                } else {
                    cshootb.row1[xinput] = 9;
                    b.row1[xinput] = 9;
                    System.out.println(hit);
                    Bcount--;

                }
            }

            if (yinput == 3) {
                if (b.row2[xinput] != 8) {

                    System.out.println(miss);
                    b.row2[xinput] = 2;
                    cshootb.row2[xinput] = 2;
                } else {
                    cshootb.row2[xinput] = 9;
                    b.row2[xinput] = 9;
                    System.out.println(hit);
                    Bcount--;

                }
            }


            if (yinput == 4) {
                if (b.row3[xinput] != 8) {

                    System.out.println(miss);
                    b.row3[xinput] = 2;
                    cshootb.row3[xinput] = 2;
                } else {
                    cshootb.row3[xinput] = 9;
                    b.row3[xinput] = 9;
                    System.out.println(hit);
                    Bcount--;

                }
            }


            if (yinput == 5) {
                if (b.row4[xinput] != 8) {

                    System.out.println(miss);
                    b.row4[xinput] = 2;
                    cshootb.row4[xinput] = 2;
                } else {
                    cshootb.row4[xinput] = 9;
                    b.row4[xinput] = 9;
                    System.out.println(hit);
                    Bcount--;

                }

            }
        }





//print if player one wins
if (Bcount == 0){
    System.out.println(
            "oooooooooo ooooo                                                           oo                     o88                           oo  \n" +
            " 888    888 888          ooooooo oooo   oooo ooooooooo8 oo oooooo        o888       oooo  o  oooo oooo  oo oooooo    oooooooo8 8888 \n" +
            " 888oooo88  888          ooooo888 888   888 888oooooo8   888    888       888        888 888 888   888   888   888  888ooooooo 8888 \n" +
            " 888        888      o 888    888  888 888  888          888              888         888888888    888   888   888          888 88  \n" +
            "o888o      o888ooooo88  88ooo88 8o   8888     88oooo888 o888o            o888o         88   88    o888o o888o o888o 88oooooo88  oo  \n" +
            "                                  o8o888                                                                                           ");



}
//print if player 2 wins 
if (Ccount == 0){
    System.out.println(
            "oooooooooo o888                                                     ooooooo        oooo     oooo o88                           oo  \n" +
            " 888    888 888   ooooooo oooo   oooo ooooooooo8 oo oooooo        o88     888       88   88  88  oooo  oo oooooo    oooooooo8 8888 \n" +
            " 888oooo88  888   ooooo888 888   888 888oooooo8   888    888            o888         88 888 88    888   888   888  888ooooooo 8888 \n" +
            " 888        888 888    888  888 888  888          888                o888   o         888 888     888   888   888          888 88  \n" +
            "o888o      o888o 88ooo88 8o   8888     88oooo888 o888o            o8888oooo88          8   8     o888o o888o o888o 88oooooo88  oo  \n" +
            "                           o8o888                                                                                                 ");
}

        }
}
