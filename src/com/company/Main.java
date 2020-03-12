package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sun.awt.image.ImageWatched;

import javax.naming.ldap.Control;
import java.io.*;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int k = 0;
        int i, j;
        Resource_info resource_info = Resource_info.getInstance();
        List<Resource_info.Device_info> D_info = resource_info.getD_info();
        List<Resource_info.Device_port_info> DP_info = resource_info.getDP_info();
        List<Resource_info.Cont_dp_info> Controller_dp_info = resource_info.getCont_DP_info();
        List<Resource_info.Host_info> Host_list = resource_info.getHost_list();
        List<Resource_info.Link_info> Link_list = resource_info.getLink_info();
        List<Resource_info.Selection_Info> Selection_list = resource_info.getSelection_list();
        List<String> Path_list = resource_info.getPath_info();
        String[] Src_Dst_Mac = resource_info.getSrc_Dst_Mac();
        Boolean flag;
        String[] user_input = new String[2];
        String[] ID_input = new String[2];

        Status_Report2 sr = new Status_Report2();
        Interfae_Selection is = new Interfae_Selection();
        Intent_Installer ii = new Intent_Installer();
        Topology_change_handler tcp = new Topology_change_handler();
        Backup_DB_man db = new Backup_DB_man();


        while (true) {
            sr.Read_teamplate();
            sr.get_device_port_info(Controller_dp_info);
            sr.Print_Controller_HostInfo();
            sr.get_Link_info(Link_list);
            sr.Interface_status(Controller_dp_info);
            sr.Print_Template_Status();

            is.Int_selection();
            is.Interface_Selection_Result();

            for (i = 0; i < Selection_list.size(); i++) {
                user_input = ii.Selection_list_iterator(Selection_list, i);
                sr.get_Path_info(user_input);
                sr.Print_Controller_PathInfo();
                sr.Path_parser2(i);
                sr.Print_Parsing_Path_result();
                ii.Intent_installer();

                Path_list.clear();
                sr.Clear_Path();
            }


            Thread.sleep(2000);
            while (true) {
                flag = tcp.Topology_change_detector(Link_list);
                tcp.TCP_list_clear();
                if (flag == true) {
                    System.out.println(" ");
                    System.out.println(" Topology is not changed: Do nothing ");
                    System.out.println(" ");

                    Thread.sleep(2000);
                } else {
                    System.out.println(" ");
                    System.out.println(" Topology is changed: Find new path to intent installation ");
                    System.out.println(" ");

                    ii.remove_All_Intent();

                    Host_list.clear();
                    Link_list.clear();
                    Path_list.clear();
                    is.IS_list_clear();
                    sr.Clear_Path();
                    System.out.println("System data structure cleared!");
                    System.out.println(" ");

                    break;


                }
            }


        }
    }

}
