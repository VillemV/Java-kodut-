package s6iduKuludeJagamine;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Sõidukulude_jagamine {

	private JFrame frame;
	private JTextArea txtrViimatiTangitudKütuseHind;
	private JTextArea txtrEurotLiiter;
	private JTextArea txtrHodomeetrinäitSõiduAlguses;
	private JTextArea txtrSõidukiEkspluatatsioonikulu;
	private JTextArea txtrHodomeetrinäitSõiduLõppedes;
	private JTextArea txtrHinnaÜmardamine;
	private JTextArea txtrEurotKm;
	private JTextArea txtrKm_1;
	private JTextArea txtrInimest;
	private JTextArea txtrKm_2;
	private JTextArea txtrSidukuludeJagamine;
	private JTextField textFieldSõitjateArv;
	private JTextField textFieldKütusekulu;
	private JTextField textFieldKütuseHind;
	private JTextField textFieldEkspluatatsioon;
	private JTextField textFieldHodomeeterAlgus;
	private JTextField textFieldHodomeeterLõpp;
	private JTextField textFieldTulemus;
	private JComboBox ÜmardamiseValik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sõidukulude_jagamine window = new Sõidukulude_jagamine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sõidukulude_jagamine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFocusable(false);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea txtrSõitjateArv = new JTextArea();
		txtrSõitjateArv.setFocusable(false);
		txtrSõitjateArv.setEditable(false);
		txtrSõitjateArv.setBackground(new Color(153, 204, 255));
		txtrSõitjateArv.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrSõitjateArv.setText("Sõitjate arv:");
		
		JTextArea txtrKeskmineKütusekulu = new JTextArea();
		txtrKeskmineKütusekulu.setFocusable(false);
		txtrKeskmineKütusekulu.setBackground(new Color(153, 204, 255));
		txtrKeskmineKütusekulu.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrKeskmineKütusekulu.setText("Keskmine kütusekulu");
		txtrKeskmineKütusekulu.setEditable(false);
		
		txtrViimatiTangitudKütuseHind = new JTextArea();
		txtrViimatiTangitudKütuseHind.setFocusable(false);
		txtrViimatiTangitudKütuseHind.setText("Viimati tangitud k\u00FCtuse hind");
		txtrViimatiTangitudKütuseHind.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrViimatiTangitudKütuseHind.setEditable(false);
		txtrViimatiTangitudKütuseHind.setBackground(new Color(153, 204, 255));
		
		txtrEurotLiiter = new JTextArea();
		txtrEurotLiiter.setFocusable(false);
		txtrEurotLiiter.setText("\u20AC / liiter");
		txtrEurotLiiter.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrEurotLiiter.setEditable(false);
		txtrEurotLiiter.setBackground(new Color(153, 204, 255));
		
		txtrHodomeetrinäitSõiduAlguses = new JTextArea();
		txtrHodomeetrinäitSõiduAlguses.setFocusable(false);
		txtrHodomeetrinäitSõiduAlguses.setText("Hodomeetrin\u00E4it s\u00F5idu alguses");
		txtrHodomeetrinäitSõiduAlguses.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHodomeetrinäitSõiduAlguses.setEditable(false);
		txtrHodomeetrinäitSõiduAlguses.setBackground(new Color(153, 204, 255));
		
		txtrSõidukiEkspluatatsioonikulu = new JTextArea();
		txtrSõidukiEkspluatatsioonikulu.setFocusable(false);
		txtrSõidukiEkspluatatsioonikulu.setText("S\u00F5iduki ekspluatatsioonikulu");
		txtrSõidukiEkspluatatsioonikulu.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrSõidukiEkspluatatsioonikulu.setEditable(false);
		txtrSõidukiEkspluatatsioonikulu.setBackground(new Color(153, 204, 255));
		
		txtrHodomeetrinäitSõiduLõppedes = new JTextArea();
		txtrHodomeetrinäitSõiduLõppedes.setFocusable(false);
		txtrHodomeetrinäitSõiduLõppedes.setText("Hodomeetrin\u00E4it s\u00F5idu l\u00F5ppedes");
		txtrHodomeetrinäitSõiduLõppedes.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHodomeetrinäitSõiduLõppedes.setEditable(false);
		txtrHodomeetrinäitSõiduLõppedes.setBackground(new Color(153, 204, 255));
		
		txtrHinnaÜmardamine = new JTextArea();
		txtrHinnaÜmardamine.setFocusable(false);
		txtrHinnaÜmardamine.setText("Hinna \u00FCmardamine");
		txtrHinnaÜmardamine.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHinnaÜmardamine.setEditable(false);
		txtrHinnaÜmardamine.setBackground(new Color(153, 204, 255));
		
		txtrEurotKm = new JTextArea();
		txtrEurotKm.setFocusable(false);
		txtrEurotKm.setText("\u20AC / km");
		txtrEurotKm.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrEurotKm.setEditable(false);
		txtrEurotKm.setBackground(new Color(153, 204, 255));
		
		txtrKm_1 = new JTextArea();
		txtrKm_1.setFocusable(false);
		txtrKm_1.setText("km");
		txtrKm_1.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrKm_1.setEditable(false);
		txtrKm_1.setBackground(new Color(153, 204, 255));
		
		txtrInimest = new JTextArea();
		txtrInimest.setFocusable(false);
		txtrInimest.setText("inimest");
		txtrInimest.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrInimest.setEditable(false);
		txtrInimest.setBackground(new Color(153, 204, 255));
		
		txtrKm_2 = new JTextArea();
		txtrKm_2.setFocusable(false);
		txtrKm_2.setText("km");
		txtrKm_2.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrKm_2.setEditable(false);
		txtrKm_2.setBackground(new Color(153, 204, 255));
		
		JButton btnArvuta = new JButton("ARVUTA");
		frame.getRootPane().setDefaultButton(btnArvuta);
		btnArvuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					BigDecimal SõitjateArv = new BigDecimal(textFieldSõitjateArv.getText());
					BigDecimal HodomLõpp = new BigDecimal(textFieldHodomeeterLõpp.getText());
					BigDecimal HodomAlgus = new BigDecimal(textFieldHodomeeterAlgus.getText());
					BigDecimal EksplKulu = new BigDecimal(textFieldEkspluatatsioon.getText());
					BigDecimal Kütusekulu = new BigDecimal(textFieldKütusekulu.getText());
					BigDecimal KütuseHind = new BigDecimal(textFieldKütuseHind.getText());
					BigDecimal Sada = new BigDecimal("100");
				
					BigDecimal KütusekuluKm = Kütusekulu.divide(Sada);
					BigDecimal kütuseHindKm = KütusekuluKm.multiply(KütuseHind);
					BigDecimal kmHind = kütuseHindKm.add(EksplKulu);
					BigDecimal Läbisõit = HodomLõpp.subtract(HodomAlgus); 
					BigDecimal SõiduMaksumus = Läbisõit.multiply(kmHind);
					BigDecimal Tulemus = SõiduMaksumus.divide(SõitjateArv);
					
					
					BigDecimal ÜmardatudTulemus;
					if (ÜmardamiseValik.getSelectedItem().equals("0.01")) {
						ÜmardatudTulemus = Tulemus.setScale(2, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = ÜmardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
					if (ÜmardamiseValik.getSelectedItem().equals("0.10")){
						ÜmardatudTulemus = Tulemus.setScale(1, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = ÜmardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
					if (ÜmardamiseValik.getSelectedItem().equals("1.00")){
						ÜmardatudTulemus = Tulemus.setScale(0, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = ÜmardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
				}
				catch (NumberFormatException exp) {
					JOptionPane.showMessageDialog(frame, "Kontrolli sisestatud andmeid. Lubatud on vaid numbrid, komakohtade eraldamiseks kasuta punkti.", 
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
				}
				catch (ArithmeticException exp) {
					JOptionPane.showMessageDialog(frame, "Sõitjate arv peab olema vähemalt 1", 
							"ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		txtrSidukuludeJagamine = new JTextArea();
		txtrSidukuludeJagamine.setFocusable(false);
		txtrSidukuludeJagamine.setBackground(new Color(153, 204, 255));
		txtrSidukuludeJagamine.setEditable(false);
		txtrSidukuludeJagamine.setFont(new Font("Magneto", Font.PLAIN, 35));
		txtrSidukuludeJagamine.setText("Sõidukulude jagamine");
		
		textFieldSõitjateArv = new JTextField();
		textFieldSõitjateArv.setToolTipText("Sisesta sõitjate arv, kes kulusid jagavad");
		textFieldSõitjateArv.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSõitjateArv.setColumns(10);
		
		textFieldKütusekulu = new JTextField();
		textFieldKütusekulu.setToolTipText("Sisesta sõiduki keskmine kütusekulu 100km kohta");
		textFieldKütusekulu.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldKütusekulu.setColumns(10);
		
		textFieldKütuseHind = new JTextField();
		textFieldKütuseHind.setToolTipText("Sisesta viimati tangitud kütuse liitrihind eurodes");
		textFieldKütuseHind.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldKütuseHind.setColumns(10);
		
		textFieldEkspluatatsioon = new JTextField();
		textFieldEkspluatatsioon.setToolTipText("Sisesta sõiduki hoolduskulud kilomeetri kohta");
		textFieldEkspluatatsioon.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEkspluatatsioon.setColumns(10);
		
		textFieldHodomeeterAlgus = new JTextField();
		textFieldHodomeeterAlgus.setToolTipText("Sisesta hodomeetrinäit kilomeetri kohta, kui see pole nullitud");
		textFieldHodomeeterAlgus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHodomeeterAlgus.setColumns(10);
		
		textFieldHodomeeterLõpp = new JTextField();
		textFieldHodomeeterLõpp.setToolTipText("Sisesta hodomeetrinäit sõidu lõppedes");
		textFieldHodomeeterLõpp.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHodomeeterLõpp.setColumns(10);
		
		
		textFieldTulemus = new JTextField();
		textFieldTulemus.setFocusable(false);
		textFieldTulemus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTulemus.setEditable(false);
		textFieldTulemus.setForeground(new Color(204, 0, 0));
		textFieldTulemus.setColumns(10);
		
				
		
		JTextArea txtrTulemus = new JTextArea();
		txtrTulemus.setFocusable(false);
		txtrTulemus.setText("Tulemus");
		txtrTulemus.setFont(new Font("Arial", Font.BOLD, 15));
		txtrTulemus.setEditable(false);
		txtrTulemus.setBackground(new Color(153, 204, 255));
		
		JTextArea txtrEurotInimene = new JTextArea();
		txtrEurotInimene.setFocusable(false);
		txtrEurotInimene.setText("€ / inimene");
		txtrEurotInimene.setFont(new Font("Arial", Font.BOLD, 15));
		txtrEurotInimene.setEditable(false);
		txtrEurotInimene.setBackground(new Color(153, 204, 255));
		
		JTextArea txtrLiitritKm = new JTextArea();
		txtrLiitritKm.setFocusable(false);
		txtrLiitritKm.setText("l / 100km");
		txtrLiitritKm.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrLiitritKm.setEditable(false);
		txtrLiitritKm.setBackground(new Color(153, 204, 255));
		
		JTextArea txtrEurot = new JTextArea();
		txtrEurot.setFocusable(false);
		txtrEurot.setText("€");
		txtrEurot.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrEurot.setEditable(false);
		txtrEurot.setBackground(new Color(153, 204, 255));
		
		ÜmardamiseValik = new JComboBox();
		ÜmardamiseValik.setToolTipText("Vali, kui suurtes kupüürides soovid arveldada");
		ÜmardamiseValik.setModel(new DefaultComboBoxModel(new String[] {"0.01", "0.10", "1.00"}));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(0)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtrViimatiTangitudKütuseHind, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
										.addComponent(txtrSõidukiEkspluatatsioonikulu, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
										.addComponent(txtrHodomeetrinäitSõiduAlguses, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrHinnaÜmardamine, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrHodomeetrinäitSõiduLõppedes, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrTulemus, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ÜmardamiseValik, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textFieldKütuseHind, Alignment.TRAILING)
								.addComponent(textFieldEkspluatatsioon, Alignment.TRAILING)
								.addComponent(textFieldHodomeeterAlgus, Alignment.TRAILING)
								.addComponent(textFieldHodomeeterLõpp, Alignment.TRAILING)
								.addComponent(textFieldTulemus)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrSõitjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
							.addComponent(textFieldSõitjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrKeskmineKütusekulu, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
							.addComponent(textFieldKütusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrEurotLiiter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrKm_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrKm_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrEurotKm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrEurot, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(txtrInimest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtrLiitritKm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrEurotInimene, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(344))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(93)
					.addComponent(btnArvuta, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(403, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(txtrSidukuludeJagamine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(364, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(txtrSidukuludeJagamine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtrInimest, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(textFieldSõitjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrSõitjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtrKeskmineKütusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldKütusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(txtrLiitritKm, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrEurotLiiter, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldKütuseHind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrEurotKm, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEkspluatatsioon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrKm_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldHodomeeterLõpp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrHodomeetrinäitSõiduLõppedes, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(txtrViimatiTangitudKütuseHind, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrSõidukiEkspluatatsioonikulu, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrHodomeetrinäitSõiduAlguses, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrKm_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldHodomeeterAlgus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrHinnaÜmardamine, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrEurot, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(ÜmardamiseValik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(btnArvuta, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTulemus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrEurotInimene, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrTulemus, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(105))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
