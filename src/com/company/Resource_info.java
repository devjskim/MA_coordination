package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class Resource_info {
    private static Resource_info resource_info = null;
    List<Device_info> D_info = new ArrayList<Device_info>();
    List<Device_port_info> DP_info = new ArrayList<Device_port_info>();
    List<Cont_dp_info> Cont_DP_info = new ArrayList<Cont_dp_info>();
    List<Resource_info.Host_info> Host_list = new ArrayList<Resource_info.Host_info>();
    List<Resource_info.Selection_Info> Selection_list = new ArrayList<Selection_Info>();
    List<Resource_info.Link_info> Link_list = new ArrayList<Resource_info.Link_info>();
    List<String> Path_list = new ArrayList<String>();
    String[] Src_Dst_Mac = new String[2];
    String Path = null;
    /*Resource_info.Device_info Sel_info = new Resource_info.Device_info();
    Resource_info.Device_info Can_info = new Resource_info.Device_info();
    Resource_info.Selection_Info Selection_info = new Resource_info.Selection_Info();*/


    public static class Device_info {
        public String Dev_ID = "NONE";
        public String Host_ID = "NONE";

        public String Wired_IP = "NONE";
        public String Wired_ID = "NONE";
        public char Wired_conn;
        public String Wired_MAC = "NONE";
        public String Wired_loc = "NONE";

        public String Wifi_IP = "NONE";
        public String Wifi_ID = "NONE";
        public char Wifi_conn;
        public String Wifi_loc = "NONE";
        public String Wifi_MAC = "NONE";

        public String LTE_IP = "NONE";
        public String LTE_ID = "NONE";
        public char LTE_conn;
        public String LTE_loc = "NONE";
        public String LTE_MAC = "NONE";
    }

    public static class Cont_dp_info{
        public String Dev_ID = "NONE";
        public char enabled;
        public String Interface_name = "NONE";
        public String MAC = "NONE";
        public String port = "NONE";
    }

    public static class Device_port_info {
        public String Dev_ID = "NONE";
        public String Host_ID = "NONE";

        public char Wired_enabled;
        public String Wired_MAC = "NONE";
        public String Wired_port = "NONE";
        public String Wired_interface_name = "NONE";


        public char Wifi_enabled;
        public String Wifi_MAC = "NONE";
        public String Wifi_port = "NONE";
        public String Wifi_interface_name = "NONE";

        public char LTE_enabled;
        public String LTE_MAC = "NONE";
        public String LTE_port = "NONE";
        public String LTE_interface_name = "NONE";
    }


    public static class Sel_interface_Info{
        public String ID="NONE";
        public String Int="NONE";
        /*public String sel_ID="NONE";
        public String IP="NONE";
        public String MAC="NONE";
        public String loc="NONE";
        public char conn='X';*/
        public String MAC="NONE";
        public String port="NONE";
        public char enabled='X';

    }
    public static class Can_interface_Info{
        public String ID="NONE";

        public String Int1="NONE";
        public String MAC1="NONE";
        public String port1="NONE";
        public char enabled1='X';

        public String Int2="NONE";
        public String MAC2="NONE";
        public String port2="NONE";
        public char enabled2='X';
    }

    public static class Selection_Info{
        public String Host_ID;
        Sel_interface_Info Sel_Info = new Sel_interface_Info();
        Can_interface_Info Can_Info = new Can_interface_Info();
    }

    public static class Host_info{
        public String ID  = "NONE";
        public String MAC  = "NONE";
        public String IP = "NONE";
        public String location = "NONE";
    }
    public static class Link_info{
        public String src = "NONE";
        public String dst = "NONE";
        public String type = "NONE";
        public String state = "NONE";
    }
    public static class Path_info{
        public String type = "NONE";
        public String ID = "NONE";
    }


    public List<Host_info> getHost_list() {
        return Host_list;
    }

    public List<Device_port_info> getDP_info() { return DP_info; }

    public List<Cont_dp_info> getCont_DP_info() {return Cont_DP_info; }

    public List<Device_info> getD_info() {
        return D_info;
    }

    public List<Link_info> getLink_info() {
        return Link_list;
    }

    public List<String> getPath_info() {
        return Path_list;
    }
    public String getPath(){
        return Path;
    }
    public String[] getSrc_Dst_Mac() {return Src_Dst_Mac;}

    public List<Selection_Info> getSelection_list(){
        return Selection_list;
    }




    /*public Resource_info.Selection_Info getSelection_info(){
        return Selection_info;
    }
    public Resource_info.Device_info getSel_info(){
        return Sel_info;
    }

    public Resource_info.Device_info getCan_info() {
        return Can_info;
    }*/

    private Resource_info(){
        System.out.println("Singleton Design pattern started");
    }
    public static Resource_info getInstance(){

        if (resource_info == null){
            resource_info = new Resource_info();
            System.out.println("New Singleton Instance !");
        }
        System.out.println("Existing SingleTon Instance !");

        return resource_info;
    }
}




