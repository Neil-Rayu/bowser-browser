package DomElements;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonElement {
    private String placeHolder;
    private JFrame frame;

    public ButtonElement(String placeHolder, JFrame frame) {
        this.placeHolder = placeHolder;
        this.frame = frame;
    }

    public JFrame render() {
        JButton button = new JButton(placeHolder);
        button.setSize(50, 50);
        button.setFocusable(false);
        frame.add(button);
        return frame;
    }
}
