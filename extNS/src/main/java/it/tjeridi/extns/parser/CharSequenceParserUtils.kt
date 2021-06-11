package it.tjeridi.extns.parser

import it.tjeridi.extns.utils.ExtNSLogHelper

internal object CharSequenceParserUtils {

    private val TAG = CharSequenceParserUtils::class.java.name

    fun toString(value: CharSequence?): String {
        try {
            return value.toString()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return ""
    }


    fun toString(value: CharSequence?,default:String): String {
        try {
            return value.toString()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return default
    }

}