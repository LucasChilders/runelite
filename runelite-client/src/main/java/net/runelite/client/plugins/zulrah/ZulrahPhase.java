package net.runelite.client.plugins.zulrah;

import lombok.Getter;
import net.runelite.client.plugins.zulrah.enums.PlayerAttackStyle;
import net.runelite.client.plugins.zulrah.enums.PlayerPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahStance;

public class ZulrahPhase {
    @Getter private ZulrahPosition zulrahPosition;
    @Getter private ZulrahStance zulrahStance;
    @Getter private PlayerPosition playerPosition;
    @Getter private PlayerPosition secondaryPlayerPosition;
    @Getter private PlayerAttackStyle playerAttackStyle;

    ZulrahPhase(final ZulrahPosition zulrahPosition,
                final ZulrahStance zulrahStance,
                final PlayerPosition playerPosition,
                final PlayerAttackStyle playerAttackStyle) {
        this.zulrahPosition = zulrahPosition;
        this.zulrahStance = zulrahStance;
        this.playerPosition = playerPosition;
        this.playerAttackStyle = playerAttackStyle;
    }

    ZulrahPhase(final ZulrahPosition zulrahPosition,
                final ZulrahStance zulrahStance,
                final PlayerPosition playerPosition,
                final PlayerAttackStyle playerAttackStyle,
                final PlayerPosition secondaryPlayerPosition) {
        this(zulrahPosition, zulrahStance, playerPosition, playerAttackStyle);
        this.secondaryPlayerPosition = secondaryPlayerPosition;
    }
}
