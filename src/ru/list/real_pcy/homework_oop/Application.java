package ru.list.real_pcy.homework_oop;

public class Application {
    public static void main(String[] args) {
        Worker sid = new Manager("Sid", 24);
        Worker den = new Person("Den", 23);
        Person anny = new Person("Anny", 18);
        Company meta = new Company("Meta");

//        meta.addNewWorker(anny, 34000);
//        meta.addNewWorker(anny, 56784);
        meta.addNewWorker(sid, 23000);
//        meta.addNewWorker(den, 89000);
    }
}