package be.jcrafters.acquire.domain;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Player {
    private int money;
    private String name;
    private List<TileCoordinates> tileCoordinates;

    public Player(String name, List<TileCoordinates> tileCoordinates) {
        checkNotNull(name);
        checkArgument(tileCoordinates.stream().distinct().count() == 6);
        this.name = name;
        this.tileCoordinates = tileCoordinates;
        this.money = 6000;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public List<TileCoordinates> getTileCoordinates() {
        return tileCoordinates;
    }
}
