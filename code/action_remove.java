/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onthi_netbean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

public class action_remove implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<xe_oto> list_xeoto = new ArrayList<>();
        ArrayList<xe_tai> list_xetai = new ArrayList<>();
        xe_oto xecon = new xe_oto();
        list_xeoto.add(xecon);

        try{

            String mydata =  libRary.readFile(App.path);
            String[] splitString = mydata.split(", ");
            String user = App.remove_soxe.getText();

            for (int i = 0; i < list_xeoto.size(); i++){

                for (int j = 0; j < splitString.length; j++) {

                    String[] getkey = splitString[j].split(" : ");

                    for (int k = 0; k < getkey.length; k++) {

                        if (user.equals(getkey[k])) {

                            FileWriter fw = new FileWriter(App.path, false);
                            BufferedWriter bw = new BufferedWriter(fw);

                            bw.write("số xe bạn vừa xóa là : " + getkey[k]);
                            App.outline.setText("số xe bạn vừa xóa là : " + getkey[k]);

                            bw.close();
                            fw.close();
                        }
                    }
                }
            }
        }

        catch (Exception err) {

            App.outline.setText("Bạn không thể xóa vì không có đơn nào trong file txt !");

        }
    }
}
