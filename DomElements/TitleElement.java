package DomElements;

import javax.swing.JFrame;

public class TitleElement {
    private String title;
    private JFrame frame;

    public TitleElement(String title, JFrame frame) {
        this.title = title;
        this.frame = frame;
    }

    public JFrame render() {
        frame.setTitle(title);
        return frame;
    }
}
