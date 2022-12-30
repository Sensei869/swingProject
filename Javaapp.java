import javax.swing.*;

public class Javaapp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Java App");

        // JLabel
        // JLabel lbl = new JLabel("Hello this is first Java Applicaiton");
        // // lbl.setText("Hello this is first Java Applicaiton");
        // frame.add(lbl);

        ImageIcon icon = new ImageIcon("C:/Users/User/Desktop/Rajesh/classwork/img.png");
        JLabel lbl = new JLabel("Design is thinking made visual.", icon, SwingConstants.HORIZONTAL);
        ImageIcon appicon = new ImageIcon("C:/Users/User/Desktop/Rajesh/classwork/img.png");

        // Jpanel
        JPanel p = new JPanel();
        frame.add(p);
        frame.setIconImage(appicon.getImage());

        p.add(lbl);
        frame.add(p);

        frame.setSize(600, 300);
        frame.setVisible(true);

    }
}