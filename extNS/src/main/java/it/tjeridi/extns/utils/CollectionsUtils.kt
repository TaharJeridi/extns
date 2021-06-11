package it.tjeridi.extns.utils

import java.util.*

object CollectionsUtils {

    private val TAG = CollectionsUtils::class.java.name

    fun <T> swap(value:List<T>,fromPosition:Int,toPosition:Int) {
        try {
            if(value.size > fromPosition && value.size > toPosition) {
                Collections.swap(value, fromPosition, toPosition)
            }
        }catch (e:Throwable){
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
    }
}