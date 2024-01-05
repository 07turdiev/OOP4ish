public class PC extends Computers{
    public String manitor;
    public PC(String model, String marka, double narx, String operatsionTizim, String vidioKartasi, String manitor) {
        this.setMarka(marka);
        this.setModel(model);
        this.setNarx(narx);
        this.setOperatsionTizim(operatsionTizim);
        this.setVidioKartasi(vidioKartasi);
        this.manitor = manitor;
    }

    public void print(){
        System.out.println("PC class: ");
        System.out.println("Modeli: " + getModel());
        System.out.println("Markasi: " + getMarka());
        System.out.println("Narxi: " + getNarx());
        System.out.println("Operatsiyon tizimi: " + getOperatsionTizim());
        System.out.println("Vidiyo kartasi: " + getVidioKartasi());
        System.out.println("Manitor modeli: " + manitor);
    }
}