package com.aspsine.multithreaddownload.util;

public class HttpUtils {
    public static boolean isRedirectable(int responseCode){
        if(responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308){
            return true;
        }
        return false;
    }
}
