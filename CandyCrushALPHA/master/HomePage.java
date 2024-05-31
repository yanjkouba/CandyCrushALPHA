import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class HomePage extends JFrame implements ActionListener {
    private final JButton start;
    private final JButton load;
    private final JButton about;
    private final JButton exit;
    private final JButton Highscores1;
    private static JFrame frame;

    public static void main(String[] args) {
        HomePage game = new HomePage();
        game.setVisible(true);
    }

    /**
     * Entire starting menu alignment.
     */
    public HomePage() {
        frame = new JFrame("MENU");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 250);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JLabel label = new JLabel("CANDY CRUSH");
        label.setFont(new Font("Monospaced", Font.BOLD, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(1, 1));
        labelPanel.add(label);
        panel.add(labelPanel);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5));
        start = new JButton("Start");
        start.addActionListener(this);
        load = new JButton("Load");
        load.addActionListener(this);
        about = new JButton("About");
        about.addActionListener(this);
        exit = new JButton("Exit");
        exit.addActionListener(this);
        Highscores1 = new JButton("Highscores");
        Highscores1.addActionListener(this);
        start.setBackground(Color.black);
        start.setForeground(Color.white);
        start.setFont(new Font("Monospaced", Font.BOLD, 20));
        load.setBackground(Color.black);
        load.setForeground(Color.white);
        load.setFont(new Font("Monospaced", Font.BOLD, 20));
        about.setBackground(Color.black);
        about.setForeground(Color.white);
        about.setFont(new Font("Monospaced", Font.BOLD, 20));
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.setFont(new Font("Monospaced", Font.BOLD, 20));
        Highscores1.setBackground(Color.black);
        Highscores1.setForeground(Color.white);
        Highscores1.setFont(new Font("Monospaced", Font.BOLD, 20));

        buttonPanel.add(start);
        buttonPanel.add(load);
        buttonPanel.add(about);
        buttonPanel.add(exit);
        buttonPanel.add(Highscores1);
        panel.add(buttonPanel);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            new CandyCrush();
            CandyCrush.frame.setVisible(true);
            frame.setVisible(false);
        } else if (e.getSource() == load) {
            CandyCrush game = new CandyCrush();
            try {
                game.LoadGame();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            CandyCrush.frame.setVisible(true);
            frame.setVisible(false);
            
        } else if (e.getSource() == about) {
            AboutPage.showAboutPage();
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == Highscores1) {
                //Highscores.showHighScores();
                JOptionPane.showMessageDialog(null,"Highscores are not avaiable due to a change of the games end goal.");
        }

    }
}
