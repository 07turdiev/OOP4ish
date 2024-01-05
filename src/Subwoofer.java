public class Subwoofer extends Sounds{
    public double bassBalandiligi;

    public Subwoofer(String model, String marka, double narx, double bassBalandiligi, double ovozChastatasi) {
        this.bassBalandiligi = bassBalandiligi;
        this.setOvozChastatasi(ovozChastatasi);
        this.setMarka(marka);
        this.setModel(model);
        this.setNarx(narx);
    }

    public void print(){
        System.out.println("Subwoofer class: ");
        System.out.println("Modeli: " + getModel());
        System.out.println("Markasi: " + getMarka());
        System.out.println("Narxi: " + getNarx() + "$");
        System.out.println("Ovoz chastatsi: " + getOvozChastatasi() + " Hz");
        System.out.println("Bass balandiligi: " + bassBalandiligi);
    }
}
