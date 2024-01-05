public class Laptop extends Computers{
    public double batareyaMuddati;

    public Laptop(String model, String marka, double narx, String operatsionTizim, String vidioKartasi, double batareyaMuddati) {
        this.batareyaMuddati = batareyaMuddati;
        this.setMarka(marka);
        this.setModel(model);
        this.setNarx(narx);
        this.setOperatsionTizim(operatsionTizim);
        this.setVidioKartasi(vidioKartasi);
    }

    public void print(){
        System.out.println("Laptop class: ");
        System.out.println("Modeli: " + getModel());
        System.out.println("Markasi: " + getMarka());
        System.out.println("Narxi: " + getNarx());
        System.out.println("Operatsiyon tizimi: " + getOperatsionTizim());
        System.out.println("Vidiyo kartasi: " + getVidioKartasi());
        System.out.println("Baterye muddati: " + batareyaMuddati + " soat");
    }
}
