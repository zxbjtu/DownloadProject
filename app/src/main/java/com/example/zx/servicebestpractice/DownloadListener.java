package com.example.zx.servicebestpractice;

/**
 * Created by zx on 2017/3/9.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
