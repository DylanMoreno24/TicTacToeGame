import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI {
    // temporarily in a main method for testnig
    // TODO: change into run() method and implement into Main.java file
    public static void main(String[] args) {
        JFrame window = new JFrame("hello world"); // creates the window where all components of the game will be shown
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program when the window is closed
        window.setSize(400, 400);
        window.setLocationRelativeTo(null); // centers the windown when code is executed
        
        
    }

    /**
     * method that will create the 3x3 buttons for the game
     */
    public JPanel buttonGrid() {
        JPanel panel = new JPanel();
        

        return panel;
    } 
}