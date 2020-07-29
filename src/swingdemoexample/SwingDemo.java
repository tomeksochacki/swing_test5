package swingdemoexample;

import javax.swing.*;

public class SwingDemo {

    SwingDemo() {
        JFrame jfrm = new JFrame("Simple application write with Swing");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Programing with Swing");
        jfrm.add(jLabel);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();

            }
        });

    }
}
