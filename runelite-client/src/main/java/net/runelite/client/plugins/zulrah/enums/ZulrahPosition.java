package net.runelite.client.plugins.zulrah.enums;

public enum ZulrahPosition {
    EAST(5440, 7360),
    WEST(8000, 7360),
    NORTH(6720, 7616),
    SOUTH(6720, 6208);

    private final int x;
    private final int y;

    ZulrahPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

}