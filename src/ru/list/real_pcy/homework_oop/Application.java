package ru.list.real_pcy.homework_oop;

public class Application {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 23);
        Person bob = new Person("Bob", 34);

        alex.setCompanyName("Google");
        bob.setCompanyName("Meta");
        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());
        System.out.println("We created Bob and Alex, set company names (without static fields)");
        System.out.println();

        Company leon = new Company("Leon");
        leon.printAllWorkers();
        System.out.println("We created a company Leon, print non workers");
        System.out.println();

        leon.addNewWorker(alex, 78000);
        leon.addNewWorker(bob, 78000);
        leon.printAllWorkers();
        System.out.println("Add Alex and Bob, print all");
        System.out.println();

        leon.deleteWorker(bob);
        leon.deleteWorker(bob);
        leon.printAllWorkers();
        System.out.println("Del Bob twice, print all");
        System.out.println();

        alex.setSalary(12000);
        System.out.println("Alex salary is validated, Bob salary is non set cause he's fired");
        Company wee = new Company("Wee");
        wee.addNewWorker(alex, 74674);
        wee.addNewWorker(alex, 8576);
        wee.addNewWorker(bob, 67000);
        wee.deleteWorker(alex);
        wee.deleteWorker(alex);
    }
}