package DomElements;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InputElement {
    private String placeHolder;
    private JFrame frame;

    public InputElement(String placeHolder, JFrame frame) {
        this.placeHolder = placeHolder;
        this.frame = frame;
    }

    public JFrame render() {
        JTextArea input = new JTextArea(placeHolder);
        input.setSize(100, 20);
        frame.add(input);
        return frame;
    }
}
