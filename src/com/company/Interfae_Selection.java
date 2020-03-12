package com.company;

import sun.swing.BakedArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interfae_Selection {
    Resource_info resource_info = Resource_info.getInstance();
    List<Resource_info.Device_info> D_info = resource_info.getD_info();
    List<Resource_info.Device_port_info> DP_info = resource_info.getDP_info();
    List<Resource_info.Host_info> Host_list = resource_info.getHost_list();
    List<Resource_info.Selection_Info> Selection_list = resource_info.getSelection_list();
    List<String> Path_list = resource_info.getPath_info();
    String[] Src_Dst_Mac = resource_info.getSrc_Dst_Mac();
    String Path = null;




/*    public void Int_selection () {
        int i, j;
        for (i = 0; i < D_info.size(); i++) {
            Resource_info.Selection_Info Tmp_Sel = new Resource_info.Selection_Info();


            if (D_info.get(i).Wired_conn == 'O') {
                Tmp_Sel.Sel_Info.ID = D_info.get(i).Dev_ID;
                Tmp_Sel.Sel_Info.sel_ID = D_info.get(i).Wired_ID;
                Tmp_Sel.Sel_Info.Int = "Wired";
                Tmp_Sel.Sel_Info.IP = D_info.get(i).Wired_IP;
                Tmp_Sel.Sel_Info.MAC = D_info.get(i).Wired_MAC;
                Tmp_Sel.Sel_Info.loc = D_info.get(i).Wired_loc;
                Tmp_Sel.Sel_Info.conn = D_info.get(i).Wired_conn;

                Tmp_Sel.Can_Info.ID = D_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.can_ID1 = D_info.get(i).Wifi_ID;
                Tmp_Sel.Can_Info.Int1 = "Wifi";
                Tmp_Sel.Can_Info.IP1 = D_info.get(i).Wifi_IP;
                Tmp_Sel.Can_Info.MAC1 = D_info.get(i).Wifi_MAC;
                Tmp_Sel.Can_Info.loc1 = D_info.get(i).Wifi_loc;
                Tmp_Sel.Can_Info.conn1 = D_info.get(i).Wifi_conn;

                Tmp_Sel.Can_Info.can_ID2 = D_info.get(i).LTE_ID;
                Tmp_Sel.Can_Info.Int2 = "LTE";
                Tmp_Sel.Can_Info.IP2 = D_info.get(i).LTE_IP;
                Tmp_Sel.Can_Info.MAC2 = D_info.get(i).LTE_MAC;
                Tmp_Sel.Can_Info.loc2 = D_info.get(i).LTE_loc;
                Tmp_Sel.Can_Info.conn2 = D_info.get(i).LTE_conn;

            } else if (D_info.get(i).Wifi_conn == 'O') {

                Tmp_Sel.Sel_Info.ID = D_info.get(i).Dev_ID;
                Tmp_Sel.Sel_Info.sel_ID = D_info.get(i).Wifi_ID;
                Tmp_Sel.Sel_Info.Int = "Wifi";
                Tmp_Sel.Sel_Info.IP = D_info.get(i).Wifi_IP;
                Tmp_Sel.Sel_Info.MAC = D_info.get(i).Wifi_MAC;
                Tmp_Sel.Sel_Info.loc = D_info.get(i).Wifi_loc;
                Tmp_Sel.Sel_Info.conn = D_info.get(i).Wifi_conn;

                Tmp_Sel.Can_Info.ID = D_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.can_ID1 = D_info.get(i).Wired_ID;
                Tmp_Sel.Can_Info.Int1 = "Wired";
                Tmp_Sel.Can_Info.IP1 = D_info.get(i).Wired_IP;
                Tmp_Sel.Can_Info.MAC1 = D_info.get(i).Wired_MAC;
                Tmp_Sel.Can_Info.loc1 = D_info.get(i).Wired_loc;
                Tmp_Sel.Can_Info.conn1 = D_info.get(i).Wired_conn;

                Tmp_Sel.Can_Info.can_ID2 = D_info.get(i).LTE_ID;
                Tmp_Sel.Can_Info.Int2 = "LTE";
                Tmp_Sel.Can_Info.IP2 = D_info.get(i).LTE_IP;
                Tmp_Sel.Can_Info.MAC2 = D_info.get(i).LTE_MAC;
                Tmp_Sel.Can_Info.loc2 = D_info.get(i).LTE_loc;
                Tmp_Sel.Can_Info.conn2 = D_info.get(i).LTE_conn;

            } else if (D_info.get(i).LTE_conn == 'O') {

                Tmp_Sel.Sel_Info.ID = D_info.get(i).Dev_ID;

                Tmp_Sel.Sel_Info.sel_ID = D_info.get(i).LTE_ID;
                Tmp_Sel.Sel_Info.Int = "LTE";
                Tmp_Sel.Sel_Info.IP = D_info.get(i).LTE_IP;
                Tmp_Sel.Sel_Info.MAC = D_info.get(i).LTE_MAC;
                Tmp_Sel.Sel_Info.loc = D_info.get(i).LTE_loc;
                Tmp_Sel.Sel_Info.conn = D_info.get(i).LTE_conn;

                Tmp_Sel.Can_Info.ID = D_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.IP1 = D_info.get(i).Wired_IP;
                Tmp_Sel.Can_Info.Int1 = "Wired";
                Tmp_Sel.Can_Info.IP1 = D_info.get(i).Wired_IP;
                Tmp_Sel.Can_Info.MAC1 = D_info.get(i).Wired_MAC;
                Tmp_Sel.Can_Info.loc1 = D_info.get(i).Wired_loc;
                Tmp_Sel.Can_Info.conn1 = D_info.get(i).Wired_conn;

                Tmp_Sel.Can_Info.can_ID2 = D_info.get(i).Wifi_ID;
                Tmp_Sel.Can_Info.Int2 = "Wifi";
                Tmp_Sel.Can_Info.IP2 = D_info.get(i).Wifi_IP;
                Tmp_Sel.Can_Info.MAC2 = D_info.get(i).Wifi_MAC;
                Tmp_Sel.Can_Info.loc2 = D_info.get(i).Wifi_loc;
                Tmp_Sel.Can_Info.conn2 = D_info.get(i).Wifi_conn;
            }
            Selection_list.add(Tmp_Sel);



        }
    }

    */

    public void Int_selection () {
        int i, j;
        for (i = 0; i < DP_info.size(); i++) {
            Resource_info.Selection_Info Tmp_Sel = new Resource_info.Selection_Info();

            if (DP_info.get(i).Wifi_enabled == 'O') {

                Tmp_Sel.Sel_Info.ID = DP_info.get(i).Dev_ID;
                Tmp_Sel.Host_ID=DP_info.get(i).Host_ID;
                Tmp_Sel.Sel_Info.Int = "Wifi";
                Tmp_Sel.Sel_Info.MAC = DP_info.get(i).Wifi_MAC;
                Tmp_Sel.Sel_Info.port = DP_info.get(i).Wifi_port;
                Tmp_Sel.Sel_Info.enabled = DP_info.get(i).Wifi_enabled;

                Tmp_Sel.Can_Info.ID = DP_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.Int1 = "Wired";
                Tmp_Sel.Can_Info.MAC1 = DP_info.get(i).Wired_MAC;
                Tmp_Sel.Can_Info.port1 = DP_info.get(i).Wired_port;
                Tmp_Sel.Can_Info.enabled1 = DP_info.get(i).Wired_enabled;

                Tmp_Sel.Can_Info.Int2 = "Multi-Hop WiFi";
                Tmp_Sel.Can_Info.MAC2 = DP_info.get(i).LTE_MAC;
                Tmp_Sel.Can_Info.port2 = DP_info.get(i).LTE_port;
                Tmp_Sel.Can_Info.enabled2 = DP_info.get(i).LTE_enabled;

            }
            else if (DP_info.get(i).LTE_enabled == 'O') {

                Tmp_Sel.Sel_Info.ID = DP_info.get(i).Dev_ID;
                Tmp_Sel.Host_ID=DP_info.get(i).Host_ID;
                Tmp_Sel.Sel_Info.Int = "Multi-Hop WiFi";
                Tmp_Sel.Sel_Info.MAC = DP_info.get(i).LTE_MAC;
                Tmp_Sel.Sel_Info.port = DP_info.get(i).LTE_port;
                Tmp_Sel.Sel_Info.enabled = DP_info.get(i).LTE_enabled;

                Tmp_Sel.Can_Info.ID = DP_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.Int1 = "Wired";
                Tmp_Sel.Can_Info.MAC1 = DP_info.get(i).Wired_MAC;
                Tmp_Sel.Can_Info.port1 = DP_info.get(i).Wired_port;
                Tmp_Sel.Can_Info.enabled1 = DP_info.get(i).Wired_enabled;

                Tmp_Sel.Can_Info.Int2 = "Wifi";
                Tmp_Sel.Can_Info.MAC2 = DP_info.get(i).Wifi_MAC;
                Tmp_Sel.Can_Info.port2 = DP_info.get(i).Wifi_port;
                Tmp_Sel.Can_Info.enabled2 = DP_info.get(i).Wifi_enabled;
            }
            else if (DP_info.get(i).Wired_enabled == 'O') {
                Tmp_Sel.Sel_Info.ID = DP_info.get(i).Dev_ID;
                Tmp_Sel.Host_ID=DP_info.get(i).Host_ID;
                Tmp_Sel.Sel_Info.Int = "Wired";
                Tmp_Sel.Sel_Info.MAC = DP_info.get(i).Wired_MAC;
                Tmp_Sel.Sel_Info.port = DP_info.get(i).Wired_port;
                Tmp_Sel.Sel_Info.enabled = DP_info.get(i).Wired_enabled;

                Tmp_Sel.Can_Info.ID = DP_info.get(i).Dev_ID;

                Tmp_Sel.Can_Info.Int1 = "Wifi";
                Tmp_Sel.Can_Info.MAC1 = DP_info.get(i).Wifi_MAC;
                Tmp_Sel.Can_Info.port1 = DP_info.get(i).Wifi_port;
                Tmp_Sel.Can_Info.enabled1 = DP_info.get(i).Wifi_enabled;

                Tmp_Sel.Can_Info.Int2 = "Multi-Hop WiFi";
                Tmp_Sel.Can_Info.MAC2 = DP_info.get(i).LTE_MAC;
                Tmp_Sel.Can_Info.port2 = DP_info.get(i).LTE_port;
                Tmp_Sel.Can_Info.enabled2 = DP_info.get(i).LTE_enabled;

            }
            Selection_list.add(Tmp_Sel);

        }
    }




    public void Interface_Selection_Result(){
        int i;
        for(i=0; i<Selection_list.size(); i++){
            System.out.println("------------"+ Selection_list.get(i).Sel_Info.ID + "------------");
            System.out.println("------------"+ Selection_list.get(i).Host_ID + "------------");
            System.out.println("============Selected Interface Information============");
            System.out.println("Interface: " + Selection_list.get(i).Sel_Info.Int);
            System.out.println("Interface MAC: " + Selection_list.get(i).Sel_Info.MAC);
            System.out.println("Interface Port: " + Selection_list.get(i).Sel_Info.port);

            System.out.println("***********Candidate Interface Information***********");
            if(!(Selection_list.get(i).Can_Info.enabled1 == 'X')) {
                System.out.println("Interface1: " + Selection_list.get(i).Can_Info.Int1);
                System.out.println("Interface1 MAC: " + Selection_list.get(i).Can_Info.MAC1);
                System.out.println("Interface1 Port: " + Selection_list.get(i).Can_Info.port1);
            }
            if(!(Selection_list.get(i).Can_Info.enabled2=='X')) {
                System.out.println("Interface2: " + Selection_list.get(i).Can_Info.Int2);
                System.out.println("Interface2 MAC: " + Selection_list.get(i).Can_Info.MAC2);
                System.out.println("Interface2 Port: " + Selection_list.get(i).Can_Info.port2);
            }
            if((Selection_list.get(i).Can_Info.enabled1 == 'X') && (Selection_list.get(i).Can_Info.enabled2 == 'X')){
                System.out.println("No Candidate Interface");
            }
            System.out.println(" ");
        }

    }
    public void IS_list_clear(){
        Selection_list.clear();
        DP_info.clear();
    }

}
