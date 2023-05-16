package com.galaxy.galaxyphoto.common

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.os.NetworkOnMainThreadException

fun downloadFileFromUrl(urlFile: String, context: Context, fileName: String): Long {
        var downloadID: Long = 0
        val downloadUri = Uri.parse(urlFile)
        val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val request = DownloadManager.Request(downloadUri)
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
        //Set whether this download may proceed over a roaming connection.
        request.setAllowedOverRoaming(false)
        //Set the title of this download, to be displayed in notifications (if enabled).
        //If no title is given, a default one will be assigned based on the download filename, once the download starts.
        if (fileName.isNotEmpty()) {
            request.setTitle(fileName)
        }
        //Set a description of this download, to be displayed in notifications (if enabled)
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
        //Set the local destination for the downloaded file to a path within the application's external files directory
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
        try {
            downloadID = downloadManager.enqueue(request)
            ProgressManager.current.showNotify("Downloading",true)
        } catch (e: NetworkOnMainThreadException) {
            e.printStackTrace()
        }
        return downloadID
    }