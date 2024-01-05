public class Lor extends Doctor {
    String mutaxasisligi;
    String vazifasi;


    public Lor(int yoshi, String ismi, String mutaxasisligi, String vazifasi) {
        this.mutaxasisligi = mutaxasisligi;
        this.setIsmi(ismi);
        this.setYoshi(yoshi);
        this.vazifasi = vazifasi;

    }

    public void print(){
        System.out.println("Lor class:");
        System.out.println("Mutaxasisligi: " + mutaxasisligi);
        System.out.println("Yoshi: " + getYoshi());
        System.out.println("Imsi: " + getIsmi());
        System.out.println("Vazifasi: " + vazifasi);
    }
}
