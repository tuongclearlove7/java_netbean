
package com.mycompany.onthi_netbean;

import java.util.ArrayList;

public class xe_tai extends xe{

    public xe_tai(String so_xe,String hang_xe, String nam_san_xuat, String color, int so_km) {

        super(so_xe,hang_xe, nam_san_xuat, color, so_km);
    }

    public xe_tai() {

    }

    public void OutputMylist(ArrayList<String> list) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }

     @Override
    public double getcapphat(int km) {

        double sum = 0;
        
        if (km > 50) {
            sum = (km - 50) * 0.10;
        }

        return sum;
    
    }
}
