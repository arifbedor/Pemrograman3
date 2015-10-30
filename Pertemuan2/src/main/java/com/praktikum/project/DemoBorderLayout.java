package com.praktikum.project;

import javax.swing.*;
import java.awt.BorderLayout;

public class DemoBorderLayout{
	public static void main (String[] xx){
		//Beberapa button untuk demo
		JButton button1 = new JButton("Tombol 1");
		JButton button2 = new JButton("#2");
		JButton button3 = new JButton("Tombol Tiga");
		JButton button4 = new JButton("Tombol 4 : Panjang");
		JButton button5 = new JButton("Btn 5");
		JButton button6 = new JButton("No. 6");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.WEST);
		panel.add(button3, BorderLayout.SOUTH);
		panel.add(button4, BorderLayout.EAST);
		panel.add(button5, BorderLayout.CENTER);
		
		//Menginstankan Frame
		JFrame fr = new JFrame("Belajar Layout");
		
		fr.getContentPane().add(panel);
		//Ukuran frame
		fr.setSize(800,200);
		
		//Posisi di tengah
		fr.setLocationRelativeTo(null);
		
		//untuk mengatur remote tutup/tidak
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Tampilkan
		fr.setVisible(true);
	}
}