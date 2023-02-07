/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onthi_netbean;

import java.util.ArrayList;

abstract public class QLPTGT {
    
    public static void thongke(ArrayList<String> list, int km){
     
      
        for(int i =0 ; i < list.size(); i++){
            
            if(km > 50){
                
                System.out.println((i+1) + " xe di tren 50km la : " + list.get(i));
            }  
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list_oto = new ArrayList<>();
        ArrayList<String> list_xetai = new ArrayList<>();

        xe_oto xe_con = new xe_oto("47B-12345","Mercedes","2023","black",51);
        xe_tai xe_lon = new xe_tai("47A-12346","Hyundai","2023","blue",200);

        list_oto.add(String.valueOf(xe_con));
        list_xetai.add(String.valueOf(xe_lon));

        xe_con.OutputMylist(list_oto);
        xe_lon.OutputMylist(list_xetai);

        System.out.println("so lit xang cap phat la : " + xe_con.getcapphat(xe_con.getSo_km()));
        System.out.println("so lit xang cap phat la : " + xe_lon.getcapphat(xe_lon.getSo_km()));
  
        
        thongke(list_oto,xe_con.getSo_km());
        thongke(list_xetai,xe_lon.getSo_km());
        
       
        libRary.writeFile(list_oto, "so lit xang cap phat la : " + String.valueOf(xe_con.getcapphat(xe_con.getSo_km())));
        libRary.writeFile(list_xetai, "so lit xang cap phat la : " + String.valueOf(xe_lon.getcapphat(xe_lon.getSo_km())));

    }
}
