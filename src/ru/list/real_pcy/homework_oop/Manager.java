package ru.list.real_pcy.homework_oop;

public class Manager implements Worker {

    private String companyName;
    private int age;
    private String name;
    private double salary;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // region setter/getter
    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getCompanyName(){
        return companyName;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // endregion

    @Override
    public void salaryValidate(double salary) throws WrongSalaryException {
        if (isAgeGreaterThenSalary(salary)) {
            throw new WrongSalaryException("Age is greater then salary");
        }
        if (isSalaryNotSet()) {
            throw new WrongSalaryException("Salary isn't set!");
        }
        System.out.println(this.name + " has a salary that equals " + this.salary);
    }
}
