import javax.crypto.spec.IvParameterSpec;

public class A9RetailChecker {
    public static void main(String[] args) {
        // Set up some items
        Electronic e1 = new Electronic("64102874", "Q70C QLED UHD Smart TV", "Samsumg", 1199.99, "Aisle 34, Bay 2", "TV",
                "65", "Black", 5, 12, "887276737508");
        Electronic e2 = new Electronic("64103492", "QN85C Neo QLED Smart TV", "Samsumg", 3799.99, "Aisle 34, Bay 10", "TV",
                "85", "Black", 10, 12, "887276741840");
        HardItem hi1 = new HardItem("84821298", "Spidey and his Amazing Friends Spider Crawler", "Hasbro", 42.99,
                "Aisle 12, Bay 4", "Toy", "Plastic", 4, "5010994133634");
        HardItem hi2 = new HardItem("52062134", "2 Slice Toaster", "Hamilton Beach", 32.99, "Aisle 22, Bay 8",
                "Kitchen Appliance", "Stainless Steel", 10, "040094227143");
        SoftItem si1 = new SoftItem("CZ2857", "Tempo Shorts", "Nike", 24.99, "Nike Women's Pad, Display Wall", "Apparel", "Women");
        SoftItem si2 = new SoftItem("GNM859625", "Gel-Nimbus 25", "ASICS", 24.99, "Footwear Wall Panel B", "Footwear", "Mens");
        si1.addItem(new Inventory("S", "Black/Pink", 5, "856325695850"));
        si1.addItem(new Inventory("M", "Black/Pink", 10, "856325695862"));
        si1.addItem(new Inventory("L", "Black/Pink", 8, "856325695872"));
        si1.addItem(new Inventory("XL", "Black/Pink", 2, "856325695824"));
        si1.addItem(new Inventory("M", "Aqua/Orange", 6, "856325695325"));
        si1.addItem(new Inventory("L", "Aqua/Orange", 3, "856325696586"));
        si2.addItem(new Inventory("9", "Ocean Orange",3,"088652396452"));
        si2.addItem(new Inventory("9.5", "Ocean Orange",3,"088652395342"));
        si2.addItem(new Inventory("10", "Ocean Orange",3,"088652395846"));
        si2.addItem(new Inventory("10.5", "Ocean Orange",3,"088652395452"));

        // initial print of items.
        System.out.println("***** Assignment 9 Checker *****\n");
        System.out.println("** Initial Item Printout **");
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");
        System.out.println(hi1 + "\n");
        System.out.println(hi2 + "\n");
        System.out.println(si1);
        System.out.println(si2);

        if (si2.addInventory("088652395452", 25)) { // shoes size 10.5
            System.out.println("Added Shoe Inventory.");
        }

        if (si1.addInventory("856325695872", -40)) { // shorts size L - black/pink
            System.out.println("Added negative inventory, you shouldn't see this.");
        }

        if (si1.addInventory("856325695871", 3)) { // no such item exists, checks your UPC check
            System.out.println("No such shoe but adding inventory, you shouldn't see this.");
        }

        // stock of XL black/pink is 2, try to sell 3
        if (si1.sellItem("856325695824")) {
            System.out.println("XL Black/Pink shorts sold");
        }
        if (si1.sellItem("856325695824")) {
            System.out.println("XL Black/Pink shorts sold");
        }
        if (si1.sellItem("856325695824")) { // this shouldn't print, only the above 2
            System.out.println("XL Black/Pink shorts sold");
        }

        System.out.println("\n** Print of Soft Items for Inventory Check **");
        System.out.println(si1);
        System.out.println(si2);

        System.out.println("\n** Check UPC method **");
        System.out.println(e1.getUPC("", ""));
        System.out.println(e2.getUPC("", ""));
        System.out.println(hi1.getUPC("",""));
        System.out.println(hi2.getUPC("",""));
        System.out.println(si1.getUPC("L", "Aqua/Orange"));
        System.out.println(si1.getUPC("M", "Black/Pink"));
        System.out.println(si2.getUPC("9", "Ocean Orange"));
        System.out.println(si2.getUPC("10", "Ocean Orange"));


        if (si1.equals(si2)) {
            System.out.println("\nShorts and Shoes are the same!! This shouldn't printout");
        }
        else {
            System.out.println("\nThe soft items are different, equals method works.");
        }

    }

}
