public class Main {
    public static void main(String[] args) {

        Lor lor = new Lor(21, "Elbek", "Lor", "quloq va bosh qismni davolash");
        lor.print();
        System.out.println();

        Xirurg xirurg = new Xirurg(18, "Quvonch", "Xirurg", "Jarroxlik amaliyotlari");
        xirurg.print();
        System.out.println();

        Laptop laptop = new Laptop("HP", "15 dy2795", 100, "Linux", "Intel iRIS", 6.5);
        laptop.print();
        System.out.println();

        PC pc = new PC("Asus", "TUF GAMING", 35000, "Windows", "NVIDIA", "ROG strix");
        pc.print();
        System.out.println();

        Subwoofer subwoofer = new Subwoofer("SVS", "SB 300", 1200, 15.6, 270);
        subwoofer.print();
        System.out.println();

        Loudspeaker loudspeaker = new Loudspeaker("Bosch", "LBC3492", 200, 100, 380);
        loudspeaker.print();
    }
}