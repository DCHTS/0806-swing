import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener {

    int num = 0;

    JLabel label = new JLabel();


    public void tt() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("RigaCodingSchool Assignment");
        frame.setVisible(true);

        panel.setLayout(null);

        label.setText("Name");
        label.setBounds(20, 30, 90, 30);
        panel.add(label);

        JTextField name = new JTextField();
        name.setBounds(150, 30, 170, 30);
        panel.add(name);

        label.setText("E-mail");
        label.setBounds(20, 60, 90, 30);
        panel.add(label);

        JTextField email = new JTextField();
        email.setBounds(150, 60, 170, 30);
        panel.add(email);

        label.setText("Password");
        label.setBounds(20, 90, 90, 30);
        panel.add(label);

        JPasswordField password = new JPasswordField();
        password.setBounds(150, 90, 170, 30);
        panel.add(password);

        JButton btn = new JButton("click");
        btn.setBounds(20, 120, 60, 30);
        panel.add(btn);
        btn.addActionListener(this);


//        System.out.println(nameField.getText());


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        label.setText("Nr.: " + num++);
    }

        String name1 = name;
        name.setText(name1);

        String email1 = email.getText();
        email.setText(email1);

        String password1 = password.getText();
        password.setText(password1);
        System.out.println(name + " " + email + " " + password);

    }
}

