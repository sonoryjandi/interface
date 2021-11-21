package ru.list.real_pcy.homework_oop;

import java.util.Arrays;

public class Company {

    private Person[] workers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.workers = new Person[0];
    }

    public void addNewWorker(Person newWorker) {
        workers = Arrays.copyOf(workers, workers.length + 1);
        workers[workers.length - 1] = newWorker;
        newWorker.setCompanyName(this.name);
    }

    public void deleteWorker(Person firedWorker) {
        try {
            boolean isPersonBelongsToStaff = Arrays.asList(workers).contains(firedWorker);
            if (!isPersonBelongsToStaff) {
                throw new isPersonBelongsToWorkersException("This person doesn't belong to staff!");
            }
            Person[] workersAfterDeleting = new Person[workers.length - 1];
            int workerAfterDeletingID = 0;
            for (int workerID = 0; workerID < workers.length; workerID++) {
                if (workers[workerID] == firedWorker) {
                    continue;
                }
                workersAfterDeleting[workerAfterDeletingID] = workers[workerID];
                workerAfterDeletingID++;
            }
            workers = workersAfterDeleting;
            firedWorker.setCompanyName(null);
            firedWorker.setSalary(0);
        } catch (isPersonBelongsToWorkersException exception){
            System.out.println(exception);
        }
    }

    public void printAllWorkers() {
        for (int i = 0; i < workers.length; i++) {
            Person s = workers[i];
            System.out.println(s.getName());
        }
    }

    //region getter-setter
    public Person[] getWorkers() {
        return workers;
    }

    public void setWorkers(Person[] workers) {
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // endregion
}