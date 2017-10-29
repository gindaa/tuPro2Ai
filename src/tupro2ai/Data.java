package tupro2ai;

import java.sql.Array;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gin
 */
public class Data {
    Data[] dt = new Data[29];
    private String berita;
    private int emosi;
    private int provokasi;
    private String hoax;

    public Data(String berita, int emosi, int provokasi, String hoax) {
        this.berita = berita;
        this.emosi = emosi;
        this.provokasi = provokasi;
        this.hoax = hoax;
    }

   
    
    public void isiData(String berita, int emosi, int provokasi, String hoax) {
        this.berita = berita;
        this.emosi = emosi;
        this.provokasi = provokasi;
        this.hoax = hoax;
    }
    public String getBerita() {
        return berita;
    }

    public int getEmosi() {
        return emosi;
    }

    public int getProvokasi() {
        return provokasi;
    }

    public String isHoax() {
        return hoax;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }

    public void setEmosi(int emosi) {
        this.emosi = emosi;
    }

    public void setProvokasi(int provokasi) {
        this.provokasi = provokasi;
    }

    public void setHoax(String hoax) {
        this.hoax = hoax;
    }

    
    
}
