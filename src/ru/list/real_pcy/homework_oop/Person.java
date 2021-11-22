package ru.list.real_pcy.homework_oop;

/**
 1. Перенести общие поля Person и Manager в абстрактный класс.
 2. Абстрактный класс имплементирует интерфейс.
 */

public class Person extends AbstractWorker {

    public Person(String name, int age) {
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

    @Override
    public void printHello() {
        System.out.println("Hello, I'm PERSON");
    }
}
