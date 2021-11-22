package ru.list.real_pcy.homework_oop;

public interface IdealCompany {

    /**
     * Метод добавляет нового работника.
     */
    void addNewWorker(Worker newWorker, double salary);

    /**
     * Метод удаляет существующего работника.
     */
    void deleteWorker(Worker firedWorker);

    /**
     * Метод печатает всех рабоников.
     */
    void printAllWorkers();
}