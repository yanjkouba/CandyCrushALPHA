
import java.awt.*;
import javax.swing.*;
public class AboutPage extends JFrame {
    //show a window with the about page
    static JFrame frame;
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
        String Message = "⠀  ⠀   (\\__/)\n" +
                "           (•ㅅ•)      \n" +
                "    ＿ノヽ ノ＼＿      \n" +
                "`/　`/ ⌒Ｙ⌒ Ｙ  ヽ     \n" +
                "( 　(三ヽ人　 /　  |\n" +
                "|　ﾉ⌒＼ ￣￣ヽ   ノ       boo\n" +
                "ヽ＿＿＿＞､＿_／\n" +
                "       ｜( 王 ﾉ〈   \n" +
                "       /ﾐ`ー―彡\\  \n" +
                "      / ╰    ╯ \\  \\";
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