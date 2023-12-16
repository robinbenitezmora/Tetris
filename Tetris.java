import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import java.awt.Color;
import java.awt.Color;
import java.awt.Color;

public class Tetris extends JFrame implements KeyListener {
    int pos[] = { 0, 1 };
    boolean bottom = false;
    int n = 20;
    int m = 10;
    JButton b[][];
    Color tmp[][] = new Color[m][n];
    int rand = 0;
    int centralx = 0;
    int centraly = 0;
    int deltax = 0;
    int perim[][] = new int[m + 4][n + 4];
    or[][][] prof = new or[4][4][7];
    java.awt.Color rnd = { Color.RED, Color.YELLOW, Color.CYAN, Color.GREEN, Color.WHITE, Color.BLUE, Color.ORANGE };
    int rowscird = 0;

    public Tetris() {
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                for (int c = 0; c < 7; c++) {
                    prof[a][b][c] = new or();
                }
            }
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        prof[0][0][0].x = -1;
        prof[0][1][0].x = 0;
        prof[0][2][0].x = 0;
        prof[0][3][0].x = 1;
        prof[1][0][0].x = 0;
        prof[1][1][0].x = 0;
        prof[1][2][0].x = -1;
        prof[1][3][0].x = -1;
        prof[2][0][0].x = 1;
        prof[2][1][0].x = 0;
        prof[2][2][0].x = 0;
        prof[2][3][0].x = -1;
        prof[3][0][0].x = 0;
        prof[3][1][0].x = 0;
        prof[3][2][0].x = 1;
        prof[3][3][0].x = 1;
        prof[0][0][1].x = -1;
        prof[0][1][1].x = -1;
        prof[0][2][1].x = 0;
        prof[0][3][1].x = 1;
        prof[1][0][1].x = -1;
        prof[1][1][1].x = 0;
        prof[1][2][1].x = 0;
        prof[1][3][1].x = 0;
        prof[2][0][1].x = 1;
        prof[2][1][1].x = 1;
        prof[2][2][1].x = 0;
        prof[2][3][1].x = -1;
        prof[3][0][1].x = 1;
        prof[3][1][1].x = 0;
        prof[3][2][1].x = 0;
        prof[3][3][1].x = 0;
        prof[0][0][2].x = -1;
        prof[0][1][2].x = 0;
        prof[0][2][2].x = 1;
        prof[0][3][2].x = 1;
        prof[1][0][2].x = 0;
        prof[1][1][2].x = 0;
        prof[1][2][2].x = 0;
        prof[1][3][2].x = -1;
        prof[2][0][2].x = 1;
        prof[2][1][2].x = 0;
        prof[2][2][2].x = -1;
        prof[2][3][2].x = -1;
        prof[3][0][2].x = 0;
        prof[3][1][2].x = 0;
        prof[3][2][2].x = 0;
        prof[3][3][2].x = 1;
        prof[0][0][3].x = -1;
        prof[0][1][3].x = 0;
        prof[0][2][3].x = 0;
        prof[0][3][3].x = 1;
        prof[1][0][3].x = -1;
        prof[1][1][3].x = -1;
        prof[1][2][3].x = 0;
        prof[1][3][3].x = 0;
        prof[2][0][3].x = 1;
        prof[2][1][3].x = 0;
        prof[2][2][3].x = 0;
        prof[2][3][3].x = -1;
        prof[3][0][3].x = 1;
        prof[3][1][3].x = 1;
        prof[3][2][3].x = 0;
        prof[3][3][3].x = 0;
        prof[0][0][4].x = -1;
        prof[0][1][4].x = 0;
        prof[0][2][4].x = 0;
        prof[0][3][4].x = 1;
        prof[1][0][4].x = 0;
        prof[1][1][4].x = 0;
        prof[1][2][4].x = -1;
        prof[1][3][4].x = 0;
        prof[2][0][4].x = 1;
        prof[2][1][4].x = 0;
        prof[2][2][4].x = 0;
        prof[2][3][4].x = -1;
        prof[3][0][4].x = 0;
        prof[3][1][4].x = 0;
        prof[3][2][4].x = 1;
        prof[3][3][4].x = 0;
        prof[0][0][5].x = 0;
        prof[0][1][5].x = 0;
        prof[0][2][5].x = 1;
        prof[0][3][5].x = 1;
        prof[1][0][5].x = 0;
        prof[1][1][5].x = 0;
        prof[1][2][5].x = 1;
        prof[1][3][5].x = 1;
        prof[2][0][5].x = 0;
        prof[2][1][5].x = 0;
        prof[2][2][5].x = 1;
        prof[2][3][5].x = 1;
        prof[3][0][5].x = 0;
        prof[3][1][5].x = 0;
        prof[3][2][5].x = 1;
        prof[3][3][5].x = 1;
        prof[0][0][6].x = -1;
        prof[0][1][6].x = 0;
        prof[0][2][6].x = 1;
        prof[0][3][6].x = 2;
        prof[1][0][6].x = 0;
        prof[1][1][6].x = 0;
        prof[1][2][6].x = 0;
        prof[1][3][6].x = 0;
        prof[2][0][6].x = 1;
        prof[2][1][6].x = 0;
        prof[2][2][6].x = -1;
        prof[2][3][6].x = -2;
        prof[3][0][6].x = 0;
        prof[3][1][6].x = 0;
        prof[3][2][6].x = 0;
        prof[3][3][6].x = 0;
        prof[0][0][0].y = 0;
        prof[0][1][0].y = 0;
        prof[0][2][0].y = 1;
        prof[0][3][0].y = 1;
        prof[1][0][0].y = -1;
        prof[1][1][0].y = 0;
        prof[1][2][0].y = 0;
        prof[1][3][0].y = 1;
        prof[2][0][0].y = 0;
        prof[2][1][0].y = 0;
        prof[2][2][0].y = -1;
        prof[2][3][0].y = -1;
        prof[3][0][0].y = 1;
        prof[3][1][0].y = 0;
        prof[3][2][0].y = 0;
        prof[3][3][0].y = -1;
        prof[0][0][1].y = 0;
        prof[0][1][1].y = 1;
        prof[0][2][1].y = 0;
        prof[0][3][1].y = 0;
        prof[1][0][1].y = -1;
        prof[1][1][1].y = -1;
        prof[1][2][1].y = 0;
        prof[1][3][1].y = 1;
        prof[2][0][1].y = -1;
        prof[2][1][1].y = 0;
        prof[2][2][1].y = 0;
        prof[2][3][1].y = 0;
        prof[3][0][1].y = 1;
        prof[3][1][1].y = 1;
        prof[3][2][1].y = 0;
        prof[3][3][1].y = -1;
        prof[0][0][2].y = 0;
        prof[0][1][2].y = 0;
        prof[0][2][2].y = 0;
        prof[0][3][2].y = 1;
        prof[1][0][2].y = -1;
        prof[1][1][2].y = 0;
        prof[1][2][2].y = 1;
        prof[1][3][2].y = 1;
        prof[2][0][2].y = 0;
        prof[2][1][2].y = 0;
        prof[2][2][2].y = 0;
        prof[2][3][2].y = -1;
        prof[3][0][2].y = 1;
        prof[3][1][2].y = 0;
        prof[3][2][2].y = -1;
        prof[3][3][2].y = -1;
        prof[0][0][3].y = 1;
        prof[0][1][3].y = 1;
        prof[0][2][3].y = 0;
        prof[0][3][3].y = 0;
        prof[1][0][3].y = -1;
        prof[1][1][3].y = 0;
        prof[1][2][3].y = 0;
        prof[1][3][3].y = 1;
        prof[2][0][3].y = -1;
        prof[2][1][3].y = -1;
        prof[2][2][3].y = 0;
        prof[2][3][3].y = 0;
        prof[3][0][3].y = 1;
        prof[3][1][3].y = 0;
        prof[3][2][3].y = 0;
        prof[3][3][3].y = -1;
        prof[0][0][4].y = 0;
        prof[0][1][4].y = 0;
        prof[0][2][4].y = 1;
        prof[0][3][4].y = 0;
        prof[1][0][4].y = -1;
        prof[1][1][4].y = 0;
        prof[1][2][4].y = 0;
        prof[1][3][4].y = 1;
        prof[2][0][4].y = 0;
        prof[2][1][4].y = 0;
        prof[2][2][4].y = -1;
        prof[2][3][4].y = 0;
        prof[3][0][4].y = 1;
        prof[3][1][4].y = 0;
        prof[3][2][4].y = 0;
        prof[3][3][4].y = -1;
        prof[0][0][5].y = 0;
        prof[0][1][5].y = 1;
        prof[0][2][5].y = 0;
        prof[0][3][5].y = 1;
        prof[1][0][5].y = 0;
        prof[1][1][5].y = 1;
        prof[1][2][5].y = 0;
        prof[1][3][5].y = 1;
        prof[2][0][5].y = 0;
        prof[2][1][5].y = 1;
        prof[2][2][5].y = 0;
        prof[2][3][5].y = 1;
        prof[3][0][5].y = 0;
        prof[3][1][5].y = 1;
        prof[3][2][5].y = 0;
        prof[3][3][5].y = 1;
        prof[0][0][6].y = 0;
        prof[0][1][6].y = 0;
        prof[0][2][6].y = 0;
        prof[0][3][6].y = 0;
        prof[1][0][6].y = -1;
        prof[1][1][6].y = 0;
        prof[1][2][6].y = 1;
        prof[1][3][6].y = 2;
        prof[2][0][6].y = 0;
        prof[2][1][6].y = 0;
        prof[2][2][6].y = 0;
        prof[2][3][6].y = 0;
        prof[3][0][6].y = -1;
        prof[3][1][6].y = 0;
        prof[3][2][6].y = 1;
        prof[3][3][6].y = 2;

        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < m + 4; x++) {
                perim[x][y] = 1;
            }
        }

        for (int y = n + 2; y < n + 4; y++) {
            for (int x = 0; x < m + 4; x++) {
                perim[x][y] = 4;
            }
        }

        for (int y = 2; y < n + 2; y++) {
            for (int x = 0; x < 2; x++) {
                perim[x][y] = 2;
            }
        }
        for (int y = 2; y < n + 2; y++) {
            for (int x = m + 2; x < m + 4; x++) {
                perim[x][y] = 2;
            }
        }
        for (int y = 0; y < n + 4; y++) {
            for (int x = 0; x < m + 4; x++) {
                System.out.print(perim[x][y]);
            }
            System.out.println("");
        }
        setLayout((LayoutManager) new GridLayout());
        addKeyListener((java.awt.event.KeyListener) this);
        pack();
        setVisible(true);
        blockgen();
    }

    class or {
        int x;
        int y;
    }

    private void blockgen() {
            Component temporaryLostComponent = null;
            pos[0] = 0;
            @Override
            void go() {
                // Add the implementation of the go() method here
            }

            int rowsclrd = 0; // Declare and initialize the variable rowsclrd
            centraly = 0;
            System.out.print(rand);
            if ((b[4+prof[pos[0]][0][rand-1].x][prof[pos[0]][0][rand-1].y].getBackground() == Color.DARK_GRAY) &&
                (b[4+prof[pos[0]][1][rand-1].x][prof[pos[0]][1][rand-1].y].getBackground() == Color.DARK_GRAY) &&
                (b[4+prof[pos[0]][2][rand-1].x][prof[pos[0]][2][rand-1].y].getBackground() == Color.DARK_GRAY) &&
                (b[4+prof[pos[0]][3][rand-1].x][prof[pos[0]][3][rand-1].y].getBackground() == Color.DARK_GRAY)) {
                b[4+prof[pos[0]][0][rand-1].x][prof[pos[0]][0][rand-1].y].setBackground(rnd);
                b[4+prof[pos[0]][1][rand-1].x][prof[pos[0]][1][rand-1].y].setBackground(rnd);
                b[4+prof[pos[0]][2][rand-1].x][prof[pos[0]][2][rand-1].y].setBackground(rnd);
                b[4+prof[pos[0]][3][rand-1].x][prof[pos[0]][3][rand-1].y].setBackground(rnd);
                go();
            } else {
                JOptionPane.showMessageDialog(null, "Game Over! You cleared "+rowsclrd+" rows, well done!");
                System.exit(0);
            }
        }

    private void go() {
    }

    public void rotate() {
        if (pos[0] < 3) {
            pos[1] = pos[0];
            pos[0]++;
        } else if (pos[0] == 3) {
            pos[1] = 3;
            pos[0] = 0;
        } else {
            System.out.println("error");
        }
        if ((perim[2 + centralx + prof[pos[0]][0][rand - 1].x][centraly + prof[pos[0]][0][rand - 1].y + 2] != 4)
                && (perim[2 + centralx + prof[pos[0]][0][rand - 1].x][centraly + prof[pos[0]][0][rand - 1].y + 2] != 1)
                && (perim[2 + centralx + prof[pos[0]][0][rand - 1].x][centraly + prof[pos[0]][0][rand - 1].y + 2] != 2)
                && (perim[2 + centralx + prof[pos[0]][0][rand - 1].x][centraly + prof[pos[0]][0][rand - 1].y + 2] != 3)
                && (perim[centralx + 2 + prof[pos[0]][1][rand - 1].x][centraly + prof[pos[0]][1][rand - 1].y + 2] != 4)
                && (perim[centralx + 2 + prof[pos[0]][1][rand - 1].x][centraly + prof[pos[0]][1][rand - 1].y + 2] != 1)
                && (perim[centralx + 2 + prof[pos[0]][1][rand - 1].x][centraly + prof[pos[0]][1][rand - 1].y + 2] != 2)
                && (perim[centralx + 2 + prof[pos[0]][1][rand - 1].x][centraly + prof[pos[0]][1][rand - 1].y + 2] != 3)
                && (perim[centralx + 2 + prof[pos[0]][2][rand - 1].x][centraly + prof[pos[0]][2][rand - 1].y + 2] != 4)
                && (perim[centralx + 2 + prof[pos[0]][2][rand - 1].x][centraly + prof[pos[0]][2][rand - 1].y + 2] != 1)
                && (perim[centralx + 2 + prof[pos[0]][2][rand - 1].x][centraly + prof[pos[0]][2][rand - 1].y + 2] != 2)
                && (perim[centralx + 2 + prof[pos[0]][2][rand - 1].x][centraly + prof[pos[0]][2][rand - 1].y + 2] != 3)
                && (perim[centralx + prof[pos[0]][3][rand - 1].x + 2][centraly + prof[pos[0]][3][rand - 1].y + 2] != 4)
                && (perim[centralx + prof[pos[0]][3][rand - 1].x + 2][centraly + prof[pos[0]][3][rand - 1].y + 2] != 1)
                && (perim[centralx + prof[pos[0]][3][rand - 1].x + 2][centraly + prof[pos[0]][3][rand - 1].y + 2] != 2)
                && (perim[centralx + prof[pos[0]][3][rand - 1].x + 2][centraly + prof[pos[0]][3][rand - 1].y
                        + 2] != 3)) {
            b[centralx + prof[pos[1]][0][rand - 1].x][centraly + prof[pos[1]][0][rand - 1].y]
                    .setBackground(Color.DARK_GRAY);
            Color[] rnd = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.CYAN, Color.MAGENTA };
            b[centralx + (prof[pos[0]][0][rand - 1].x)][centraly + (prof[pos[0]][0][rand - 1].y)]
                    .setBackground(rnd[rand - 1]);
            b[centralx + (prof[pos[0]][1][rand - 1].x)][centraly + (prof[pos[0]][1][rand - 1].y)]
                    .setBackground(rnd[rand - 1]);
            b[centralx + (prof[pos[0]][2][rand - 1].x)][centraly + (prof[pos[0]][2][rand - 1].y)]
                    .setBackground(rnd[rand - 1]);
            b[centralx + (prof[pos[0]][3][rand - 1].x)][centraly + (prof[pos[0]][3][rand - 1].y)]
                    .setBackground(rnd[rand - 1]);
        } else {
            if (pos[1] > 0) {
                pos[0] = pos[1];
                pos[1]--;
            } else if (pos[1] == 0) {
                pos[0] = 0;
                pos[1] = 3;
            }
        }
    }

}
