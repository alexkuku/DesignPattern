package state.test;

import state.CandyMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CandyMachineTest extends JFrame implements ActionListener {
    JPanel one,two,three;
    JButton insert, eject, press;
    JTextArea show;
    JLabel candy, coin;

    int candyNum = 0;
    int coinNum = 0;

    CandyMachine candyMachine = new CandyMachine(100);

    public void init() {
        this.setVisible(true);
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        one = new JPanel(new BorderLayout());

        insert = new JButton("添加硬币");
        insert.addActionListener(this);
        eject = new JButton("退回硬币");
        eject.addActionListener(this);
        press = new JButton("弹出糖果");
        press.addActionListener(this);
        one.add(insert, BorderLayout.WEST);
        one.add(eject, BorderLayout.EAST);
        one.add(press, BorderLayout.CENTER);
        show = new JTextArea(40, 20);
        show.setLineWrap(true);
        two = new JPanel();
        two.add(show);

        three = new JPanel(new BorderLayout());

        candy = new JLabel("               剩余糖果：" + candyNum + "           ");
        coin = new JLabel("剩余硬币：" + coinNum);
        three.add(candy, BorderLayout.WEST);
        three.add(coin, BorderLayout.CENTER);

        this.add(one, BorderLayout.NORTH);
        this.add(two, BorderLayout.CENTER);
        this.add(three, BorderLayout.SOUTH);
    }

    public CandyMachineTest() {
        init();
    }

    public static void main(String[] args) {
        new CandyMachineTest();
    }
    void sync(int candyNum, int coinNum) {
        candy.setText("               剩余糖果：" + candyNum + "           ");
        coin.setText("剩余硬币：" + coinNum);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert) {
            show.append(candyMachine.insertCoin());
            show.append("\r\n");
            sync(candyMachine.getCandyNumber(), candyMachine.getCoinNumber());
        }
        if (e.getSource() == eject) {
            show.append(candyMachine.ejectCoin());
            show.append("\r\n");
            sync(candyMachine.getCandyNumber(), candyMachine.getCoinNumber());
        }
        if (e.getSource() == press) {
            show.append(candyMachine.pressButton());
            show.append("\r\n");
            sync(candyMachine.getCandyNumber(), candyMachine.getCoinNumber());
        }
    }
}
