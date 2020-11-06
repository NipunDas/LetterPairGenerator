import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIClass extends JPanel implements ActionListener{

    //Global variable initialization
    String stringDisplayed = "Press the space bar to generate next letter pair";
    int trainingType = 1; //1 = corners, 2 = edges

    public void paint(Graphics g) {

        //Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 900, 600);

        //Displaying letter pair
        g.setColor(Color.GRAY);
        if (stringDisplayed.length() > 5) {
            g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
            g.drawString(stringDisplayed, 100, 280);
        } else {
            g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 200));
            g.drawString(stringDisplayed, 300, 350);
        }

        //Display training type
        g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        switch (trainingType) {
            case 1 -> g.drawString("Testing: Corner Pairs", 350, 50);
            case 2 -> g.drawString("Testing: Edge Pairs", 350, 50);
            default -> g.drawString("Error: check training type switch in GUIClass paint(Graphics g) method", 10, 10);
        }
    }

    public GUIClass() {
        //Initializing JFrame and adding specifications
        JFrame frame = new JFrame("Pong");
        frame.getContentPane().setBackground(Color.black);
        frame.setPreferredSize(new Dimension(900,600));
        frame.pack();
        frame.add(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Image guiImage = Toolkit.getDefaultToolkit().getImage("pfp.jpg");
        frame.setIconImage(guiImage);

        //Timer
        Timer t = new Timer(16, this);
        t.start();

        //Key Listener to update the Letter Pair displayed
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_SPACE:
                        switch (trainingType) {
                            case 1 -> stringDisplayed = letterGenerator.getCornerPair();
                            case 2 -> stringDisplayed = letterGenerator.getEdgePair();
                        }
                        break;
                    case KeyEvent.VK_1:
                        trainingType = 1;
                        break;
                    case KeyEvent.VK_2:
                        trainingType = 2;
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //Setting frame to be visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }
}