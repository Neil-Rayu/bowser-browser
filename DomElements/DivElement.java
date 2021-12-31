package DomElements;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DivElement {
    private JFrame frame;

    public DivElement(JFrame frame) {
        this.frame = frame;
    }

    public void render() {
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);
    }
}
