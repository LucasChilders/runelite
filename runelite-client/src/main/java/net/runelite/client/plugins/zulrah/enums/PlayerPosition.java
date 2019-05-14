package net.runelite.client.plugins.zulrah.enums;

public enum PlayerPosition {
    NORTH_EAST_CORNER(0, 0),
    SOUTH_WEST_CORNER(0, 0),
    SOUTH_WEST_CORNER_N2(0, 0),
    SOUTH_EAST_CORNER(0, 0),
    SOUTH_CENTER(0, 0),
    NORTH_WEST(0, 0),
    NORTH_WEST_N2(0, 0);

    private int x;
    private int y;

    PlayerPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
}
