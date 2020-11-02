package com.rogermiranda1000.portals;

import com.rogermiranda1000.portalgun.Direction;
import org.bukkit.Location;

public class CeilingPortal extends Portal {
    CeilingPortal(Location loc, Direction dir, boolean isLeft) {
        super(loc, dir, isLeft);
    }

    public boolean insidePortal(Location loc) {
        return false;
    }

    public void playParticle() {

    }
}
