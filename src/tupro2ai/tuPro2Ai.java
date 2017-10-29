/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupro2ai;
import tupro2ai.hoaxValidation;
import java.util.Arrays;
/**
 *
 * @author Gin
 */
public class tuPro2Ai {
    public static void main(String[] args) {
       hoaxValidation news = new hoaxValidation();
       Data[] dt = new Data[30];
       dt[0] = new Data("B01",97,74,"no");
       dt[1] = new Data("B02",36,85,"no");
       dt[2] = new Data("B03",63,43,"no");
       dt[3] = new Data("B04",82,90,"no");
       dt[4] = new Data("B05",71,25,"no");
       dt[5] = new Data("B06",79,81,"no");
       dt[6] = new Data("B07",55,62,"no");
       dt[7] = new Data("B08",57,45,"no");
       dt[8] = new Data("B09",40,65,"no");
       dt[9] = new Data("B10",57,45,"no");
       dt[10] = new Data("B11",77,70,"no");
       dt[11] = new Data("B12",68,75,"no");
       dt[12] = new Data("B13",60,70,"no");
       dt[13] = new Data("B14",82,90,"no");
       dt[14] = new Data("B15",40,85,"no");
       dt[15] = new Data("B16",80,68,"no");
       dt[16] = new Data("B17",60,72,"no");
       dt[17] = new Data("B18",50,95,"no");
       dt[18] = new Data("B19",100,18,"no");
       dt[19] = new Data("B20",11,99,"no");
       dt[20] = new Data("B21",58,63,"no");
       dt[21] = new Data("B22",68,70,"no");
       dt[22] = new Data("B23",64,66,"no");
       dt[23] = new Data("B24",57,77,"no");
       dt[24] = new Data("B25",77,55,"no");
       dt[25] = new Data("B26",98,64,"no");
       dt[26] = new Data("B27",91,59,"no");
       dt[27] = new Data("B28",50,95,"no");
       dt[28] = new Data("B29",95,55,"no");
       dt[29] = new Data("B30",27,79,"no");
       
        
       
       int emo,pro;
       emo = 64;
       pro = 72;
       String hoax ="Ulol";
       for (int l=0;l<dt.length;l++){
       String proS= "F";
       String emoS= "F";
       if ( dt[l].getEmosi()>= 67){
           emoS = "h";}
       if (dt[l].getEmosi() < 66){
           emoS = "m";}
       if (dt[l].getEmosi() < 33){
           emoS = "l";}
       
       if (dt[l].getProvokasi()>= 75){
           proS = "vh";}
       if (dt[l].getProvokasi() <75){
           proS = "h";}
       if (dt[l].getProvokasi() <50){
           proS = "m";}
       if (dt[l].getProvokasi() <25){
           proS = "l";}
       
       if ("h".equals(emoS)){
            if (("vh".equals(proS)) || ("h".equals(proS))){
                hoax = "Hoax";}
            else if ("m".equals(proS) || ("l".equals(proS))){
                hoax = "Bukan Hoax";}}
        
        else if ("m".equals(emoS)){
            if ("vh".equals(proS)){
                hoax = "Hoax";}
            else if ("h".equals(proS) || ("m".equals(proS)) || ("l".equals(proS))){
                hoax = "Bukan Hoax";}}
        
        else if ("l".equals(emoS)){
            if ("vh".equals(proS)){
                hoax = "Hoax";}
            else if ("h".equals(proS) || ("m".equals(proS)) || ("l".equals(proS))){
                hoax = "Bukan Hoax";}
        }
       dt[l].setHoax(hoax);
           System.out.println(dt[l].getBerita()+"  "+proS+"   "+emoS);
       }
       
       
       
        
       
        for (int i=0;i<dt.length;i++){
        System.out.println(dt[i].getBerita()+"  "+dt[i].getEmosi()+"  "+dt[i].getProvokasi()+"  "+dt[i].isHoax());
        }
}}