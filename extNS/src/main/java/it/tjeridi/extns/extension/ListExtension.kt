package it.tjeridi.extns.extension

import it.tjeridi.extns.utils.CollectionsUtils
import kotlin.collections.ArrayList
import kotlin.math.min

/**
 * if value of list is null return new empty array list
 */

fun <T> List<T>?.notNullOrNewArrayList(): ArrayList<T> {
    this?.let {
        return it.toCollection(ArrayList())
    }
    return ArrayList()
}

/**
 * if value of list is null return default list
 */

fun <T> List<T>?.notNullOrDefault(defaultValue: List<T>): List<T> {
    this?.let {
        return it
    }
    return defaultValue
}

/**
 * return sublist if list is not empty
 */

fun <T> List<T>?.safeSubList(start: Int, end: Int): List<T> {
    this?.let {
        if (isEmpty()) {
            return emptyList()
        }
        return subList(start, min(size, end))
    }
    return emptyList()
}

/**
 * swap List if is not null and not empty
 */

fun <T> List<T>?.safeSwap(fromPosition: Int, toPosition: Int) {
    this?.let {
        if (!isEmpty()) {
            CollectionsUtils.swap(this, fromPosition, toPosition)
        }
    }
}
