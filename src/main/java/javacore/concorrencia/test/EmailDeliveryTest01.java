package javacore.concorrencia.test;


import javacore.concorrencia.dominio.Members;
import javacore.concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread naruto = new Thread(new EmailDeliveryService(members), "naruto");
        Thread sasuke = new Thread(new EmailDeliveryService(members), "sasuke");
        naruto.start();
        sasuke.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
