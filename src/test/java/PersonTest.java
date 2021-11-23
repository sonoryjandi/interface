import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void salaryValidate() {
        Person alex = new Person("Alex", 32);
        alex.setSalary(25);
        Throwable thrown = catchThrowable(() -> alex.salaryValidate(alex.getSalary()));
        assertThat(thrown).isInstanceOf(WrongSalaryException.class)
                .hasMessage("Age is greater then salary");
    }
}