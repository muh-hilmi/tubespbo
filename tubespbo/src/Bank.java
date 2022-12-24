import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

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
        transfer.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        Transfer transfer = new Transfer();
                    }
                });


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
class Setor extends Bank{
    JFrame framesetor = new JFrame("Telyu Bank - Setor Tunai");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Menu : Setor Tunai </div></html>");
    JTextField setorField = new JTextField();
    JButton setorButton = new JButton("Setor Uang");
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

        setorField.setText("500000");
        setorField.setBounds(285, 150, 200, 25);
        // setorField.setFont(new Font("Verdana",Font.ITALIC, 25));
        setorField.setBackground(Color.orange);

        setorButton.setBounds(285, 365, 200, 25);
        setorButton.setFocusable(false);
        setorButton.setBackground(Color.orange);
        setorButton.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Integer option = JOptionPane.showConfirmDialog(null, "Yakin dengan nilai setor tunai?","Konfirmasi Setor Tunai", JOptionPane.YES_NO_OPTION);
                        if (option == 0){
                            String sText = setorField.getText();
                            Integer setorInteger = Integer.parseInt(sText);
                            Bank.saldoTotal = Bank.saldoTotal + setorInteger;
                            JOptionPane.showMessageDialog(null, "Setor Tunai Berhasil, Anda akan diarahkan ke Menu Check Saldo", "Setor Tunai Berhasil", JOptionPane.PLAIN_MESSAGE);
                            framesetor.dispose();
                            SaldoGUI saldo = new SaldoGUI();
                        }
                        // Homepage homepage1 = new Homepage();
                    }
                });
        

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
        framesetor.add(setorField);
        // framesetor.add(saldo);
        framesetor.add(setorButton);
        framesetor.add(kembali);
    }

}

class SaldoGUI extends Bank{
    JFrame framesaldo = new JFrame("Telyu Bank - Check Saldo");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Menu : Saldo  </div></html>");
    JLabel saldo = new JLabel("Saldo Anda Sekarang : Rp. "+ Bank.saldoTotal);
    JButton setortunai = new JButton("Setor Tunai");
    JButton transfer = new JButton("Transfer");
    JButton kembali = new JButton("Kembali");

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

        // saldo.setText("Rp. 0");
        // saldoTotal = saldoAwal + saldoTotal;
        saldo.setBounds(200, 150, 800, 100);
        saldo.setFont(new Font("Verdana",Font.ITALIC, 20));
        saldo.setForeground(Color.orange);

        setortunai.setBounds(285, 330, 200, 25);
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

        transfer.setBounds(285, 365, 200, 25);
        transfer.setFocusable(false);
        transfer.setBackground(Color.orange);
        transfer.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        framesaldo.dispose();
                        Transfer transfer = new Transfer();
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
        framesaldo.add(transfer);
        framesaldo.add(kembali);
        

    }

}

class Transfer extends Bank{
    JFrame frametransfer = new JFrame("Telyu Bank - Transfer");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Menu : Transfer</div></html>");
    JLabel saldo = new JLabel("Saldo saat ini Rp. "+ Bank.saldoTotal);
    JLabel rekening = new JLabel("Masukkan Rekening :  ");
    JTextField rekeningField = new JTextField();
    JLabel nominal = new JLabel("Masukkan Nilai Transfer :  ");
    JTextField transferField = new JTextField();
    JButton transferButton = new JButton("Transfer Sekarang");
    JButton kembali = new JButton("Kembali");

    Transfer(){
        frametransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frametransfer.getContentPane().setBackground(new Color(210, 4, 45));
        frametransfer.setSize(800,600);
        frametransfer.setLayout(null);
        // frametransfer.setResizable(false);
        frametransfer.setVisible(true);

        text.setBounds(150, 50, 800, 50);
        text.setFont(new Font("Verdana",Font.BOLD, 20));
        text.setForeground(Color.WHITE);

        saldo.setBounds(250, 125, 800, 50);
        saldo.setFont(new Font("Verdana",Font.ITALIC, 18));
        saldo.setForeground(Color.orange);

        rekening.setBounds(200, 200, 800, 25);
        rekening.setFont(new Font("Verdana",Font.PLAIN, 15));
        rekening.setForeground(Color.WHITE);

        rekeningField.setText("Bayu");
        rekeningField.setBounds(425, 200, 200, 25);
        // rekeningField.setFont(new Font("Verdana",Font.ITALIC, 25));
        rekeningField.setBackground(Color.orange);

        nominal.setBounds(200, 235, 800, 25);
        nominal.setFont(new Font("Verdana",Font.PLAIN, 15));
        nominal.setForeground(Color.WHITE);

        transferField.setText("500000");
        transferField.setBounds(425, 235, 200, 25);
        // transferField.setFont(new Font("Verdana",Font.ITALIC, 25));
        transferField.setBackground(Color.orange);

        transferButton.setBounds(285, 365, 200, 25);
        transferButton.setFocusable(false);
        transferButton.setBackground(Color.orange);
        transferButton.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frametransfer.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        kembali.setBounds(285, 400, 200, 25);
        kembali.setFocusable(false);
        kembali.setBackground(Color.orange);
        kembali.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frametransfer.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        frametransfer.add(text);
        frametransfer.add(saldo);
        frametransfer.add(rekening);
        frametransfer.add(rekeningField);
        frametransfer.add(nominal);
        frametransfer.add(transferField);
        frametransfer.add(transferButton);
        frametransfer.add(kembali);
        

    }

}

class Info extends Bank{
    JFrame frameinfo = new JFrame("Telyu Bank - Info");
    JLabel text = new JLabel("<html><head><style>div {text-align: center;}<div>Telyu Bank Apps. Kemudahan untuk anda!<br/>Info Apps</div></html>");
    JLabel desc = new JLabel("<html><head><style>div {text-align: center;}<div>Dibuat Oleh Kelompok ?<br/>1. Muhammad Hilmi Izzulhaq 1101202399</div></html>");
    JButton kembali = new JButton("Kembali");

    Info(){
        frameinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameinfo.getContentPane().setBackground(new Color(210, 4, 45));
        frameinfo.setSize(500,450);
        frameinfo.setLayout(null);
        // frameinfo.setResizable(false);
        frameinfo.setVisible(true);

        text.setBounds(65, 15, 500, 100);
        text.setFont(new Font("Verdana",Font.BOLD, 15));
        text.setForeground(Color.WHITE);

        desc.setBounds(115, 75, 500, 100);
        desc.setFont(new Font("Verdana",Font.ITALIC, 12));
        desc.setForeground(Color.orange);

        kembali.setBounds(150, 300, 200, 25);
        kembali.setFocusable(false);
        kembali.setBackground(Color.orange);
        kembali.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frameinfo.dispose();
                        Homepage homepage1 = new Homepage();
                    }
                });

        frameinfo.add(text);
        frameinfo.add(desc);
        frameinfo.add(kembali);
    }
}

class Pin{
    JFrame framepin = new JFrame("Telyu Bank - Login");
    JLabel logo = new JLabel();
    JLabel pinlbl = new JLabel("Masukkan Pin Anda : ");
    JPasswordField pinField = new JPasswordField();
    JButton pinButton = new JButton("Masuk");
    JLabel pininfo = new JLabel();
    public static String mypin = String.valueOf("pbo123");
    
    Pin(){
        framepin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framepin.getContentPane().setBackground(new Color(210, 4, 45));
        framepin.setSize(500,450);
        framepin.setLayout(null);
        framepin.setResizable(false);
        framepin.setVisible(true);

        logo.setText("TelyuBank App");
        logo.setBounds(115, 75, 400, 50);
        logo.setFont(new Font("Verdana",Font.BOLD, 30));
        logo.setForeground(Color.WHITE);

        pinlbl.setBounds(175, 175, 200, 25);
        pinlbl.setFont(new Font("Verdana",Font.BOLD, 12));
        pinlbl.setForeground(Color.WHITE);

        pinField.setBounds(143, 210, 200, 25);
        pinField.setBackground(Color.orange);

        pinButton.setBounds(143, 245, 200, 25);
        pinButton.setFocusable(false);
        pinButton.setBackground(Color.orange);
        pinButton.addActionListener
                (new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String pinInput = String.valueOf(pinField.getPassword());
                        // pinInput = mypin;
                        pininfo.setText(pinInput);
                        pininfo.setBounds(143, 280, 200, 25);
                        if(pinInput.equals(mypin)) {
                            framepin.dispose();
                            Homepage homepage1 = new Homepage();
                            pininfo.setForeground(Color.white);
                            pininfo.setText("Login Sukses!");
                        }
                        else {
                            pininfo.setForeground(Color.orange);
                            pininfo.setText("Pin Salah");
                        }

                    }
                });

        framepin.add(logo);
        framepin.add(pinlbl);
        framepin.add(pinField);
        framepin.add(pinButton);
        framepin.add(pininfo);
    }
}

public class Bank {
    // public Integer saldoAwal = 0;
    public  static Integer saldoTotal = 0;
    



    public static void main(String[] args) {
        Pin pin = new Pin(); 
        // Homepage homepage1 = new Homepage();
        //    Saldo saldo = new Saldo();
        // Setor setor = new Setor();
    }
}
