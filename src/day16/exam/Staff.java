package day16.exam;

public class Staff extends Worker {

    public static final String HEADER = "ID,Nama,GajiPokok,JmlAbsensi,JmlIzin,TanpaKabar,GajiTotal";
    private Integer gajiTotal;

    @Override
    public void hitungGajiPokok() {
        setGajiPokok(getGajiPokok() / 22 * getAbsensi());
    }

    public Integer hitungTunjanganMakan() {
        Integer tunjanganMakan = 220000;
        if (getJumlahCuti() > 1) {
            Integer potongan = (tunjanganMakan / 22) * getJumlahCuti();
            tunjanganMakan -= potongan;
        }
        return tunjanganMakan;
    }

    public Integer hitungTunjanganTransort() {
        Integer tunjanganTransport = 440000;
        if (getJumlahCuti() > 1) {
            Integer potongan = (tunjanganTransport / 22) * getJumlahCuti();
            tunjanganTransport -= potongan;
        }
        return tunjanganTransport;
    }

    public Integer hitungGajiTotal() {
        gajiTotal = getGajiPokok() + hitungTunjanganMakan() + hitungTunjanganTransort();
        return gajiTotal;
    }

    public Integer getGajiTotal() {
        return gajiTotal;
    }

    public void setGajiTotal(Integer gajiTotal) {
        this.gajiTotal = gajiTotal;
    }
    
    @Override
    public String toString() {
        return getId() + "," + getNama() + "," + getGajiPokok() + "," + getAbsensi() + "," + getJumlahCuti() + "," + getTanpaKabar() + "," + getGajiTotal();
    }

}
