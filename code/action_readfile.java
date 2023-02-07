/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onthi_netbean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action_readfile implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        App.outline.setText(libRary.readFile(App.path));

        System.out.println("Show data!!!");
    }
}