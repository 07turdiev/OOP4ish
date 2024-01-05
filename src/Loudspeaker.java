public class Loudspeaker extends Sounds{
    public double kuchlanish;

    public Loudspeaker(String model, String marka, double narx, double kuchlanish, double ovozChastatasi) {
        this.kuchlanish = kuchlanish;
        this.setOvozChastatasi(ovozChastatasi);
        this.setMarka(marka);
        this.setModel(model);
        this.setNarx(narx);
    }

    public void print(){
        System.out.println("Loudspeaker class: ");
        System.out.println("Modeli: " + getModel());
        System.out.println("Markasi: " + getMarka());
        System.out.println("Narxi: " + getNarx() + "$");
        System.out.println("Ovoz chastatsi: " + getOvozChastatasi() + " Hz");
        System.out.println("Kuchlanish: " + kuchlanish + "V");
    }
}
