package frontend.gamestate.overlays;

import java.util.Collection;

import frontend.gamestate.EntityVisibleState;
import game.engine.entities.EntityGroupID;

public record ChestOverlayData(Collection<ItemData> items) {
    public static record ItemData(EntityGroupID entityGroup, EntityVisibleState visibleState, float stateTime) {
    }
}
