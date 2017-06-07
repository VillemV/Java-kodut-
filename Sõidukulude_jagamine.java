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


public class S�idukulude_jagamine {

	private JFrame frame;
	private JTextArea txtrViimatiTangitudK�tuseHind;
	private JTextArea txtrEurotLiiter;
	private JTextArea txtrHodomeetrin�itS�iduAlguses;
	private JTextArea txtrS�idukiEkspluatatsioonikulu;
	private JTextArea txtrHodomeetrin�itS�iduL�ppedes;
	private JTextArea txtrHinna�mardamine;
	private JTextArea txtrEurotKm;
	private JTextArea txtrKm_1;
	private JTextArea txtrInimest;
	private JTextArea txtrKm_2;
	private JTextArea txtrSidukuludeJagamine;
	private JTextField textFieldS�itjateArv;
	private JTextField textFieldK�tusekulu;
	private JTextField textFieldK�tuseHind;
	private JTextField textFieldEkspluatatsioon;
	private JTextField textFieldHodomeeterAlgus;
	private JTextField textFieldHodomeeterL�pp;
	private JTextField textFieldTulemus;
	private JComboBox �mardamiseValik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S�idukulude_jagamine window = new S�idukulude_jagamine();
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
	public S�idukulude_jagamine() {
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
		
		JTextArea txtrS�itjateArv = new JTextArea();
		txtrS�itjateArv.setFocusable(false);
		txtrS�itjateArv.setEditable(false);
		txtrS�itjateArv.setBackground(new Color(153, 204, 255));
		txtrS�itjateArv.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrS�itjateArv.setText("S�itjate arv:");
		
		JTextArea txtrKeskmineK�tusekulu = new JTextArea();
		txtrKeskmineK�tusekulu.setFocusable(false);
		txtrKeskmineK�tusekulu.setBackground(new Color(153, 204, 255));
		txtrKeskmineK�tusekulu.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrKeskmineK�tusekulu.setText("Keskmine k�tusekulu");
		txtrKeskmineK�tusekulu.setEditable(false);
		
		txtrViimatiTangitudK�tuseHind = new JTextArea();
		txtrViimatiTangitudK�tuseHind.setFocusable(false);
		txtrViimatiTangitudK�tuseHind.setText("Viimati tangitud k\u00FCtuse hind");
		txtrViimatiTangitudK�tuseHind.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrViimatiTangitudK�tuseHind.setEditable(false);
		txtrViimatiTangitudK�tuseHind.setBackground(new Color(153, 204, 255));
		
		txtrEurotLiiter = new JTextArea();
		txtrEurotLiiter.setFocusable(false);
		txtrEurotLiiter.setText("\u20AC / liiter");
		txtrEurotLiiter.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrEurotLiiter.setEditable(false);
		txtrEurotLiiter.setBackground(new Color(153, 204, 255));
		
		txtrHodomeetrin�itS�iduAlguses = new JTextArea();
		txtrHodomeetrin�itS�iduAlguses.setFocusable(false);
		txtrHodomeetrin�itS�iduAlguses.setText("Hodomeetrin\u00E4it s\u00F5idu alguses");
		txtrHodomeetrin�itS�iduAlguses.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHodomeetrin�itS�iduAlguses.setEditable(false);
		txtrHodomeetrin�itS�iduAlguses.setBackground(new Color(153, 204, 255));
		
		txtrS�idukiEkspluatatsioonikulu = new JTextArea();
		txtrS�idukiEkspluatatsioonikulu.setFocusable(false);
		txtrS�idukiEkspluatatsioonikulu.setText("S\u00F5iduki ekspluatatsioonikulu");
		txtrS�idukiEkspluatatsioonikulu.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrS�idukiEkspluatatsioonikulu.setEditable(false);
		txtrS�idukiEkspluatatsioonikulu.setBackground(new Color(153, 204, 255));
		
		txtrHodomeetrin�itS�iduL�ppedes = new JTextArea();
		txtrHodomeetrin�itS�iduL�ppedes.setFocusable(false);
		txtrHodomeetrin�itS�iduL�ppedes.setText("Hodomeetrin\u00E4it s\u00F5idu l\u00F5ppedes");
		txtrHodomeetrin�itS�iduL�ppedes.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHodomeetrin�itS�iduL�ppedes.setEditable(false);
		txtrHodomeetrin�itS�iduL�ppedes.setBackground(new Color(153, 204, 255));
		
		txtrHinna�mardamine = new JTextArea();
		txtrHinna�mardamine.setFocusable(false);
		txtrHinna�mardamine.setText("Hinna \u00FCmardamine");
		txtrHinna�mardamine.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrHinna�mardamine.setEditable(false);
		txtrHinna�mardamine.setBackground(new Color(153, 204, 255));
		
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
					BigDecimal S�itjateArv = new BigDecimal(textFieldS�itjateArv.getText());
					BigDecimal HodomL�pp = new BigDecimal(textFieldHodomeeterL�pp.getText());
					BigDecimal HodomAlgus = new BigDecimal(textFieldHodomeeterAlgus.getText());
					BigDecimal EksplKulu = new BigDecimal(textFieldEkspluatatsioon.getText());
					BigDecimal K�tusekulu = new BigDecimal(textFieldK�tusekulu.getText());
					BigDecimal K�tuseHind = new BigDecimal(textFieldK�tuseHind.getText());
					BigDecimal Sada = new BigDecimal("100");
				
					BigDecimal K�tusekuluKm = K�tusekulu.divide(Sada);
					BigDecimal k�tuseHindKm = K�tusekuluKm.multiply(K�tuseHind);
					BigDecimal kmHind = k�tuseHindKm.add(EksplKulu);
					BigDecimal L�bis�it = HodomL�pp.subtract(HodomAlgus); 
					BigDecimal S�iduMaksumus = L�bis�it.multiply(kmHind);
					BigDecimal Tulemus = S�iduMaksumus.divide(S�itjateArv);
					
					
					BigDecimal �mardatudTulemus;
					if (�mardamiseValik.getSelectedItem().equals("0.01")) {
						�mardatudTulemus = Tulemus.setScale(2, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = �mardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
					if (�mardamiseValik.getSelectedItem().equals("0.10")){
						�mardatudTulemus = Tulemus.setScale(1, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = �mardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
					if (�mardamiseValik.getSelectedItem().equals("1.00")){
						�mardatudTulemus = Tulemus.setScale(0, BigDecimal.ROUND_HALF_UP);
						String txtTulemus = �mardatudTulemus.toString();
						textFieldTulemus.setText(txtTulemus);
					}
				}
				catch (NumberFormatException exp) {
					JOptionPane.showMessageDialog(frame, "Kontrolli sisestatud andmeid. Lubatud on vaid numbrid, komakohtade eraldamiseks kasuta punkti.", 
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
				}
				catch (ArithmeticException exp) {
					JOptionPane.showMessageDialog(frame, "S�itjate arv peab olema v�hemalt 1", 
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
		txtrSidukuludeJagamine.setText("S�idukulude jagamine");
		
		textFieldS�itjateArv = new JTextField();
		textFieldS�itjateArv.setToolTipText("Sisesta s�itjate arv, kes kulusid jagavad");
		textFieldS�itjateArv.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldS�itjateArv.setColumns(10);
		
		textFieldK�tusekulu = new JTextField();
		textFieldK�tusekulu.setToolTipText("Sisesta s�iduki keskmine k�tusekulu 100km kohta");
		textFieldK�tusekulu.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldK�tusekulu.setColumns(10);
		
		textFieldK�tuseHind = new JTextField();
		textFieldK�tuseHind.setToolTipText("Sisesta viimati tangitud k�tuse liitrihind eurodes");
		textFieldK�tuseHind.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldK�tuseHind.setColumns(10);
		
		textFieldEkspluatatsioon = new JTextField();
		textFieldEkspluatatsioon.setToolTipText("Sisesta s�iduki hoolduskulud kilomeetri kohta");
		textFieldEkspluatatsioon.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEkspluatatsioon.setColumns(10);
		
		textFieldHodomeeterAlgus = new JTextField();
		textFieldHodomeeterAlgus.setToolTipText("Sisesta hodomeetrin�it kilomeetri kohta, kui see pole nullitud");
		textFieldHodomeeterAlgus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHodomeeterAlgus.setColumns(10);
		
		textFieldHodomeeterL�pp = new JTextField();
		textFieldHodomeeterL�pp.setToolTipText("Sisesta hodomeetrin�it s�idu l�ppedes");
		textFieldHodomeeterL�pp.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHodomeeterL�pp.setColumns(10);
		
		
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
		txtrEurotInimene.setText("� / inimene");
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
		txtrEurot.setText("�");
		txtrEurot.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrEurot.setEditable(false);
		txtrEurot.setBackground(new Color(153, 204, 255));
		
		�mardamiseValik = new JComboBox();
		�mardamiseValik.setToolTipText("Vali, kui suurtes kup��rides soovid arveldada");
		�mardamiseValik.setModel(new DefaultComboBoxModel(new String[] {"0.01", "0.10", "1.00"}));
		
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
										.addComponent(txtrViimatiTangitudK�tuseHind, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
										.addComponent(txtrS�idukiEkspluatatsioonikulu, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
										.addComponent(txtrHodomeetrin�itS�iduAlguses, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrHinna�mardamine, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrHodomeetrin�itS�iduL�ppedes, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtrTulemus, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(�mardamiseValik, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textFieldK�tuseHind, Alignment.TRAILING)
								.addComponent(textFieldEkspluatatsioon, Alignment.TRAILING)
								.addComponent(textFieldHodomeeterAlgus, Alignment.TRAILING)
								.addComponent(textFieldHodomeeterL�pp, Alignment.TRAILING)
								.addComponent(textFieldTulemus)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrS�itjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
							.addComponent(textFieldS�itjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrKeskmineK�tusekulu, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
							.addComponent(textFieldK�tusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
							.addComponent(textFieldS�itjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrS�itjateArv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtrKeskmineK�tusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldK�tusekulu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(txtrLiitritKm, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrEurotLiiter, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldK�tuseHind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrEurotKm, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEkspluatatsioon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrKm_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldHodomeeterL�pp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrHodomeetrin�itS�iduL�ppedes, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(txtrViimatiTangitudK�tuseHind, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrS�idukiEkspluatatsioonikulu, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtrHodomeetrin�itS�iduAlguses, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrKm_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldHodomeeterAlgus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrHinna�mardamine, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrEurot, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(�mardamiseValik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
