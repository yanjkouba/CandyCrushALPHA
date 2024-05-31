
import java.awt.*;
import javax.swing.*;
public class AboutPage extends JFrame {
    static JFrame frame;

    /**
     * I honestly don't think this whole class needs an explanation, and I am sorry if this offends someone.
     */
    public static void showAboutPage() {
        frame = new JFrame("About Page");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JLabel label = new JLabel("Welcome to Candy Crush");
        label.setFont(new Font("Monospaced", Font.BOLD, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(1, 1));
        labelPanel.add(label);
        panel.add(labelPanel);
        //show text
        String Message = "Welcome to a simple Candy Crush rip-off created by a humble IT student, it might not fully work because I am really bad at spotting mistakes." +
                "THANKS FOR PLAYING";
        JTextArea textArea = new JTextArea(Message);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(150, 200));
        JOptionPane.showMessageDialog(null, scrollPane);
    }
}