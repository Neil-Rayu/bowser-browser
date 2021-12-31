package DomElements;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class BodyElement {
    public JFrame render() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        return frame;

    }
}
