package be.jcrafters.acquire.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class TileCoordinatesTest {

    @Test
    void constructor() {
        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(0, 1));
        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(1, 0));

        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(-1, 1));
        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(1, -1));

        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(1, 10));
        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(1, 10 + 1));

        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(13, 1));
        assertThatIllegalArgumentException().isThrownBy(() -> TileCoordinates.create(13 + 1, 1));

    }

    @Test
    void toString_() {
        assertThat(TileCoordinates.create(1, 1)).hasToString("1A");
        assertThat(TileCoordinates.create(12, 9)).hasToString("12I");
    }

    @Test
    void getNeighbouringTilePoints() {
        assertThat(TileCoordinates.create(1, 1).getNeighbouringTiles()).containsExactlyInAnyOrder(TileCoordinates.create(1, 2), TileCoordinates.create(2, 1));
        assertThat(TileCoordinates.create(2, 2).getNeighbouringTiles()).containsExactlyInAnyOrder(TileCoordinates.create(1, 2), TileCoordinates.create(2, 3), TileCoordinates.create(3, 2), TileCoordinates.create(2, 1));
        assertThat(TileCoordinates.create(1, 2).getNeighbouringTiles()).containsExactlyInAnyOrder(TileCoordinates.create(1, 1), TileCoordinates.create(1, 3), TileCoordinates.create(2, 2));
        assertThat(TileCoordinates.create(12, 9).getNeighbouringTiles()).containsExactlyInAnyOrder(TileCoordinates.create(12 - 1, 9), TileCoordinates.create(12, 9 - 1));
    }

}