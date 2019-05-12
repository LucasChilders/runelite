package net.runelite.client.plugins.zulrah;


import net.runelite.client.plugins.zulrah.enums.PlayerAttackStyle;
import net.runelite.client.plugins.zulrah.enums.PlayerPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahStance;

import java.util.ArrayList;
import java.util.List;

public class ZulrahPlugin {
    // TODO these should be in a map of <ROUTE_NAME, ROUTE> type
    
    // melee -> mage -> range top
    public static List<ZulrahPhase> routeA = new ArrayList<ZulrahPhase>() {{
        add(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));

    }};

    // melee -> mage -> range right
    public static List<ZulrahPhase> routeB = new ArrayList<ZulrahPhase>() {{

    }};

    // mage
    public static List<ZulrahPhase> routeC = new ArrayList<ZulrahPhase>() {{

    }};

    // range
    public static List<ZulrahPhase> routeD = new ArrayList<ZulrahPhase>() {{

    }};
}
