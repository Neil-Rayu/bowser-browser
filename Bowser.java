import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Bowser {

  private JFrame frame;
  private JTextArea input;
  private JLabel browserName;
  private ImageIcon browserLogo;
  private JButton inputButton;
  private String inputValue;

  public Bowser() {
    // Create the window and apply some style changes
    frame = new JFrame();

    // Create input box
    input = new JTextArea("Search with bowser!");
    // Create Search button
    inputButton = new JButton();
    // Browser name & Icon
    /*
     * browserName = new JLabel("Bowser");
     * browserName.setIcon(browserLogo);
     * browserLogo = new ImageIcon("logo.png");
     * frame.add(browserName);
     */

  }

  public void userInput() {
    // style input
    input.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
    input.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
    input.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    input.setBounds(250, 250, 300, 20);
    // add input to the window
    frame.add(input);
    // style input button
    inputButton.setBounds(300, 0, 20, 20);
    inputButton.setBackground(Color.black);
    inputButton.setForeground(Color.cyan);
    inputButton.addActionListener(e -> search());
    // add search button to the window
    frame.add(inputButton);
  }

  public void openWindow() {
    frame.setVisible(true);
    frame.setTitle("bowser");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLayout(null);
  }

  public void search() {
    // get the input for a local file:/home/neil/Desktop/text.browser
    String inputStr = input.getText();
    System.out.println("Searching for... " + inputStr);
    if (validateAdress(inputStr)) {
      System.out.println("Lets a Go");
    }
    try {
      File file = new File(inputStr);
      Scanner fileReader = new Scanner(file);
      System.out.println("File Found!");
      /*
       * while (fileReader.hasNext()) {
       * // code
       * }
       */
      fileReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Sorry, the file was not found");

      e.printStackTrace();
    }
  }

  // validate adress based on file rules i.e lower & upper case letters, 0 throuh
  // 9, underscore, period, and dash, check wether there is//[a-zA-z0-9_.-]+
  public boolean validateAdress(String adress) {
    Pattern adressRule = Pattern.compile("^[a-zA-z0-9_.-]+$");
    for (String x : adress.substring(1).split("/")) {
      if (!adressRule.matcher(x).find()) {
        return (false);
      }
    }
    return true;
  }
}
