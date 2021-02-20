package TCS;

import java.util.Objects;
import java.util.Scanner;

public class XP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill[] bills = new Bill[5];
        for (int i = 0; i < 5; i++) {
            int id = Integer.parseInt(scanner.next());
            scanner.nextLine();
            String name = scanner.nextLine();
            int unit = scanner.nextInt();
            bills[i] = new Bill(id, unit, name);
        }
        char cat = Character.toUpperCase(scanner.next().charAt(0));
        int count = findCountOfCategory(bills, cat);
        System.out.println(count > 0 ? count : "No bill in the given category");
        Bill res = getHighBillinCategory(bills, cat);

        System.out.println(res != null ? Objects.requireNonNull(res).getBillid() + "#" + Objects.requireNonNull(res).getCustName() + "#" + Objects.requireNonNull(res).getUnit()
                : "The given Category is not available");
    }

    private static int findCountOfCategory(Bill[] bills, char category) {
        char[] categories = new char[bills.length];
        for (int i = 0; i < bills.length; i++) {
            if (bills[i].getUnit() > 1000)
                categories[i] = 'A';
            else if (bills[i].getUnit() >= 500 && bills[i].getUnit() < 1000)
                categories[i] = 'B';
            else if (bills[i].getUnit() < 500)
                categories[i] = 'C';
        }
        int count = 0;
        for (char c : categories) {
            if (c == category)
                count++;
        }
        return count;
    }

    private static Bill getHighBillinCategory(Bill[] bills, char category) {
        Bill[] billsInCat = new Bill[bills.length];
        int j = 0;
        for (Bill bill : bills) {
            if (bill.getUnit() > 1000 && category == 'A') {
                billsInCat[j] = bill;
                j++;

            } else if (bill.getUnit() >= 500 && bill.getUnit() < 1000 && category == 'B') {
                billsInCat[j] = bill;
                j++;
            } else if (bill.getUnit() < 500 && category == 'C') {
                billsInCat[j] = bill;
                j++;
            }
        }
        try {
            int maxUnit = -1;
            Bill highBill = null;
            for (Bill bill : billsInCat) {
                if (maxUnit < bill.getUnit())
                    highBill = bill;
                return highBill;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


class Bill {
    private final int billid;
    private final int unit;
    private final String custName;

    public Bill(int billid, int unit, String custName) {
        this.billid = billid;
        this.unit = unit;
        this.custName = custName;
    }

    public int getBillid() {
        return billid;
    }

    public int getUnit() {
        return unit;
    }

    public String getCustName() {
        return custName;
    }
}
/*

1
Ramesh
800
2
Samuel
1500
3
Tomar
200
4
Rohith
1000
5
Mahesh
500
b

*/