/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupro2ai;
import tupro2ai.tuPro2Ai;
/**
 *
 * @author Gin
 */
public class hoaxValidation {
    
    public String hoaxStatus(String emoS,String proS,String hoax){
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
        return hoax;
        
    }}       
