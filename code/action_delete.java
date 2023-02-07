/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onthi_netbean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class action_delete implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        boolean clean_file = false;

        try {

            File file = new File(App.path);
            FileWriter fw = new FileWriter(file, clean_file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("");

            bw.close();
            fw.close();

            App.outline.setText("");

        }

        catch (Exception err) {

            err.printStackTrace();
        }
    }
}
