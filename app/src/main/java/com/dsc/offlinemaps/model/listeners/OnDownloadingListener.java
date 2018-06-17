package com.dsc.offlinemaps.model.listeners;

import android.widget.ProgressBar;
import android.widget.TextView;
/**
 * Created by Developer Student Club
 * Varshit Ratna(leader)
 * Devaraj Akhil(Core team)
 */

public interface OnDownloadingListener {
    void progressbarReady(TextView downloadStatus, ProgressBar progressBar, int pos);
}
