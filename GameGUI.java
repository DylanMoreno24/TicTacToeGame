import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameGUI {
    private static JFrame window;
    private static String p1Name;
    private static String p2Name;

    public void mainMenu() {
        window = new JFrame("Tic Tac Toe - Main Menu");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);

        // create panel where all buttons will be stored
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        // Player 1 label and text field
        JLabel label1 = new JLabel("Player 1 Name: ");
        JTextField textField1 = new JTextField(5);

        // Player 2 label and text field
        JLabel label2 = new JLabel("Player 2 Name: ");
        JTextField textField2 = new JTextField(5);

        // start button
        JButton startButton = new JButton("Start Game");

        // Add button listener
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1Name = textField1.getText();
                p2Name = textField2.getText();
                
                // Validate that names are not empty
                if (p1Name.isEmpty() || p2Name.isEmpty()) {
                    System.out.println("Please enter both player names");
                    return;
                }
                
                window.dispose();
                gameBoard();
            }
        });
        
        // Add components to panel
        menuPanel.add(label1);
        menuPanel.add(textField1);
        menuPanel.add(label2);
        menuPanel.add(textField2);
        menuPanel.add(startButton);
        
        window.add(menuPanel);
        window.setVisible(true);
    }

    /**
     * method that starts the the window where the game will be displayed
     */
    public void gameBoard() {
        window = new JFrame("Tic Tac Toe - Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program when the window is closed
        window.setSize(400, 400);
        window.setLocationRelativeTo(null); // centers the windown when code is executed
        
        // create panel with 3x3 gridLayout
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3)); // GridLayout will automatically position the buttons in the grid

        // create game model instance
        GameModel model = new GameModel();
        
        // create 9 buttons
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(buttons[i].getFont().deriveFont(24f)); // increase font size
            
            // create final variables for use in listener
            int row = i / 3;
            int col = i % 3;
            int buttonIndex = i;
            
            // add click listener to each button
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        model.putMark(row, col);
                        
                        // update button text based on game state
                        if (model.getBoard()[row][col] == GameModel.X) {
                            buttons[buttonIndex].setText("X");
                        } else if (model.getBoard()[row][col] == GameModel.O) {
                            buttons[buttonIndex].setText("O");
                        }
                        
                        buttons[buttonIndex].setEnabled(false); // disable button after click
                        
                        // check for winner
                        if (model.winner() != 0) {
                            int winner = model.winner();
                            String winnerText = (winner == GameModel.X) ? p1Name : p2Name;
                            System.out.println(winnerText + " wins!");
                        }
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Invalid move: " + ex.getMessage());
                    }
                }
            });
            
            gamePanel.add(buttons[i]);
        }

        window.add(gamePanel);
        window.setVisible(true);
    }
} 