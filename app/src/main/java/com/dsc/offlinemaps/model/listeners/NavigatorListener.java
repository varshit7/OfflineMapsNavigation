package com.dsc.offlinemaps.model.listeners;

/**
 * Created by Developer Student Club
 * Varshit Ratna(leader)
 * Devaraj Akhil(Core team)
 */

public interface NavigatorListener {
    /**
     * the change on navigator: navigation is used or not
     *
     * @param on
     */
    void onStatusChanged(boolean on);
    
    void onNaviStart(boolean on);
}
