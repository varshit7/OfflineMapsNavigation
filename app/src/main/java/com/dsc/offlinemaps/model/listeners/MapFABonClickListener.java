package com.dsc.offlinemaps.model.listeners;

import android.view.View;
/**
 * Created by Developer Student Club
 * Varshit Ratna(leader)
 * Devaraj Akhil(Core team)
 */

public interface MapFABonClickListener {
    /**
     * tell Activity what to do when map FAB is clicked
     *
     * @param view
     */
    void mapFABonClick(View view, int pos);
}
