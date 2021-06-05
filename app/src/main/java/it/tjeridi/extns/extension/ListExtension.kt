package it.tjeridi.extns.extension

/**
 * if value of list is null return new empty array list
 */

fun <T> List<T>?.extNSListNotNullOrNewArrayList(): ArrayList<T> {
    this?.let {
        return it.toCollection(ArrayList())
    }
    return ArrayList()
}

/**
 * if value of list is null return default list
 */

fun <T> List<T>?.extNSListNotNullOrDefault(defaultValue: List<T>): List<T> {
    this?.let {
        return it
    }
    return defaultValue
}