package com.aspsine.multithreaddownload;


import java.io.File;

/**
 * Created by Aspsine on 2015/4/20.
 */
public class DownloadRequest {

    private String mUri;

    private String finalUri;

    private File mFolder;

    private CharSequence mName;

    private CharSequence mDescription;

    private boolean mScannable;

    private boolean mForceSingleTask;

    private long mSingleDownloadSize;

    private DownloadRequest() {
    }

    private DownloadRequest(String uri, File folder, CharSequence name, CharSequence description, boolean scannable,boolean singleTask,long singleDownloadSize) {
        this.mUri = uri;
        this.mFolder = folder;
        this.mName = name;
        this.mDescription = description;
        this.mScannable = scannable;
        this.mForceSingleTask =singleTask;
        this.mSingleDownloadSize = singleDownloadSize;
    }

    public String getUri() {
        return mUri;
    }

    public String getFinalUri() {
        return finalUri;
    }

    public void setFinalUri(String finalUri) {
        this.finalUri = finalUri;
    }

    public File getFolder() {
        return mFolder;
    }

    public CharSequence getName() {
        return mName;
    }

    public CharSequence getDescription() {
        return mDescription;
    }

    public boolean isScannable() {
        return mScannable;
    }

    public long getSingleDownloadSize(){
        return mSingleDownloadSize;
    }

    public boolean checkSingleTask(DownloadConfiguration configuration,long length){
        if(mForceSingleTask){
            return true;
        }
        if(mSingleDownloadSize<=0){
            mSingleDownloadSize=configuration.getSingleDownloadSize();
        }
        if(length<=mSingleDownloadSize){
            return true;
        }
        return false;
    }

    public static class Builder {

        private String mUri;

        private File mFolder;

        private CharSequence mName;

        private CharSequence mDescription;

        private boolean mScannable;

        private boolean mForceSingleTask;

        private long mSingleDownloadSize;

        public Builder() {
        }

        public Builder setUri(String uri) {
            this.mUri = uri;
            return this;
        }

        public Builder setFolder(File folder) {
            this.mFolder = folder;
            return this;
        }

        public Builder setName(CharSequence name) {
            this.mName = name;
            return this;
        }

        public Builder setDescription(CharSequence description) {
            this.mDescription = description;
            return this;
        }

        public Builder setScannable(boolean scannable) {
            this.mScannable = scannable;
            return this;
        }

        public Builder setSingleTask(boolean singleTask){
            this.mForceSingleTask=singleTask;
            return this;
        }

        public Builder setSingleDownloadSize(long singleDownloadSize){
            this.mSingleDownloadSize=singleDownloadSize;
            return this;
        }

        public DownloadRequest build() {
            DownloadRequest request = new DownloadRequest(mUri, mFolder, mName, mDescription, mScannable,mForceSingleTask,mSingleDownloadSize);
            return request;
        }
    }
}
