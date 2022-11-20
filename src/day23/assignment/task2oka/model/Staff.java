package day23.assignment.task2oka.model;

public class Staff extends Worker {

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

    public Integer hitungTunjanganTransport() {
        Integer tunjanganTransport = 440000;
        if (getJumlahCuti() > 1) {
            Integer potongan = (tunjanganTransport / 22) * getJumlahCuti();
            tunjanganTransport -= potongan;
        }
        return tunjanganTransport;
    }

    public Integer hitungGajiTotal() {
        gajiTotal = getGajiPokok() + hitungTunjanganMakan() + hitungTunjanganTransport();
        return gajiTotal;
    }

    public Integer getGajiTotal() {
        return gajiTotal;
    }

    public void setGajiTotal(Integer gajiTotal) {
        this.gajiTotal = gajiTotal;
    }
}
