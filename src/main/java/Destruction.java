public class Destruction {
    public static void main(String[] args) {
        Chair chair = new Chair(new Plywood("plywood"), "chair");
        chair.printStatus();

        System.out.println("Thwacking the chair...");
        chair.hit();
        chair.printStatus();

        System.out.println("Setting fire to the chair...");
        chair.setFire();
        chair.printStatus();

        System.out.println();

        Table table = new Table(new Glass("glass"), "table");
        table.printStatus();

        System.out.println("Thwacking the table...");
        table.hit();
        table.printStatus();

        System.out.println("Setting fire to the table...");
        table.setFire();
        table.printStatus();





//        Furniture chair = new Furniture("chair","plywood");
//        chair.printStatus();
//
//        System.out.println("Thwacking the chair...");
//        chair.hit();
//        chair.printStatus();
//
//        System.out.println("Setting fire to the chair...");
//        chair.setFire();
//        chair.printStatus();
//
//        System.out.println();
//
//        Furniture table = new Furniture("table", "glass");
//        table.printStatus();
//
//        System.out.println("Thwacking the table...");
//        table.hit();
//        table.printStatus();
//
//        System.out.println("Setting fire to the table...");
//        table.setFire();
//        table.printStatus();
    }
}
