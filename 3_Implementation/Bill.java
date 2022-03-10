import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Bill extends Product {
    public void lineadder() {
        for (int x = 0; x < 60; x++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    String username;
    String usercontact;
    double totalprice = 0;

    void displayBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        username = sc.nextLine();
        System.out.println("Your Phone Number");
        usercontact = sc.next();

        System.out.println("\n\nDear " + username + ",");
        System.out.println(usercontact);
        lineadder();
        for (int i = 0; i < 20; i++)
            System.out.print(" ");
        System.out.println("INVOICE");
        System.out.println(" ");
        lineadder();
        String S = "ID";
        System.out.print(S);
        for (int k = S.length(); k < 10; k++) {
            if (k == 5)
                System.out.print("|");
            System.out.print(" ");
        }
        S = "NAME";
        System.out.print(S);
        for (int k = S.length(); k < 10; k++) {
            if (k == 5)
                System.out.print("|");
            System.out.print(" ");
        }
        S = "MRP";
        System.out.print(S);
        for (int k = S.length(); k < 10; k++) {
            if (k == 5)
                System.out.print("|");
                System.out.print(" ");
            
        }
        S = "DISCOUNT";
        System.out.print(S);
        for (int k = S.length(); k < 20; k++) {
            if (k == 10)
                System.out.print("|");
            System.out.print(" ");
        }
        S = "COST";
        System.out.print(S);
        for (int k = S.length(); k < 10; k++) {
            if (k == 5)
                System.out.print("|");
            System.out.print(" ");
        }
        System.out.println("");
        lineadder();

        for (int counter = 0; counter < bill.size(); counter++) {

            double price = 0;
            int i = 0;
            String temp = bill.get(counter);
            temp.trim();
            temp = temp + " ";

            String pno = temp.substring(i, temp.indexOf(" "));
            System.out.println(pno);
            for (int k = temp.substring(i, temp.indexOf(" ")).length(); k < 30; k++) {
                if (k == 10)
                    System.out.print("|");
                System.out.print(" ");
            }

            temp = temp.substring(temp.indexOf(" ") + 1);
            // System.out.println("Brand: "+temp.substring(i,temp.indexOf(" ")));
            temp = temp.substring(temp.indexOf(" ") + 1);
            System.out.println(temp.substring(i, temp.indexOf(" ")));
            for (int k = temp.substring(i, temp.indexOf(" ")).length(); k < 20; k++) {
                if (k == 10)
                    System.out.print("|");
                System.out.print(" ");
            }

            temp = temp.substring(temp.indexOf(" ") + 1);
            price = Double.parseDouble(temp.substring(i, temp.indexOf(" ")));
            System.out.print(temp.substring(i, temp.indexOf(" ")));
            for (int k = temp.substring(i, temp.indexOf(" ")).length(); k < 20; k++) {
                if (k == 10)
                    System.out.print("|");
                System.out.print(" ");
            }

            temp = temp.substring(temp.indexOf(" ") + 1);
            if(price<=1000)
            {price = price - (0.1 * Double.parseDouble(temp.substring(i, temp.indexOf(" "))));}
            else
            
            {price = price - (0.3 * Double.parseDouble(temp.substring(i, temp.indexOf(" "))));}
          
            System.out.print(temp.substring(i, temp.indexOf(" ")));
            for (int k = temp.substring(i, temp.indexOf(" ")).length(); k < 20; k++) {
                if (k == 10)
                    System.out.print("|");
                System.out.print(" ");
            }

            System.out.print(price);
            for (int k = Double.toString(price).length(); k < 20; k++) {
                if (k == 10)
                    System.out.print("|");
                System.out.print(" ");
            }
            totalprice += price;
            System.out.print();
        }
        lineadder();
        System.out.println();
        System.out.println("Total Cost: " + totalprice);

        System.out.println("Added  %GST");
        totalprice = totalprice + (0.18 * totalprice);
        System.out.println("Final Price: " + totalprice);

        add();
        bill.clear();
    }

    void add() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        // System.out.println(formatter.format(date));

        try {
            File record = new File("record.txt");
            FileWriter fw = new FileWriter(record, true);
            String str = username + " " + usercontact + " " + Double.toString(totalprice) + " " + formatter.format(date)
                    + "\n";
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    boolean searchInStock(int n, String purpose) {
        return true;
    }
}