/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package strategy.exercise1;

//DON'T CHANGE
public class ReceiverOfRevenue {
    public static void main(String... args) {
        var heinz = new TaxPayer(TaxPayer.EMPLOYEE, 50000);
        var maxsol = new TaxPayer(TaxPayer.COMPANY, 100000);
        var family = new TaxPayer(TaxPayer.TRUST, 30000);
        System.out.println(heinz.extortCash());
        System.out.println(maxsol.extortCash());
        System.out.println(family.extortCash());
    }
}
