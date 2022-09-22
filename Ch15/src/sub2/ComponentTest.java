package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 130, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(32, 34, 96, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(32, 72, 87, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(120, 72, 87, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(208, 72, 87, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					
				}
			}
		});
		btn4.setBounds(296, 72, 87, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(32, 115, 115, 24);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(32, 149, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(32, 174, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(32, 199, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1Result = new JLabel("결과 :");
		lbltxtf1Result.setBounds(229, 152, 170, 15);
		contentPane.add(lbltxtf1Result);
		
		JLabel lbltxtf2Result = new JLabel("결과 :");
		lbltxtf2Result.setBounds(229, 177, 170, 15);
		contentPane.add(lbltxtf2Result);
		
		JLabel lbltxtf3Result = new JLabel("결과 :");
		lbltxtf3Result.setBounds(229, 202, 170, 15);
		contentPane.add(lbltxtf3Result);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.setBounds(150, 173, 67, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.setBounds(150, 198, 67, 23);
		contentPane.add(btntxtf3);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt1 = txtf1.getText();
				lbltxtf1Result.setText("결과 : " + txt1);
				
				String txt2 = txtf2.getText();
				lbltxtf2Result.setText("결과 : " + txt2);

				String txt3 = txtf3.getText();
				lbltxtf3Result.setText("결과 : " + txt3);
				
			}
		});
		btntxtf1.setBounds(150, 148, 67, 23);
		contentPane.add(btntxtf1);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(32, 230, 130, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(42, 254, 115, 24);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(32, 281, 54, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(90, 281, 54, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(150, 281, 54, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(208, 281, 54, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(266, 281, 54, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(50, 310, 333, 24);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) { 
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) { 
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) { 
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) { 
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) { 
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + chks.toString());
			}
		});
		btnChk.setBounds(328, 281, 67, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(32, 344, 146, 24);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtn1 = new JRadioButton("남자");
		rdbtn1.setBounds(38, 374, 56, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("여자");
		rdbtn2.setBounds(116, 374, 56, 23);
		contentPane.add(rdbtn2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtn1);
		bg.add(rdbtn2);
		
		JButton rdbtnChk_1 = new JButton("확인");
		rdbtnChk_1.setBounds(185, 374, 67, 23);
		contentPane.add(rdbtnChk_1);
		
		JLabel rdChkResult_1 = new JLabel("결과 :");
		rdChkResult_1.setBounds(52, 405, 333, 24);
		contentPane.add(rdChkResult_1);
		
	}
}
