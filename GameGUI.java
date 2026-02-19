import javax.swing.JFrame;

public class GameGUI {
    public static void main(String[] args) {
        JFrame window = new JFrame("hello world"); // creates the window where all components of the game will be shown
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program when the window is closed
        window.setSize(400, 400);
        window.setLocationRelativeTo(null); // centers the windown when code is executed
        window.setVisible(true);
    }
}