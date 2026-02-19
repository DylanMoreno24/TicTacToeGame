import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI {
    // temporarily in a main method for testnig
    // TODO: change into run() method and implement into Main.java file
    public static void main(String[] args) {
        JFrame window = new JFrame("Tic Tac Toe Game"); // creates the window where all components of the game will be shown
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program when the window is closed
        window.setSize(400, 400);
        window.setLocationRelativeTo(null); // centers the windown when code is executed
        
        // create panel with 3x3 gridLayout
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));

        // create 9 buttons
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            gamePanel.add(buttons[i]);
        }

        window.add(gamePanel);
        window.setVisible(true);
    }
} 