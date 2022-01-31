import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 

public class MyFrame extends JFrame implements ActionListener {

    private JPanel bg;
    private JLabel result, tittle;
    private JButton chooseButton;


    public MyFrame() {
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora Postfix");
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        putPanel();
        iniciateText();
        putButtons();

    }

    private void putPanel() {
        bg = new JPanel();
        bg.setLayout(null);
        bg.setBackground(new Color(56, 152, 255));
        this.getContentPane().add(bg);
    }

    private void iniciateText() {
        result = new JLabel("Su resultado es: ");
        result.setBounds(20, 100, 150, 20);
        result.setAlignmentX(CENTER_ALIGNMENT);
        bg.add(result);

        tittle = new JLabel("Calculadora Grupo 2");
        tittle.setBounds(20, 20, 250, 50);
        tittle.setFont(new Font("Arial", 2, 20));
        tittle.setAlignmentX(CENTER_ALIGNMENT);
        bg.add(tittle);
    }

    private void putButtons() {
        chooseButton = new JButton("Escoger txt");
        chooseButton.setBounds(240, 30, 100, 30);
        chooseButton.addActionListener(this);
        bg.add(chooseButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseButton) {
            JFileChooser txtchooser = new JFileChooser();
            txtchooser.showOpenDialog(null);
            int response = txtchooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(txtchooser.getSelectedFile().getAbsolutePath());
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(reader.readLine());
                    }
                    reader.close();
                } catch (IOException err) {
                    err.printStackTrace();
                }
			}

        }
        
    }

}