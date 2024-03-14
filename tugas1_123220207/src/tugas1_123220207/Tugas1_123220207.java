/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_123220207;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Naufal Fauzi
 */

class LoginFrame extends JFrame {
    JLabel judul = new JLabel("Selamat Datang!");
    JLabel tulisan = new JLabel("Silahkan masuk untuk melanjutkan.");
    
    JLabel username = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    
    JLabel password = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    
    JLabel kelamin = new JLabel("Jenis Kelamin");
    JRadioButton pilihLaki = new JRadioButton("Laki-Laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
    
    JButton tombolLogin = new JButton("Login");
            
    LoginFrame(){
        setVisible(true);
        setSize(480, 720);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(judul);
        judul.setBounds(15, 0, 150, 80);
        judul.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(tulisan);
        tulisan.setBounds(15, 10, 200, 110);
        
        //username
        add(username);
        username.setBounds(15, 20, 100, 160);
        add(inputUsername);
        inputUsername.setBounds(15, 120, 430, 25);
        
        //password
        add(password);
        password.setBounds(15, 75, 100, 180);
        add(inputPassword);
        inputPassword.setBounds(15, 180, 430, 25);
        
        add(kelamin);
        kelamin.setBounds(15, 150, 100, 180);
        
        ButtonGroup pilihKelamin = new ButtonGroup();
        pilihKelamin.add(pilihLaki);
        pilihKelamin.add(pilihPerempuan);
        
        add(pilihLaki);
        pilihLaki.setBounds(15, 250, 100, 25);
        add(pilihPerempuan);
        pilihPerempuan.setBounds(250, 250, 100, 25);
        
        add(tombolLogin);
        tombolLogin.setBounds(15, 300, 400, 25);
    }        
}

class MainFrame extends JFrame {
    JLabel judulMain = new JLabel("Welcome, [Mr./Mrs.] [username]");
    JLabel tulisanMain = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    
    JTextField inputPanjang = new JTextField();
    JTextField inputLebar = new JTextField();
    JTextField inputTinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel luasPermukaan = new JLabel("Luas Permukaan Balok");
    
    JLabel hasilLuas = new JLabel("[Hasil berupa angka]");
    JLabel hasilKeliling = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolume = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPermukaan = new JLabel("[Hasil berupa angka]");
    
    MainFrame(){
        setVisible(false);
        setTitle("Halaman Utama");
        setSize(480, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(judulMain);
        judulMain.setBounds(13, 0, 300, 80);
        judulMain.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(tulisanMain);
        tulisanMain.setBounds(13, 20, 500, 80);
       
        add(panjang);
        panjang.setBounds(15, 60, 50, 80);
        add(inputPanjang);
        inputPanjang.setBounds(85, 90, 330, 25);
        
        add(lebar);
        lebar.setBounds(15, 95, 50, 80);
        add(inputLebar);
        inputLebar.setBounds(85, 125, 330, 25);
        
        add(tinggi);
        tinggi.setBounds(15, 130, 50, 80);
        add(inputTinggi);
        inputTinggi.setBounds(85, 160, 330, 25);
        
        add(hitung);
        hitung.setBounds(15, 200, 400, 25);
        
        add(reset);
        reset.setBounds(15, 240, 400, 25);
        
        add(hasil);
        hasil.setBounds(200, 250, 50, 80);
        
        add(luas);
        luas.setBounds(15, 280, 100, 80);
        add(hasilLuas);
        hasilLuas.setBounds(180, 280, 150, 80);
        
        add(keliling);
        keliling.setBounds(15, 310, 100, 80);
        add(hasilKeliling);
        hasilKeliling.setBounds(180, 310, 150, 80);
        
        add(volume);
        volume.setBounds(15, 340, 100, 80);
        add(hasilVolume);
        hasilVolume.setBounds(180, 340, 150, 80);
        
        add(luasPermukaan);
        luasPermukaan.setBounds(15, 370, 130, 80);
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(180, 370, 150, 80);
    }
}
    
public class Tugas1_123220207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        MainFrame mainFrame = new MainFrame();
    }
    
}

