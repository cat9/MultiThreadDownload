package com.aspsine.multithreaddownload.architecture;

import com.aspsine.multithreaddownload.DownloadInfo;

/**
 * Created by Aspsine on 2015/10/29.
 */
public interface Downloader {

    interface OnDownloaderDestroyedListener {
        void onDestroyed(String key, Downloader downloader);
    }

    DownloadInfo getDownloadInfo();

    boolean isRunning();

    void start();

    void pause();

    void cancel();

    void onDestroy();

}
