package ru.list.real_pcy.homework_oop;

public class Manager extends AbstractWorker {

    public Manager(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public void salaryValidate(double salary) throws WrongSalaryException {
        if (isAgeGreaterThenSalary(salary)) {
            throw new WrongSalaryException("Age is greater then salary");
        }
        if (isSalaryNotSet()) {
            throw new WrongSalaryException("Salary isn't set!");
        }
        System.out.println(getName() + " has a salary that equals " + getSalary());
    }
}
