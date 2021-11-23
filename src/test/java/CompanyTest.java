import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void addNewWorker() {
        Person den = new Person("Den", 22);
        Company google = new Company("Google");
        assertThatNoException().isThrownBy(() -> {
            google.addNewWorker(den, 228);
        });
    }

    @Test
    void deleteWorker() {
        Person finn = new Person("Finn", 45);
        Company wee = new Company("Wee");
        assertThatNoException().isThrownBy(() -> {
            wee.addNewWorker(finn, 56);
            wee.deleteWorker(finn);
        });
    }
}