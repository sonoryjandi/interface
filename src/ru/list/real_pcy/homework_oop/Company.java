package ru.list.real_pcy.homework_oop;

import java.util.Arrays;

public class Company implements IdealCompany {

    private Worker[] workers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.workers = new Person[0];
    }

    @Override
    public void addNewWorker(Worker newWorker, double salary) {
        try {
            if (isPersonBelongsToStaff(newWorker)) {
                throw new isPersonBelongsToWorkersException("This person is already in staff!");
            }
            Worker[] newWorkersArray = Arrays.copyOf(workers, workers.length + 1);
            newWorkersArray[newWorkersArray.length - 1] = newWorker;
            newWorker.setCompanyName(this.getName());
            newWorker.setSalary(salary);
            newWorker.salaryValidate(salary);
            workers = newWorkersArray;
        } catch (isPersonBelongsToWorkersException | WrongSalaryException exception) {
            System.out.println(exception);
        }
    }

    @Override
    public void deleteWorker(Worker firedWorker) {
        try {
            if (!isPersonBelongsToStaff(firedWorker)) {
                throw new isPersonBelongsToWorkersException("This person doesn't belong to staff!");
            }
            Worker[] workersAfterDeleting = new Worker[workers.length - 1];
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
        } catch (isPersonBelongsToWorkersException exception) {
            System.out.println(exception);
        }
    }

    private boolean isPersonBelongsToStaff(Worker person) {
        return Arrays.asList(workers).contains(person);
    }

    @Override
    public void printAllWorkers() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getName());
        }
    }

    //region getter-setter
    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
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