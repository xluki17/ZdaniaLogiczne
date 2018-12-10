package com.company;

public class Main {

    public static void main(String[] args) {
        boolean[] bool = {true, false};

        System.out.println("Negacja: ");
        System.out.println("|"+" p\t    | !p\t|");
        for (boolean p : bool)
            System.out.println("|"+p + "\t|" + !p+"\t|");
        System.out.println();

        System.out.println("Koniunkcja: ");
        System.out.println("|"+" p\t\t q\t\tp & q");
        for (boolean p : bool)
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p & q));
        System.out.println();

        System.out.println("Alternatywa: ");
        System.out.println(" p\t\t q\t\tp | q");
        for (boolean p : bool)
            for (boolean q : bool)
                System.out.println(p + "\t" + q + "\t" + (p | q));
        System.out.println();

        System.out.println("Prawo wylaczonego srodka - p || !p");
        System.out.println(" p\t \t!p\t\tp || !p");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+(p || !p));
        System.out.println();

        System.out.println("prawo niesprzecznosci- !(p && !p)");
        System.out.println(" p\t \t!p\t\tp && !p\t!(p && !p)");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+(p && !p)+"\t"+!(p && !p));
        System.out.println();

        System.out.println("Prawo podwójnego przeczenia - !(!p) == p)");
        System.out.println(" p\t\t !p\t\t!(!p)\t!(!p) == p)");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+!(!p)+"\t"+(!(!p) == p));
        System.out.println();
              /*prawa deMorgana*/
        System.out.println("Zaprzeczenie koniunkcji jest równowazne alternatywie zaprzecze	");
                System.out.println("p\t\tq\t\tp&&q\t!(p&&q)\t!p\t\t!q\t\t!p||!q\t!(p&&q)<=>(!p||!q)");
        for(boolean p: bool)
            for(boolean q: bool) {
                System.out.print(p+"\t"+q+"\t"+(p&&q)+"\t"+!(p&&q));
                System.out.print("\t"+!p+"\t"+!q+"\t"+(!p||!q));
                System.out.println("\t"+(!(p&&q)==(!p||!q)));
            }
        System.out.println("\n");
        System.out.println("Zaprzeczenie alternatywy jest równowazne koniunkcji zaprzecze	");
                System.out.println("p\t\tq\t\tp||q\t!(p||q)\t!p\t\t!q\t\t!p&&!q\t!(p||q)<=>(!p&&!q)");
        for(boolean p: bool)
            for(boolean q: bool) {
                System.out.print(p+"\t"+q+"\t"+(p||q)+"\t"+!(p||q));
                System.out.print("\t"+!p+"\t"+!q+"\t"+(!p&&!q));
                System.out.println("\t"+(!(p||q)==(!p&&!q)));
            }
        System.out.println("\n");

        System.out.println("Implikacja - jezeli p, to q");
        System.out.println("p\t\tq\t\tp=>q");
        for(boolean p: bool)
            for(boolean q: bool)
                System.out.println(p+"\t"+q+"\t"+(Boolean.valueOf(p).compareTo(q) < 1));
        System.out.println();

        System.out.println("XOR ");
        System.out.println("p\t\tq\t\tp^q");
        for(boolean p: bool)
            for(boolean q: bool)
                System.out.println(p + "\t" + q + "\t" + (p ^ q));
        System.out.println();



    }
}
