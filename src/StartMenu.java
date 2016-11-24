/**
 * Created by Björn on 2016-11-24.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu extends JFrame implements ActionListener{
    private JPanel jContentPane = null;
    private JButton startButton;
    private JButton highScoreButton;
    private JButton exitButton;

    public boolean active;
    private String action = "";

    public String getAction(){
        return action;
    }

    public StartMenu() {
        super();
        this.setSize(600, 600);
        this.setContentPane(getJContentPane());
        this.setTitle("SealHunter");
        this.active = true;
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);

            // The measurements of the innerpanel holding the buttons.
            int width = 150;
            int height = 300;

            // Don't know why this is needed but only way I got it to work...
            JPanel p = new JPanel();

            // Panels layout and position
            p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
            p.setBounds(this.getWidth()/2-width/2, this.getHeight()/2-height/2, width, height);

            // last parameter determines vertical spacing.
            p.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));

            // Add panel to other panel, this is confusing to me.
            jContentPane.add(p);


            // Define buttons
            startButton = new JButton("Start Game");
            startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            startButton.addActionListener(this);

            highScoreButton = new JButton("Highscores");
            highScoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            highScoreButton.addActionListener(this);


            exitButton = new JButton("Exit Game");
            exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            exitButton.addActionListener(this);


            // add them to panel
            p.add(startButton);
            p.add(highScoreButton);
            p.add(exitButton);
        }
        return jContentPane;
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            this.action = "start_game";
            this.active = false;
        }
        if (e.getSource() == highScoreButton){
            this.action = "highscores";
            this.active = false;
        }
        if (e.getSource() == exitButton){
            this.action = "exit_game";
            this.active = false;
        }
    }
}