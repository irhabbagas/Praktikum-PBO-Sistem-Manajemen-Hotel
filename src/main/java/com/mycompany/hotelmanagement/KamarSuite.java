package com.mycompany.hotelmanagement;

public class KamarSuite extends Kamar {
    private boolean adaJacuzzi;

    public KamarSuite(String nomorKamar, double hargaPerMalam, boolean adaJacuzzi) {
        super(nomorKamar, hargaPerMalam);
        this.adaJacuzzi = adaJacuzzi;
    }

    public boolean isAdaJacuzzi() {
        return this.adaJacuzzi;
    }

    public void setAdaJacuzzi(boolean adaJacuzzi) {
        this.adaJacuzzi = adaJacuzzi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.print("[SUITE]   ");
        super.tampilkanInfo();
        System.out.printf(" | Jacuzzi: %s%n", (this.adaJacuzzi ? "Ada" : "Tidak"));
    }

    @Override
    public void cetakFasilitas() {
        System.out.println("-> Fasilitas Suite: Sarapan Gratis, Mini Bar, Akses Lounge, " + (adaJacuzzi ? "Jacuzzi Pribadi" : "Balkon Kota") + ".");
    }
}