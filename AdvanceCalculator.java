import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
 

private JFrame frame;
private JTextField txtnum1;
private JTextField txtnum2;
JLabel lblresult;
JButton btnAdd;
JButton btnMin;
JButton btnSub;
JButton btnDiv;
private int operation;
private JLabel lblResult;
 
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Cal window = new Cal();
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
public Cal() {
initialize();
}
 
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 509, 370);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Calculator");
lblNewLabel.setFont(new Font("Trajan Pro", Font.BOLD, 35));
lblNewLabel.setBounds(119, 11, 283, 38);
frame.getContentPane().add(lblNewLabel);
JPanel panel = new JPanel();
panel.setBounds(43, 73, 402, 184);
frame.getContentPane().add(panel);
panel.setLayout(null);
txtnum1 = new JTextField();
txtnum1.setFont(new Font("Tahoma", Font.BOLD, 13));
txtnum1.setBounds(207, 38, 153, 20);
panel.add(txtnum1);
txtnum1.setColumns(10);
txtnum2 = new JTextField();
txtnum2.setFont(new Font("Tahoma", Font.BOLD, 13));
txtnum2.setBounds(207, 84, 158, 20);
panel.add(txtnum2);
txtnum2.setColumns(10);
JLabel lblNewLabel_1 = new JLabel("Number 1");
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
lblNewLabel_1.setBounds(38, 41, 102, 14);
panel.add(lblNewLabel_1);
JLabel lblNumber = new JLabel("Number 2");
lblNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
lblNumber.setBounds(38, 87, 102, 14);
panel.add(lblNumber);
btnAdd = new JButton("+");
btnAdd.setBounds(10, 126, 89, 47);
panel.add(btnAdd);
btnMin = new JButton("-");
btnMin.setBounds(109, 126, 89, 47);
panel.add(btnMin);
     btnSub = new JButton("*");
btnSub.setBounds(207, 126, 89, 47);
panel.add(btnSub);
btnDiv = new JButton("/");
btnDiv.setBounds(303, 126, 89, 47);
panel.add(btnDiv);
btnAdd.addActionListener(this);
btnMin.addActionListener(this);
btnSub.addActionListener(this);
btnDiv.addActionListener(this);
lblresult = new JLabel("New label");
lblresult.setForeground(Color.RED);
lblresult.setFont(new Font("Times New Roman", Font.BOLD, 24));
lblresult.setBounds(260, 276, 120, 28);
frame.getContentPane().add(lblresult);
lblResult = new JLabel("Result");
lblResult.setFont(new Font("Times New Roman", Font.BOLD, 22));
lblResult.setBounds(164, 276, 120, 28);
frame.getContentPane().add(lblResult);
}
public void getTotal(int operation)
{
if(txtnum1.getText().length()!=0 && txtnum2.getText().length()!=0)
{
switch(operation)
{
case 1:
lblresult.setText(""+(Double.parseDouble(txtnum1.getText()) + Double.parseDouble(txtnum2.getText())));
break;
case 2:
lblresult.setText(""+(Double.parseDouble(txtnum1.getText() ) - Double.parseDouble(txtnum2.getText())));
break;
case 3:
lblresult.setText(""+(Double.parseDouble(txtnum1.getText()) *  Double.parseDouble(txtnum2.getText())));
break;
case 4:
lblresult.setText(""+(Double.parseDouble(txtnum1.getText()) / Double.parseDouble(txtnum2.getText())));
break;
}
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==btnAdd)
{
operation=1;
getTotal(operation);
}
else if(ae.getSource()==btnMin)
{
operation=2;
getTotal(operation);
}
else if(ae.getSource()==btnSub)
{
operation=3;
getTotal(operation);
}
else if(ae.getSource()==btnDiv)
{
operation=4;
getTotal(operation);



//new code goes here
}
}
}
