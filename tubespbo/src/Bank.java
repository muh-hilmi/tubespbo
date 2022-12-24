import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Homepage{
    JFrame frame = new JFrame("Telyu Bank");
    JLabel welcome = new JLabel();
    JButton setortunai = new JButton("Setor Tunai");
    JButton cheksaldo = new JButton("Check Saldo");
    JButton transfer = new JButton("Transfer");
    JButton tarikuang = new JButton("Tarik Uang");
    JButton info = new JButton("Info");
    JButton exit = new JButton("Exit");
    JLabel trdmark = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Created for Tugas Besar Pemograman Basis Object </div></html>");
    
    Homepage(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(210, 4, 45));
        frame.setSize(500,450);
        frame.setLayout(null);
        frame.setResizable(false);

        welcome.setText("Selamat Datang di TelyuBank");
        welcome.setBounds(75, 45, 400, 25);
        welcome.setFont(new Font("Verdana",Font.BOLD, 20));
        welcome.setForeground(Color.WHITE);

        setortunai.setBounds(150, 100, 200, 25);
        setortunai.setFocusable(false);
        setortunai.setBackground(Color.orange);
        setortunai.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        Setor setor = new Setor();
                    }
                });

        cheksaldo.setBounds(150, 135, 200, 25);
        cheksaldo.setFocusable(false);
        cheksaldo.setBackground(Color.orange);
        cheksaldo.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        SaldoGUI saldo = new SaldoGUI();
                    }
                });
        // cheksaldo.setForeground(Color.WHITE);


        transfer.setBounds(150, 170, 200, 25);
        transfer.setFocusable(false);
        transfer.setBackground(Color.orange);


        tarikuang.setBounds(150, 205, 200, 25);
        tarikuang.setFocusable(false);
        tarikuang.setBackground(Color.orange);


        info.setBounds(150, 240, 200, 25);
        info.setFocusable(false);
        info.setBackground(Color.orange);
        info.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        Info info = new Info();
                    }
                });


        exit.setBounds(150, 275, 200, 25);
        exit.setFocusable(false);
        exit.setBackground(Color.orange);
        exit.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent e) {
                        frame.dispose();
                    }
                });


        trdmark.setBounds(120, 350, 500, 50);
        trdmark.setFont(new Font("Courier",Font.BOLD, 10));
        trdmark.setForeground(Color.WHITE);

        frame.setVisible(true);
        frame.add(welcome);
        frame.add(setortunai);
        frame.add(cheksaldo);
        frame.add(transfer);
        frame.add(tarikuang);
        frame.add(info);
        frame.add(exit);
        frame.add(trdmark);

    }
}
class Setor{
    JFrame framesetor = new JFrame("Telyu Bank - Setor Tunai");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Saldo Anda Sekarang : </div></html>");
    JTextField setor = new JTextField();
    JButton kembali = new JButton("Kembali");

    Setor(){
        framesetor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framesetor.getContentPane().setBackground(new Color(210, 4, 45));
        framesetor.setSize(800,600);
        framesetor.setLayout(null);
//        framesetor.setResizable(false);
        framesetor.setVisible(true);

        text.setBounds(150, 15, 800, 100);
        text.setFont(new Font("Verdana",Font.BOLD, 20));
        text.setForeground(Color.WHITE);

        setor.setText("500000");
        setor.setBounds(285, 150, 200, 25);
        // setor.setFont(new Font("Verdana",Font.ITALIC, 25));
        setor.setBackground(Color.orange);
        

        kembali.setBounds(285, 400, 200, 25);
        kembali.setFocusable(false);
        kembali.setBackground(Color.orange);
        kembali.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        framesetor.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        framesetor.add(text);
        framesetor.add(setor);
        // framesetor.add(saldo);
        // framesetor.add(setortunai);
        framesetor.add(kembali);
    }

}

class SaldoGUI{
    JFrame framesaldo = new JFrame("Telyu Bank - Check Saldo");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Saldo Anda Sekarang : </div></html>");
    JLabel saldo = new JLabel();
    JButton setortunai = new JButton("Setor Tunai");
    JButton kembali = new JButton("Kembali");

    public Integer Saldo = 0;
    SaldoGUI(){
        framesaldo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framesaldo.getContentPane().setBackground(new Color(210, 4, 45));
        framesaldo.setSize(800,600);
        framesaldo.setLayout(null);
        // framesaldo.setResizable(false);
        framesaldo.setVisible(true);

        text.setBounds(150, 15, 800, 100);
        text.setFont(new Font("Verdana",Font.BOLD, 20));
        text.setForeground(Color.WHITE);

        saldo.setText("Rp. 0");
        saldo.setBounds(350, 75, 1000, 100);
        saldo.setFont(new Font("Verdana",Font.ITALIC, 25));
        saldo.setForeground(Color.orange);

        setortunai.setBounds(285, 365, 200, 25);
        setortunai.setFocusable(false);
        setortunai.setBackground(Color.orange);
        setortunai.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        framesaldo.dispose();
                        Setor setor = new Setor();
                    }
                });

        kembali.setBounds(285, 400, 200, 25);
        kembali.setFocusable(false);
        kembali.setBackground(Color.orange);
        kembali.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        framesaldo.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        framesaldo.add(text);
        framesaldo.add(saldo);
        framesaldo.add(setortunai);
        framesaldo.add(kembali);
        

    }

}

class Info{
    JFrame framesaldo = new JFrame("Telyu Bank - Info");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Info Apps</div></html>");
    JLabel saldo = new JLabel("<html><head><style>div {text-align: center;}<div>DIbuat Oleh Kelompok ?<br/>1. Muhammad Hilmi Izzulhaq 1101202399</div></html>");
    
    JButton kembali = new JButton("Kembali");

    public Integer Saldo = 0;
    Info(){
        framesaldo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framesaldo.getContentPane().setBackground(new Color(210, 4, 45));
        framesaldo.setSize(800,600);
        framesaldo.setLayout(null);
        // framesaldo.setResizable(false);
        framesaldo.setVisible(true);

        text.setBounds(150, 15, 800, 100);
        text.setFont(new Font("Verdana",Font.BOLD, 20));
        text.setForeground(Color.WHITE);

        saldo.setBounds(225, 75, 1000, 100);
        saldo.setFont(new Font("Verdana",Font.ITALIC, 15));
        saldo.setForeground(Color.orange);

        kembali.setBounds(285, 400, 200, 25);
        kembali.setFocusable(false);
        kembali.setBackground(Color.orange);
        kembali.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        framesaldo.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        framesaldo.add(text);
        framesaldo.add(saldo);
        framesaldo.add(kembali);
        

            }
}

public class Bank {
    public Integer saldototal;

    public Bank(int saldo){
        this.saldototal = saldo;
    }

    public static void main(String[] args) {
        Homepage homepage1 = new Homepage();
        //    Saldo saldo = new Saldo();
        // Setor setor = new Setor();
    }
}
