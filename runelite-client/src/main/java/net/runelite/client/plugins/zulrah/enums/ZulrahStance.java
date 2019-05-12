package net.runelite.client.plugins.zulrah.enums;

import net.runelite.api.NpcID;
import net.runelite.api.Prayer;

public enum ZulrahStance {
    RANGE(NpcID.ZULRAH, Prayer.PROTECT_FROM_MISSILES),
    MELEE(NpcID.ZULRAH_2043, null),
    MAGE(NpcID.ZULRAH_2044, Prayer.PROTECT_FROM_MAGIC);

    private final Integer id;
    private final Prayer prayer;

    ZulrahStance(final Integer id, final Prayer prayer) {
        this.id = id;
        this.prayer = prayer;
    }

    public Prayer getPrayer() {
        return this.prayer;
    }
}
