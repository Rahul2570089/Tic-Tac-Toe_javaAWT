import java.awt.*;
import java.awt.event.*;


public class Layout extends Frame implements  ActionListener {

    Button[] b = new Button[9];
    boolean toggle;
    int numOfClicks=0;
    public Layout(String title){
        setTitle(title);
        setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++) {
            add(b[i] = new Button(String.valueOf(i)));
            b[i].addActionListener(this);
        }

        setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }
        });
        setResizable(false);
    }

    public static void main(String[] args) {
        new Layout("Tic-Tac-Toe");
    }

    @Override
    public void paint(Graphics g) {
        for(int i=0;i<9;i++) {
            b[i].setEnabled(true);
            b[i].setLabel(String.valueOf(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("0") && toggle) {
            numOfClicks++;
            toggle = false;
            b[0].setLabel("X");
            b[0].setEnabled(false);
        }
        else if(s.equals("0") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[0].setLabel("O");
            b[0].setEnabled(false);
        }
        if(s.equals("1") && toggle) {
            numOfClicks++;
            toggle = false;
            b[1].setLabel("X");
            b[1].setEnabled(false);
        }
        else if(s.equals("1") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[1].setLabel("O");
            b[1].setEnabled(false);
        }
        if(s.equals("2") && toggle) {
            numOfClicks++;
            toggle = false;
            b[2].setLabel("X");
            b[2].setEnabled(false);
        }
        else if(s.equals("2") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[2].setLabel("O");
            b[2].setEnabled(false);
        }
        if(s.equals("3") && toggle) {
            numOfClicks++;
            toggle = false;
            b[3].setLabel("X");
            b[3].setEnabled(false);
        }
        else if(s.equals("3") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[3].setLabel("O");
            b[3].setEnabled(false);
        }
        if(s.equals("4") && toggle) {
            numOfClicks++;
            toggle = false;
            b[4].setLabel("X");
            b[4].setEnabled(false);
        }
        else if(s.equals("4") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[4].setLabel("O");
            b[4].setEnabled(false);
        }
        if(s.equals("5") && toggle) {
            numOfClicks++;
            toggle = false;
            b[5].setLabel("X");
            b[5].setEnabled(false);
        }
        else if(s.equals("5") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[5].setLabel("O");
            b[5].setEnabled(false);
        }
        if(s.equals("6") && toggle) {
            numOfClicks++;
            toggle = false;
            b[6].setLabel("X");
            b[6].setEnabled(false);
        }
        else if(s.equals("6") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[6].setLabel("O");
            b[6].setEnabled(false);
        }
        if(s.equals("7") && toggle) {
            numOfClicks++;
            toggle = false;
            b[7].setLabel("X");
            b[7].setEnabled(false);
        }
        else if(s.equals("7") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[7].setLabel("O");
            b[7].setEnabled(false);
        }
        if(s.equals("8") && toggle) {
            numOfClicks++;
            toggle = false;
            b[8].setLabel("X");
            b[8].setEnabled(false);
        }
        else if(s.equals("8") && !toggle) {
            numOfClicks++;
            toggle = true;
            b[8].setLabel("O");
            b[8].setEnabled(false);
        }

        if(b[0].getLabel() ==b[1].getLabel() && b[1].getLabel()==b[2].getLabel()) {
            repaint();
        }
        else if(b[0].getLabel() ==b[3].getLabel() && b[3].getLabel()==b[6].getLabel()) {
            repaint();
        }
        else if(b[0].getLabel() ==b[4].getLabel() && b[1].getLabel()==b[8].getLabel()) {
            repaint();
        }
        else if(b[3].getLabel() ==b[4].getLabel() && b[4].getLabel()==b[5].getLabel()) {
            repaint();
        }
        else if(b[1].getLabel() ==b[4].getLabel() && b[4].getLabel()==b[7].getLabel()) {
            repaint();
        }
        else if(b[2].getLabel() ==b[4].getLabel() && b[4].getLabel()==b[6].getLabel()) {
            repaint();
        }
        else if(b[2].getLabel() ==b[5].getLabel() && b[5].getLabel()==b[8].getLabel()) {
            repaint();
        }
        else if(b[6].getLabel() ==b[7].getLabel() && b[7].getLabel()==b[8].getLabel()) {
            repaint();
        }
        else  {
            if(numOfClicks==9){
                repaint();
            }
        }
    }
}

