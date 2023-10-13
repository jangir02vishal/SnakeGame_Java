import java.awt.EventQueue;
import javax.swing.JFrame;
//Main Snake class
public class Snake extends JFrame {
    public static Board playBoard;
    public Snake() {
        initUI();
    }

    private void initUI() {
        playBoard = new Board();
        add(playBoard);

        setResizable(false);
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setTitle("SnakeGame");
            ex.setVisible(true);

        });
    }
}
