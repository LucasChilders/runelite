package net.runelite.client.plugins.zulrah;

import net.runelite.client.plugins.zulrah.enums.PlayerAttackStyle;
import net.runelite.client.plugins.zulrah.enums.PlayerPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahPosition;
import net.runelite.client.plugins.zulrah.enums.ZulrahStance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ZulrahRotations {
    final static String ROUTE_MMRT = "MeleeMageRangeTop";
    final static String ROUTE_MMRR = "MeleeMageRangeRight";
    final static String ROUTE_M = "Mage";
    final static String ROUTE_R = "Range";

    private static LinkedList<ZulrahPhase> meleeMageRangeTop = new LinkedList<ZulrahPhase>() {{
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
    }};

    private static LinkedList<ZulrahPhase> meleeMageRangeRight = new LinkedList<ZulrahPhase>() {{
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_CENTER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
    }};

    private static LinkedList<ZulrahPhase> mage = new LinkedList<ZulrahPhase>() {{
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.MAGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerPosition.NORTH_EAST_CORNER,
                PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.RANGE));
    }};

    private static LinkedList<ZulrahPhase> range = new LinkedList<ZulrahPhase>() {{
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MELEE,
                PlayerPosition.NORTH_WEST_N2, PlayerPosition.NORTH_WEST,
                PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.SOUTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.WEST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_WEST_CORNER_N2, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.RANGE));
        addLast(new ZulrahPhase(ZulrahPosition.EAST, ZulrahStance.RANGE,
                PlayerPosition.SOUTH_EAST_CORNER, PlayerAttackStyle.MAGE));
        addLast(new ZulrahPhase(ZulrahPosition.NORTH, ZulrahStance.MAGE,
                PlayerPosition.NORTH_EAST_CORNER, PlayerAttackStyle.RANGE));
    }};

    final static Map<String, LinkedList<ZulrahPhase>> ROUTES = new HashMap<String, LinkedList<ZulrahPhase>>() {{
        put(ROUTE_MMRT, meleeMageRangeTop);
        put(ROUTE_MMRR, meleeMageRangeRight);
        put(ROUTE_M, mage);
        put(ROUTE_R, range);
    }};
}

