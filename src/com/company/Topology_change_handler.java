package com.company;

    import java.io.*;
    import java.net.*;
    import java.util.ArrayList;
    import java.util.List;
    import com.jcraft.jsch.ChannelExec;
    import com.jcraft.jsch.JSch;
    import com.jcraft.jsch.Session;
    import org.json.simple.JSONArray;
    import org.json.simple.JSONObject;
    import java.util.Scanner;
    import com.jcraft.jsch.ChannelExec;
    import com.jcraft.jsch.JSch;
    import com.jcraft.jsch.Session;
    import sun.awt.image.ImageWatched;

public class Topology_change_handler {

        Resource_info resource_info = Resource_info.getInstance();
        List<Resource_info.Device_info> D_info = resource_info.getD_info();
        List<Resource_info.Host_info> Host_list = resource_info.getHost_list();
        List<Resource_info.Selection_Info> Selection_list = resource_info.getSelection_list();
        List<Resource_info.Link_info> Link_list = new ArrayList<Resource_info.Link_info>();
        List<String> Path_list = resource_info.getPath_info();
        String[] Src_Dst_Mac = resource_info.getSrc_Dst_Mac();

        List<Resource_info.Host_info> Temp_Host_list = new ArrayList<Resource_info.Host_info>();
        List<Resource_info.Link_info> Temp_Link_list = new ArrayList<Resource_info.Link_info>();

        Status_Report sr = new Status_Report();

        public Boolean Topology_change_detector(List<Resource_info.Link_info> Link_list) throws Exception{
            int i, j;
            Boolean flag = true;
            Boolean checksum_flag = false;

            sr.get_Link_info(Temp_Link_list);

            int[] link_checksum = new int[Temp_Link_list.size()];

            if(Temp_Link_list.size() != Link_list.size()){
                return false;
            }

            for(i=0; i<Temp_Link_list.size(); i++){
                for(j=0; j<Link_list.size(); j++){
                    if(Temp_Link_list.get(i).dst.toString().equals(Link_list.get(j).dst.toString()) && Temp_Link_list.get(i).src.toString().equals(Link_list.get(j).src.toString())){
                        checksum_flag = true;
                    }
                }
                if(checksum_flag == true){
                    link_checksum[i] = 0;
                }else{
                    link_checksum[i] = 1;
                }
            }


            if(flag == true){
                for(i=0; i<link_checksum.length; i++){
                    if(link_checksum[i] == 1){
                        flag =false;
                        break;
                    }
                }
            }
            /*if(Temp_Host_list.equals(Host_list)){
                if(Temp_Link_list.equals(Link_list)){
                    System.out.println("");
                    System.out.println(" ************* Topology is not Changed ************* ");
                    System.out.println("");

                    return true;
                }
                else{
                    System.out.println("");
                    System.out.println(" ************* Topology is Changed ************* ");
                    System.out.println("");

                    return false;
                }
            }
            else{
                System.out.println("");
                System.out.println(" ************* Topology is Changed ************* ");
                System.out.println("");

                return false;
            }*/


            return flag;
        }
        public void TCP_list_clear(){
            Temp_Link_list.clear();

        }
}
