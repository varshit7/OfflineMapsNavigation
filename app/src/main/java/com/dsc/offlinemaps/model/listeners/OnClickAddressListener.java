package com.dsc.offlinemaps.model.listeners;

import android.location.Address;
/**
 * Created by Developer Student Club
 * Varshit Ratna(leader)
 * Devaraj Akhil(Core team)
 */

public interface OnClickAddressListener {
    /**
     * tell Activity what to do when address is clicked
     *
     * @param view
     */
    void onClick(Address addr);
}
