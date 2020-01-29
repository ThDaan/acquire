package be.jcrafters.acquire.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TileCoordinates {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE_X = 12;
    public static final int MAX_VALUE_Y = 9;
    private final int x;
    private final int y;

    private TileCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static TileCoordinates create(int x, int y) {
        if (inValidTile(x, y)) {
            throw new IllegalArgumentException();
        }

        return new TileCoordinates(x, y);
    }

    @Override
    public String toString() {
        return x + Character.toString((char) (64 + y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TileCoordinates tileCoordinates = (TileCoordinates) o;
        return x == tileCoordinates.x &&
                y == tileCoordinates.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    private static boolean inValidTile(int x, int y) {
        return x < MIN_VALUE || y < MIN_VALUE || x > MAX_VALUE_X || y > MAX_VALUE_Y;
    }

    public List<TileCoordinates> getNeighbouringTiles() {
        List<TileCoordinates> neighbouringCoordinates = new ArrayList<>();
        if (x < MAX_VALUE_X) {
            neighbouringCoordinates.add(TileCoordinates.create(x + 1, y));
        }
        if (x > MIN_VALUE) {
            neighbouringCoordinates.add(TileCoordinates.create(x - 1, y));
        }
        if (y < MAX_VALUE_Y) {
            neighbouringCoordinates.add(TileCoordinates.create(x, y + 1));
        }
        if (y > MIN_VALUE) {
            neighbouringCoordinates.add(TileCoordinates.create(x, y - 1));
        }
        return neighbouringCoordinates;
    }
}
