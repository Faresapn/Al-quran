package com.faresa.alquran.model.muslimsalat;

import com.google.gson.annotations.SerializedName;

public class Jadwal {
    private int id;

    @SerializedName("date_for")
    private String tanggal;

    @SerializedName("fajr")
    private String subuh;

    @SerializedName("dhuhr")
    private String dzuhur;

    @SerializedName("asr")
    private String ashar;

    @SerializedName("maghrib")
    private String maghrib;
    @SerializedName("imsak")
    private String imsak;



    @SerializedName("isha")
    private String isya;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getSubuh() {
        return subuh;
    }

    public void setSubuh(String subuh) {
        this.subuh = subuh;
    }

    public String getDzuhur() {
        return dzuhur;
    }

    public void setDzuhur(String dzuhur) {
        this.dzuhur = dzuhur;
    }

    public String getAshar() {
        return ashar;
    }

    public void setAshar(String ashar) {
        this.ashar = ashar;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsya() {
        return isya;
    }

    public void setIsya(String isya) {
        this.isya = isya;
    }

    public String getImsak() {
        return imsak;
    }

    public void setImsak(String imsak) {
        this.imsak = imsak;
    }
}
