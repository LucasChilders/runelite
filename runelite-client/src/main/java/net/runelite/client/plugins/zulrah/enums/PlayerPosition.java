package net.runelite.client.plugins.zulrah.enums;

public enum PlayerPosition {
    NORTH_EAST_CORNER(0, 0);

    private int x;
    private int y;

    PlayerPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
}
