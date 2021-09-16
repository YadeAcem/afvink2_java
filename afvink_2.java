import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FontMetrics;


public class afvink_2 extends JFrame implements ActionListener {
    //text field
    JTextField as_x;
    JTextField as_y;
    JPanel panel;
    JButton button;

    public static void main(String[] args) {
        afvink_2 frame = new afvink_2();
        frame.setSize(400, 400);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.white);
        window.setLayout (new FlowLayout());

        as_x = new JTextField("x");
        as_y = new JTextField("y");
        window.add(as_x);
        window.add(as_y);

        button = new JButton("verassing");
        window.add(button);
        button.addActionListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.white);
        window.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        Graphics paper = panel.getGraphics();
        paper.setColor(Color.black);
        paper.drawLine(75, 65, 190,150);
        paper.drawLine(80, 235, 195, 155);
        paper.setColor(Color.blue);

        paper.fillOval(65,55,65,60);
        paper.fillOval(60,210,60,60);
        paper.setColor(Color.red);
        paper.fillOval(170, 118, 65, 65);
        button.setBackground(Color.white);

//        text voor waterstof molecuul
        String text = "H";
        int centerX = 97, centerY = 85;

        FontMetrics fm = paper.getFontMetrics();
        double textWidth = fm.getStringBounds(text, paper).getWidth();
        paper.setColor(Color.white);
        paper.drawString(text, (int) (centerX - textWidth/2),
                (int) (centerY + fm.getMaxAscent() / 2));

//        text voor andere waterstof molecuul
        String text2 = "H";
        int centerX2 = 90, centerY2 = 240;

        FontMetrics f2 = paper.getFontMetrics();
        double textWidth2 = f2.getStringBounds(text2, paper).getWidth();
        paper.setColor(Color.white);
        paper.drawString(text2, (int) (centerX2 - textWidth2/2),
                (int) (centerY2 + f2.getMaxAscent() / 2));

//        text voor zuurstof molecuul
        String text3 = "O";
        int centerX3 = 203, centerY3 = 150;

        FontMetrics f3 = paper.getFontMetrics();
        double textWidth3 = f3.getStringBounds(text3, paper).getWidth();
        paper.setColor(Color.white);
        paper.drawString(text3, (int) (centerX3 - textWidth3/2),
                (int) (centerY3 + f3.getMaxAscent() / 2));
    }


}

