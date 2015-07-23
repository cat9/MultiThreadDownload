package com.aspsine.multithreaddownload.core;

/**
 * Created by Aspsine on 2015/7/22.
 */
public interface DownloadTask extends Runnable {

    interface OnDownloadListener {
        void onProgress(int finished, int length);

        void onComplete();

        void onFail(DownloadException de);
    }

    void cancel();

    void pause();

    boolean isFinished();

    @Override
    void run();
}
