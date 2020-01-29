package be.jcrafters.acquire.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CompanyVOTest {

    @Test
    void constructor() {
        assertThatNullPointerException().isThrownBy(() -> new CompanyVO(null, 20, 2));

        assertThatIllegalArgumentException().isThrownBy(() -> new CompanyVO(CompanyName.AMERICA, -1, 2));
        assertThatIllegalArgumentException().isThrownBy(() -> new CompanyVO(CompanyName.AMERICA, 26, 2));

        assertThatIllegalArgumentException().isThrownBy(() -> new CompanyVO(CompanyName.AMERICA, 20, 1));

        assertThatCode(() -> new CompanyVO(CompanyName.AMERICA, 24, 4)).doesNotThrowAnyException();
        assertThatCode(() -> new CompanyVO(CompanyName.AMERICA, 24, 10)).doesNotThrowAnyException();
    }

    @Test
    void getPrice() {
        assertThat(new CompanyVO(CompanyName.FUSION, 24, 4).getPrice()).isEqualTo(CompanyName.FUSION.getPrice(4));
        assertThat(new CompanyVO(CompanyName.PHOENIX, 24, 10).getPrice()).isEqualTo(CompanyName.PHOENIX.getPrice(10));
    }
}