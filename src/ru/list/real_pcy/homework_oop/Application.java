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

        leon.addNewWorker(alex);
        leon.addNewWorker(bob);
        leon.printAllWorkers();
        System.out.println("Add Alex and Bob, print all");
        System.out.println();

        leon.deleteWorker(bob);
        leon.deleteWorker(bob);
        leon.printAllWorkers();
        System.out.println("Del Bob twice, print all");
        System.out.println();

        alex.setSalary(12000);
        alex.salaryValidate();
        bob.salaryValidate();
        System.out.println("Alex salary is validated, Bob salary is non set cause he's fired");
    }
}