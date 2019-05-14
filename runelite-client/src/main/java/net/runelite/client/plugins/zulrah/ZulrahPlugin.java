package net.runelite.client.plugins.zulrah;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.OverlayManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class ZulrahPlugin {
    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private ZulrahConfig zulrahConfig;

    @Inject
    private ZulrahPlayerSpotOverlay zulrahPlayerSpotOverlay;

    private NPC zulrah;
    private LocalPoint currentZulrahLocation;
    private ArrayList<String> possibleRotations;
    private LinkedList<ZulrahPlugin> foundRotation;

    @Inject
    public ZulrahPlugin(final Client client,
                        final OverlayManager overlayManager,
                        final ZulrahConfig zulrahConfig,
                        final ZulrahPlayerSpotOverlay zulrahPlayerSpotOverlay) {
        this.client = client;
        this.overlayManager = overlayManager;
        this.zulrahConfig = zulrahConfig;
        this.zulrahPlayerSpotOverlay = zulrahPlayerSpotOverlay;
    }


    @Subscribe
    private void onGameTick(final GameTick gameTick) {
        if (!isInZulrahLair()) {
            this.foundRotation = Lists.newLinkedList();
            this.possibleRotations = new ArrayList<String>() {{
                add(ZulrahRotations.ROUTE_M);
                add(ZulrahRotations.ROUTE_R);
                add(ZulrahRotations.ROUTE_MMRR);
                add(ZulrahRotations.ROUTE_MMRT);
            }};
            this.currentZulrahLocation = null;
            
            return;
        }

        if (this.currentZulrahLocation != zulrah.getLocalLocation()) {

            // next phase
        }

        // keep current phase in memory.
        this.currentZulrahLocation = zulrah.getLocalLocation();


    }

    /**
     * Detects whether or not the player is in Zulrah's lair.
     * @return
     */
    public boolean isInZulrahLair() {
        for (final NPC npc : client.getNpcs()) {
            if (npc.getName().equalsIgnoreCase("zulrah")) {
                this.zulrah = npc;
                return true;
            }
        }
        return false;
    }
}
