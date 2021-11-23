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
        assertThat(google.getWorkerByIndex(0)).isEqualTo(den);
    }

    @Test
    void addingExistentWorker() {
        Person den = new Person("Den", 22);
        Company google = new Company("Google");
        assertThatNoException().isThrownBy(() -> {
            google.addNewWorker(den, 22856);
        });
        Throwable thrown = catchThrowable(() -> {
            google.addNewWorker(den, 22856);
        });
        assertThat(thrown).isInstanceOf(isPersonBelongsToWorkersException.class)
                .hasMessageContaining("This person is already in staff!");
    }

    @Test
    void deleteWorker() {
        Person rex = new Person("Rex", 34);
        Company pop = new Company("Pop");
        assertThatNoException().isThrownBy(() -> {
            pop.addNewWorker(rex, 22856);
            pop.deleteWorker(rex);
        });
    }

    @Test
    void deleteNonExistentWorker(){
        Person rex = new Person("Rex", 34);
        Company pop = new Company("Pop");
        assertThatNoException().isThrownBy(() -> {
            pop.addNewWorker(rex, 22856);
            pop.deleteWorker(rex);
        });
        Throwable thrown = catchThrowable(() -> {
            pop.deleteWorker(rex);
        });
        assertThat(thrown).isInstanceOf(isPersonBelongsToWorkersException.class)
                .hasMessageContaining("This person doesn't belong to staff!");
    }
}