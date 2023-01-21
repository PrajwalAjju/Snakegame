import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {

        /*
         * GamePanel panel new GamePanel();
         * this.add(panel); OR
         */
        this.add(new GamePanel()); // both works same
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); // Screen MAX/MIN
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}