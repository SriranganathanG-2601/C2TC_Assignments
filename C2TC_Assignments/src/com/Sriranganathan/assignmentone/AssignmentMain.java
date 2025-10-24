package com.Sriranganathan.assignmentone;

import com.Sriranganathan.assignmentone.employees.*;
import com.Sriranganathan.assignmentone.utilities.*;

public class AssignmentMain {
    public static void main(String[] args) {
        manager m1 = new manager("Alice", 101, 80000, "IT", 5000);
        developer d1 = new developer("Bob", 102, 60000, "Java", "Banking System");

        employeeutilities util = new employeeutilities();

        System.out.println("---- Before Raise ----");
        util.printEmployeeInfo(m1);
        util.printEmployeeInfo(d1);

        System.out.println("\n---- After Raise ----");
        util.giveRaise(m1, 5000);
        util.giveRaise(d1, 3000);

        util.printEmployeeInfo(m1);
        util.printEmployeeInfo(d1);
    }
}
