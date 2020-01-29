package be.jcrafters.acquire.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.*;

class PlayerTest {
    public static final List<TileCoordinates> TILE_COORDINATES_6 = asList(
            TileCoordinates.create(1, 1),
            TileCoordinates.create(2, 2),
            TileCoordinates.create(3, 3),
            TileCoordinates.create(4, 4),
            TileCoordinates.create(5, 5),
            TileCoordinates.create(6, 6));

    @Test
    void constructor() {
        Player name = new Player("name", TILE_COORDINATES_6);

        assertThat(name.getName()).isEqualTo("name");
        assertThat(name.getMoney()).isEqualTo(6000);
        assertThat(name.getTileCoordinates()).isEqualTo(TILE_COORDINATES_6);
    }

    @Test
    void constructor_IllegalInput() {
        assertThatNullPointerException().isThrownBy(() -> new Player(null, TILE_COORDINATES_6));


        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(5)));
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(4)));
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(3)));
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(2)));
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(1)));
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinatesListOfSize(7)));

        List<TileCoordinates> tileCoordinates = asList(
                TileCoordinates.create(1, 1),
                TileCoordinates.create(2, 2),
                TileCoordinates.create(3, 3),
                TileCoordinates.create(4, 4),
                TileCoordinates.create(5, 5),
                TileCoordinates.create(5, 5)
        );
        assertThatIllegalArgumentException().isThrownBy(() -> new Player("name", tileCoordinates));
    }

    private List<TileCoordinates> tileCoordinatesListOfSize(int endExclusive) {
        return IntStream.rangeClosed(1, endExclusive).mapToObj(i -> TileCoordinates.create(i, i)).collect(toList());
    }
}