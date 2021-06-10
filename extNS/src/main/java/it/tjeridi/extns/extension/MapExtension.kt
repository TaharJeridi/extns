package it.tjeridi.extns.extension

/**
 * if value of map is null return new empty hashmap
 */

fun <T, L> Map<T, L>?.notNullOrNewMap(): HashMap<T, L> {
    this?.let {
        val newMap = HashMap<T, L>()
        newMap.putAll(this)
        return newMap
    }
    return HashMap()
}

/**
 * if value of map is null return default map
 */

fun <T, L> Map<T, L>?.notNullOrDefault(defaultValue: Map<T, L>): Map<T, L> {
    this?.let {
        val newMap = HashMap<T, L>()
        newMap.putAll(this)
        return newMap
    }
    return defaultValue
}

