import java.util.Arrays;

public class Company {

    private Person[] workers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.workers = new Person[0];
    }

    public void addNewWorker(Person newWorker, double salary) {
        try {
            if (isPersonBelongsToStaff(newWorker)) {
                throw new isPersonBelongsToWorkersException("This person is already in staff!");
            }
            Person[] newWorkersArray = Arrays.copyOf(workers, workers.length + 1);
            newWorkersArray [newWorkersArray.length - 1] = newWorker;
            workers = newWorkersArray;
            newWorker.setCompanyName(this.getName());
            newWorker.setSalary(salary);
            newWorker.salaryValidate(salary);
        } catch (isPersonBelongsToWorkersException | WrongSalaryException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void deleteWorker(Person firedWorker) {
        try {
            if (!isPersonBelongsToStaff(firedWorker)) {
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
            System.out.println("Worker " + firedWorker.getName() + " is fired.");
        } catch (isPersonBelongsToWorkersException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private boolean isPersonBelongsToStaff(Person person) {
        return Arrays.asList(workers).contains(person);
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