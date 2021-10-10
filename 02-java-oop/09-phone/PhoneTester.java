public class PhoneTester {
    public static void main(String[] args) {
        IPhone iPhone12 = new IPhone("12", 99, "Verizon", "BUZZ BUZZ");
        Galaxy s11 = new Galaxy("S11", 66, "AT&T", "RING RING");

        System.out.println(iPhone12.Ring());
        System.out.println(iPhone12.unlock());
        System.out.println(s11.Ring());
        System.out.println(s11.unlock());

        iPhone12.displayInfo();
        s11.displayInfo();
    }
}