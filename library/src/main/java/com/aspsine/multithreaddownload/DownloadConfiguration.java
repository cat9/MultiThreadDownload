package com.aspsine.multithreaddownload;

/**
 * Created by Aspsine on 2015/7/14.
 */
public class DownloadConfiguration {

    public static final int DEFAULT_MAX_THREAD_NUMBER = 10;

    public static final int DEFAULT_THREAD_NUMBER = 1;

    /**
     * thread number in the pool
     */
    private int maxThreadNum;

    /**
     * thread number for each download
     */
    private int threadNum;

    /**
     * if file size is less than singleDownloadSize,it should use single download thread.
     */
    private long singleDownloadSize;

    private int connectTimeout=8000,readTimeout=8000;

    /**
     * init with default value
     */
    public DownloadConfiguration() {
        maxThreadNum = DEFAULT_MAX_THREAD_NUMBER;
        threadNum = DEFAULT_THREAD_NUMBER;
    }

    public int getMaxThreadNum() {
        return maxThreadNum;
    }

    public void setMaxThreadNum(int maxThreadNum) {
        this.maxThreadNum = maxThreadNum;
    }

    public int getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setSingleDownloadSize(long singleDownloadSize){
        this.singleDownloadSize=singleDownloadSize;
    }

    public long getSingleDownloadSize(){
        return this.singleDownloadSize;
    }
}
