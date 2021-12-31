package DomElements;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextElement {

  private JFrame frame;
  private JLabel textbox;

  public TextElement(String text, JFrame frame) {
    this.frame = frame;
    this.textbox = new JLabel(text);
  }

  public JFrame render() {
    textbox.setSize(500, 100);
    frame.add(textbox);
    // style textbox
    return frame;
  }
}
