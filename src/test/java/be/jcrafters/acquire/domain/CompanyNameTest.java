package be.jcrafters.acquire.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompanyNameTest {

    @Test
    void getPrice_2() {
        assertThat(CompanyName.SACKSON.getPrice(2)).isEqualTo(200);
        assertThat(CompanyName.ZETA.getPrice(2)).isEqualTo(200);

        assertThat(CompanyName.AMERICA.getPrice(2)).isEqualTo(300);
        assertThat(CompanyName.FUSION.getPrice(2)).isEqualTo(300);
        assertThat(CompanyName.HYDRA.getPrice(2)).isEqualTo(300);

        assertThat(CompanyName.PHOENIX.getPrice(2)).isEqualTo(400);
        assertThat(CompanyName.QUANTUM.getPrice(2)).isEqualTo(400);
    }

    @Test
    void getPrice_3() {
        assertThat(CompanyName.SACKSON.getPrice(3)).isEqualTo(300);
        assertThat(CompanyName.ZETA.getPrice(3)).isEqualTo(300);

        assertThat(CompanyName.AMERICA.getPrice(3)).isEqualTo(400);
        assertThat(CompanyName.FUSION.getPrice(3)).isEqualTo(400);
        assertThat(CompanyName.HYDRA.getPrice(3)).isEqualTo(400);

        assertThat(CompanyName.PHOENIX.getPrice(3)).isEqualTo(500);
        assertThat(CompanyName.QUANTUM.getPrice(3)).isEqualTo(500);
    }

    @Test
    void getPrice_6_10() {
        assertThat(CompanyName.SACKSON.getPrice(6)).isEqualTo(600);
        assertThat(CompanyName.ZETA.getPrice(6)).isEqualTo(600);

        assertThat(CompanyName.AMERICA.getPrice(6)).isEqualTo(700);
        assertThat(CompanyName.FUSION.getPrice(6)).isEqualTo(700);
        assertThat(CompanyName.HYDRA.getPrice(6)).isEqualTo(700);

        assertThat(CompanyName.PHOENIX.getPrice(6)).isEqualTo(800);
        assertThat(CompanyName.QUANTUM.getPrice(6)).isEqualTo(800);

        assertThat(CompanyName.SACKSON.getPrice(10)).isEqualTo(600);
        assertThat(CompanyName.ZETA.getPrice(10)).isEqualTo(600);

        assertThat(CompanyName.AMERICA.getPrice(10)).isEqualTo(700);
        assertThat(CompanyName.FUSION.getPrice(10)).isEqualTo(700);
        assertThat(CompanyName.HYDRA.getPrice(10)).isEqualTo(700);

        assertThat(CompanyName.PHOENIX.getPrice(10)).isEqualTo(800);
        assertThat(CompanyName.QUANTUM.getPrice(10)).isEqualTo(800);
    }


    @Test
    void getPrice_11_20() {
        assertThat(CompanyName.SACKSON.getPrice(11)).isEqualTo(700);
        assertThat(CompanyName.ZETA.getPrice(11)).isEqualTo(700);

        assertThat(CompanyName.AMERICA.getPrice(11)).isEqualTo(800);
        assertThat(CompanyName.FUSION.getPrice(11)).isEqualTo(800);
        assertThat(CompanyName.HYDRA.getPrice(11)).isEqualTo(800);

        assertThat(CompanyName.PHOENIX.getPrice(11)).isEqualTo(900);
        assertThat(CompanyName.QUANTUM.getPrice(11)).isEqualTo(900);

        assertThat(CompanyName.SACKSON.getPrice(20)).isEqualTo(700);
        assertThat(CompanyName.ZETA.getPrice(20)).isEqualTo(700);

        assertThat(CompanyName.AMERICA.getPrice(20)).isEqualTo(800);
        assertThat(CompanyName.FUSION.getPrice(20)).isEqualTo(800);
        assertThat(CompanyName.HYDRA.getPrice(20)).isEqualTo(800);

        assertThat(CompanyName.PHOENIX.getPrice(20)).isEqualTo(900);
        assertThat(CompanyName.QUANTUM.getPrice(20)).isEqualTo(900);

    }

    @Test
    void getPrice_21_30() {
        assertThat(CompanyName.SACKSON.getPrice(21)).isEqualTo(800);
        assertThat(CompanyName.ZETA.getPrice(21)).isEqualTo(800);

        assertThat(CompanyName.AMERICA.getPrice(21)).isEqualTo(900);
        assertThat(CompanyName.FUSION.getPrice(21)).isEqualTo(900);
        assertThat(CompanyName.HYDRA.getPrice(21)).isEqualTo(900);

        assertThat(CompanyName.PHOENIX.getPrice(21)).isEqualTo(1000);
        assertThat(CompanyName.QUANTUM.getPrice(21)).isEqualTo(1000);

        assertThat(CompanyName.SACKSON.getPrice(30)).isEqualTo(800);
        assertThat(CompanyName.ZETA.getPrice(30)).isEqualTo(800);

        assertThat(CompanyName.AMERICA.getPrice(30)).isEqualTo(900);
        assertThat(CompanyName.FUSION.getPrice(30)).isEqualTo(900);
        assertThat(CompanyName.HYDRA.getPrice(30)).isEqualTo(900);

        assertThat(CompanyName.PHOENIX.getPrice(30)).isEqualTo(1000);
        assertThat(CompanyName.QUANTUM.getPrice(30)).isEqualTo(1000);
    }

    @Test
    void getPrice_31_40() {
        assertThat(CompanyName.SACKSON.getPrice(31)).isEqualTo(900);
        assertThat(CompanyName.ZETA.getPrice(31)).isEqualTo(900);

        assertThat(CompanyName.AMERICA.getPrice(31)).isEqualTo(1000);
        assertThat(CompanyName.FUSION.getPrice(31)).isEqualTo(1000);
        assertThat(CompanyName.HYDRA.getPrice(31)).isEqualTo(1000);

        assertThat(CompanyName.PHOENIX.getPrice(31)).isEqualTo(1100);
        assertThat(CompanyName.QUANTUM.getPrice(31)).isEqualTo(1100);

        assertThat(CompanyName.SACKSON.getPrice(40)).isEqualTo(900);
        assertThat(CompanyName.ZETA.getPrice(40)).isEqualTo(900);

        assertThat(CompanyName.AMERICA.getPrice(40)).isEqualTo(1000);
        assertThat(CompanyName.FUSION.getPrice(40)).isEqualTo(1000);
        assertThat(CompanyName.HYDRA.getPrice(40)).isEqualTo(1000);

        assertThat(CompanyName.PHOENIX.getPrice(40)).isEqualTo(1100);
        assertThat(CompanyName.QUANTUM.getPrice(40)).isEqualTo(1100);
    }

    @Test
    void getPrice_41() {
        assertThat(CompanyName.SACKSON.getPrice(41)).isEqualTo(1000);
        assertThat(CompanyName.ZETA.getPrice(41)).isEqualTo(1000);

        assertThat(CompanyName.AMERICA.getPrice(41)).isEqualTo(1100);
        assertThat(CompanyName.FUSION.getPrice(41)).isEqualTo(1100);
        assertThat(CompanyName.HYDRA.getPrice(41)).isEqualTo(1100);

        assertThat(CompanyName.PHOENIX.getPrice(41)).isEqualTo(1200);
        assertThat(CompanyName.QUANTUM.getPrice(41)).isEqualTo(1200);
    }

    @Test
    void getPrice_51() {
        assertThat(CompanyName.SACKSON.getPrice(51)).isEqualTo(1000);
        assertThat(CompanyName.ZETA.getPrice(51)).isEqualTo(1000);

        assertThat(CompanyName.AMERICA.getPrice(51)).isEqualTo(1100);
        assertThat(CompanyName.FUSION.getPrice(51)).isEqualTo(1100);
        assertThat(CompanyName.HYDRA.getPrice(51)).isEqualTo(1100);

        assertThat(CompanyName.PHOENIX.getPrice(51)).isEqualTo(1200);
        assertThat(CompanyName.QUANTUM.getPrice(51)).isEqualTo(1200);
    }


}