import java.awt.*;
import java.awt.event.*;


public class Layout extends Frame implements  ActionListener{

    Button[][] b1 = new Button[3][3];
    boolean toggle;
    boolean isWin, allow;
    int numOfClicks=0;

    MyDialog d;
    Panel p;
    TextField tf;
    public Layout(String title){
        setTitle(title);
        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++) {
            int row = i / 3;
            int col = i % 3;
            add(b1[row][col] = new Button());
            b1[row][col].addActionListener(this);
            b1[row][col].setFont(new Font("Arial", Font.BOLD, 50));
        }

        setSize(600,600);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setResizable(false);
    }

    public static void main(String[] args) {
        new Layout("Tic-Tac-Toe");
    }

    @Override
    public void paint(Graphics g) {
        if(allow) {
            if(!isWin && numOfClicks==9) {
                numOfClicks = 0;
                for(int i=0;i<9;i++) {
                    int row = i / 3;
                    int col = i % 3;
                    b1[row][col].setLabel("");
                }
                d = new MyDialog(this, "Draw", true);
                d.setVisible(true);
            }
            else {
                if(toggle)
                    d = new MyDialog(this, "O won", true);
                else
                    d = new MyDialog(this, "X won", true);
                numOfClicks = 0;
                for(int i=0;i<9;i++) {
                    int row = i / 3;
                    int col = i % 3;
                    b1[row][col].setLabel("");
                }
                d.setVisible(true);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(b1[0][0] == e.getSource() && toggle && b1[0][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][0].setLabel("X");
        }
        else if(b1[0][0] == e.getSource() && !toggle && b1[0][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][0].setLabel("O");
        }

        if(b1[0][1] == e.getSource() && toggle && b1[0][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][1].setLabel("X");
        }
        else if(b1[0][1] == e.getSource() && !toggle && b1[0][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][1].setLabel("O");
        }

        if(b1[0][2] == e.getSource() && toggle && b1[0][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][2].setLabel("X");
        }
        else if(b1[0][2] == e.getSource() && !toggle && b1[0][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[0][2].setLabel("O");
        }

        if(b1[1][0] == e.getSource() && toggle && b1[1][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][0].setLabel("X");
        }
        else if(b1[1][0] == e.getSource() && !toggle && b1[1][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][0].setLabel("O");
        }

        if(b1[1][1] == e.getSource() && toggle && b1[1][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][1].setLabel("X");
        }
        else if(b1[1][1] == e.getSource() && !toggle && b1[1][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][1].setLabel("O");
        }

        if(b1[1][2] == e.getSource() && toggle && b1[1][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][2].setLabel("X");
        }
        else if(b1[1][2] == e.getSource() && !toggle && b1[1][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[1][2].setLabel("O");
        }

        if(b1[2][0] == e.getSource() && toggle && b1[2][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][0].setLabel("X");
        }
        else if(b1[2][0] == e.getSource() && !toggle && b1[2][0].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][0].setLabel("O");
        }

        if(b1[2][1] == e.getSource() && toggle && b1[2][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][1].setLabel("X");
        }
        else if(b1[2][1] == e.getSource() && !toggle && b1[2][1].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][1].setLabel("O");
        }

        if(b1[2][2] == e.getSource() && toggle && b1[2][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][2].setLabel("X");
        }
        else if(b1[2][2] == e.getSource() && !toggle && b1[2][2].getLabel().equals("")) {
            numOfClicks++;
            toggle = !toggle;
            b1[2][2].setLabel("O");
        }

        if(b1[0][0].getLabel() ==b1[1][1].getLabel() && b1[0][0].getLabel()==b1[2][2].getLabel() && !b1[0][0].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[0][0].getLabel() ==b1[0][1].getLabel() && b1[0][0].getLabel()==b1[0][2].getLabel() && !b1[0][0].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[0][0].getLabel() ==b1[1][0].getLabel() && b1[1][0].getLabel()==b1[2][0].getLabel() && !b1[0][0].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[0][1].getLabel() ==b1[1][1].getLabel() && b1[0][1].getLabel()==b1[2][1].getLabel() && !b1[0][1].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[1][1].getLabel() ==b1[1][0].getLabel() && b1[1][1].getLabel()==b1[1][2].getLabel() && !b1[1][1].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[2][0].getLabel() ==b1[2][1].getLabel() && b1[2][0].getLabel()==b1[2][2].getLabel() && !b1[2][0].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[0][2].getLabel() ==b1[1][1].getLabel() && b1[0][2].getLabel()==b1[2][0].getLabel() && !b1[0][2].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else if(b1[0][2].getLabel() ==b1[1][2].getLabel() && b1[0][2].getLabel()==b1[2][2].getLabel() && !b1[0][2].getLabel().equals("")) {
            isWin = true;
            allow = true;
            repaint();
        }
        else  {
            if(numOfClicks==9){
                isWin = false;
                allow = true;
                repaint();
            }
        }
    }
}

class MyDialog extends Dialog implements WindowListener {

    Panel p;
    TextField tf;

    public MyDialog(Layout c, String title, boolean model) {
        super(c, title, model);
        p = new Panel();
        tf = new TextField(title);
        tf.setEditable(false);
        tf.setEnabled(false);
        p.add(tf);
        p.setSize(300,100);
        add(p);
        setSize(300,100);
        setResizable(false);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}