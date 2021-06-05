package UAP;

import java.util.Locale;

abstract class Tanaman implements Perawatan {
    private int masaHidup, lamaHidup, buah, berbuah;
    private double prosesBerbuah, perkembangan;

    public Tanaman(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
    }
    public int getMasaHidup() {
        return masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public int getBuah() {
        return buah;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public void berkembang(){
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan() * getBerbuah());
        if(getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
        setLamaHidup(getLamaHidup() + 1);
    }
    public String status(){
        return lamaHidup < masaHidup ? "Hidup" : "Mati";
    }

    @Override
    public String toString() {
        return  "Masa Hidup = " + masaHidup + " hari" +
                "\nUmur tanaman = " + lamaHidup + " hari" +
                "\nMenghasilkan = " + buah + " buah " + this.getClass().getSimpleName().toLowerCase()+
                "\nStatus = " + status() + "\n";
    }

}
