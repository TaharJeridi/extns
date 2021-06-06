package it.tjeridi.extns.utils

import android.util.Log
import it.tjeridi.extns.ExtNSHolder

internal object ExtNSLogHelper {

    fun printStackTrace(tag: String, throwable: Throwable) {
        if (ExtNSHolder.isDebug) {
            Log.i(tag, Log.getStackTraceString(throwable))
        }
    }

}