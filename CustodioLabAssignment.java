import javax.swing.*;
import java.awt.*;

public class CustodioLabAssignment {
    public static void main(String[] args) {
        JFrame frame = new JFrame("For You I'll Bleed Myself Dry");
        frame.setSize(600, 500);
        
        JLayeredPane layeredPane = new JLayeredPane();
        frame.setContentPane(layeredPane);

        JLabel backgroundLabel = new JLabel(new ImageIcon("LOVE.png"));
        backgroundLabel.setBounds(0, 0, 600, 500);
        layeredPane.add(backgroundLabel, Integer.valueOf(0));

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 500);
        panel.setOpaque(false);
        layeredPane.add(panel, Integer.valueOf(1));

        ImageIcon icon = new ImageIcon("PXL RED HEART.png");

        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBounds(10, 10, icon.getIconWidth(), icon.getIconHeight());
        
        JLabel label1 = new JLabel("NAME:");
        label1.setBounds(10, 10, 150, 30);
        
        JTextField textField = new JTextField();
        textField.setBounds(60, 10, 150, 30);
         
        JLabel label2 = new JLabel("AGE:");
        label2.setBounds(10, 50, 150, 30);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(60, 50, 150, 30);
        
        JLabel label3 = new JLabel("MY LOVE FOR U:");
        label3.setBounds(10, 80, 150, 30);
        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(10, 110, 200, 30);
        progressBar.setValue(100);
        progressBar.setStringPainted(true);
        
        JLabel label4 = new JLabel("WHAT I LIKE ABOUT U?");
        label4.setBounds(240, 10, 150, 30);
       
        JCheckBox checkBox1 = new JCheckBox("Your Smile");
        checkBox1.setBounds(240, 40, 150, 30);
        checkBox1.setOpaque(false);

        JCheckBox checkBox2 = new JCheckBox("Your Eyes");
        checkBox2.setBounds(240, 60, 150, 30);
        checkBox2.setOpaque(false);
        
        JCheckBox checkBox3 = new JCheckBox("Your Personality");
        checkBox3.setBounds(240, 80, 150, 30);
        checkBox3.setOpaque(false);
        
        JCheckBox checkBox4 = new JCheckBox("Your Laugh");
        checkBox4.setBounds(240, 100, 150, 30);
        checkBox4.setOpaque(false);
         
        JCheckBox checkBox5 = new JCheckBox("You as you");
        checkBox5.setBounds(240, 120, 150, 30);
        checkBox5.setOpaque(false);
        
        JLabel label5 = new JLabel("DO YOU LIKE ME?");
        label5.setBounds(410, 80, 150, 30);
        
        JButton button = new JButton("YES");
        button.setBounds (410, 110, 150, 30);
        
        JLabel label6 = new JLabel("Pick A Song!");
        label6.setBounds(10, 150, 150, 30);
        
        String[] options = {"A Piece of You", "My Love Mine All Mine", "Daylight"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(10, 180, 150, 30);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(200, 170, 360, 100);
        tabbedPane.addTab("Message 1", new JLabel("Hey there! First time ko lang ito gawin."));
        tabbedPane.addTab("Message 2", new JLabel("So, don't expect too much hahaha"));
        tabbedPane.addTab("Message 3", new JLabel("Just wanted to say: you're loved just the way you are!"));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 150, 100);
        slider.setBounds(10, 220, 150, 30);
        slider.setOpaque(false);
        
        JLabel label7 = new JLabel("Enter passcode:");
        label7.setBounds(10, 240, 150, 30);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(10, 270, 150, 30);
        
        JLabel label8 = new JLabel("WRITE SOMETHING FOR ME <3");
        label8.setBounds(200, 210, 360, 150);
        
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(200, 300, 360, 140);
        
        JLabel label9 = new JLabel("Pick A Date Idea!");
        label9.setBounds(10, 300, 150, 30);
               
        String[] options2 = {"Stargazing Date", "Streetfoods Date", "Beach Date"};
        JComboBox<String> comboBox2 = new JComboBox<>(options2);
        comboBox2.setBounds(10, 330, 150, 30);
        
        JLabel label10 = new JLabel("Pick A Place!");
        label10.setBounds(10, 360, 150, 30);
               
        String[] options3 = {"Mt. Pulag", "Intramuros", "Baguio City"};
        JComboBox<String> comboBox3 = new JComboBox<>(options3);
        comboBox3.setBounds(10, 390, 150, 30);
        
        // I-add ko lang all components here para hindi magulo
        frame.add(iconLabel);
        panel.add(label1);
        panel.add(textField);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(progressBar);
        panel.add(label4);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);
        panel.add(checkBox5);
        panel.add(label5);
        panel.add(button);
        panel.add(label6);
        panel.add(comboBox);
        panel.add(tabbedPane);
        panel.add(slider);
        panel.add(label7);
        panel.add(passwordField);
        panel.add(label8);
        panel.add(scrollPane);
        panel.add(label9);
        panel.add(comboBox2);
        panel.add(label10);
        panel.add(comboBox3);

        
        // Ilista ko here yung mga nagamit kong Java Swing Components
        
        // JFrame
        // JPanel
        // JImageIcon
        // JLayeredPane
        // JLabel
        // JTextField
        // JProgressBar
        // JCheckBox
        // JButton
        // JComboBox
        // JTabbedPane
        // JSlider
        // JPasswordField
        // JTextArea
            
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);    
       
    }
}
