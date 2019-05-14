package net.runelite.client.plugins.zulrah;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;

import javax.inject.Inject;
import java.awt.*;

public class ZulrahPlayerSpotOverlay extends Overlay {
    private final ZulrahPlugin zulrahPlugin;
    private final ZulrahConfig zulrahConfig;
    private final Client client;

    @Inject
    private ZulrahPlayerSpotOverlay(final ZulrahPlugin zulrahPlugin,
                                    final ZulrahConfig zulrahConfig,
                                    final Client client) {
        setLayer(OverlayLayer.ABOVE_SCENE);
        this.zulrahPlugin = zulrahPlugin;
        this.zulrahConfig = zulrahConfig;
        this.client = client;
    }

    @Override
    public Dimension render(final Graphics2D graphics) {

    }
}
