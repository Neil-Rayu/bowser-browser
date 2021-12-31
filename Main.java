import DomElements.BodyElement;
import DomElements.ButtonElement;
import DomElements.InputElement;
import DomElements.TextElement;
import DomElements.TitleElement;

public class Main {

  public static void main(String[] args) {
    BodyElement window = new BodyElement();
    TitleElement title = new TitleElement("Test Window", window.render());
    TextElement text = new TextElement("Hello this is a test program input your password and username", title.render());
    InputElement username = new InputElement("Username:", text.render());
    InputElement password = new InputElement("Password:", username.render());
    ButtonElement button = new ButtonElement("Submit", password.render());
    button.render().setVisible(true);
  }
}
