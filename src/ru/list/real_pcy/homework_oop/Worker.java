package ru.list.real_pcy.homework_oop;

public interface Worker {

    /**
     * Метод устанавливает имя компании.
     *
     * @param name
     */
    void setCompanyName(String name);

    /**
     * Метод возвращает имя компании
     *
     * @return имя компании
     */
    String getCompanyName();

    /**
     * Метод возвращает имя работника.
     *
     * @return имя сотрудника
     */
    String getName();

    /**
     * Возвращает возраст сотрудника
     *
     * @return возраст сотрудника
     */
    int getAge();

    /**
     * Метод устанавливает зарплату.
     *
     * @param salary
     */
    void setSalary(double salary);

    /**
     * Возвращает зарплату сотрудника
     *
     * @return зарплата сотрудника
     */
    double getSalary();

    /**
     * Метод печатает дефолтное приветствие.
     */
    default void printHello() {
        System.out.println("Hello! I'm WORKER. My name is " + this.getName());
    }

    /**
     * Метод проверяет зарплату работника
     *
     * @param salary
     */
    void salaryValidate(double salary) throws WrongSalaryException;

    default boolean isSalaryNotSet() {
        return getSalary() <= 0;
    }

    default boolean isAgeGreaterThenSalary(double salary) {
        return getAge() >= salary;
    }
}
