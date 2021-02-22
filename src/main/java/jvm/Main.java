package jvm;

import jvm.varstatic.month;
import jvm.varstatic.weekdate;
import static jvm.varstatic.month.month01;
import static jvm.varstatic.weekdate.weekvar01;
import static jvm.varstatic.weekdate.weekvar04;

public class Main {
    public static void main(String[] args) {
        System.out.println(weekdate.weekvar01);
//        System.out.println(weekvar02);
        System.out.println(month.month01);
        weekvar04 = "fri";
    }
}
