import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {
    // declare variables
    private JButton button;
    private int counter;

    public Game() {
        // set the title and size of the window
        setTitle("My Game");
        setSize(300, 200);

        // create a button and add an action listener
        button = new JButton("Click me!");
        button.addActionListener(this);

        // add the button to the content pane
        getContentPane().add(button, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        // increment the counter each time the button is clicked
        counter++;
        // set the button text to the current count
        button.setText("Clicked " + counter + " times");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
    }
}
