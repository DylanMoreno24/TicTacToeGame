import javax.swing.JButton;
import javax.swing.JFrame;

public class GameGUI {
    // temporarily in a main method for testnig
    // TODO: change into run() method and implement into Main.java file
    public static void main(String[] args) {
        JFrame window = new JFrame("hello world"); // creates the window where all components of the game will be shown
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program when the window is closed
        window.setSize(400, 400);
        window.setLocationRelativeTo(null); // centers the windown when code is executed
        

        JButton button = new JButton(); // buttons where the X and O will be 
        window.add(button);
        window.setVisible(true);
    }
}