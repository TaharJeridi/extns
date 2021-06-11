package it.tjeridi.extns.extension

import it.tjeridi.extns.parser.CharSequenceParserUtils

/**
 * if value of charSequence is null return empty string
 */

fun CharSequence?.notNullOrEmptyString(): String {
    this?.let {
        return CharSequenceParserUtils.toString(this)
    }
    return emptyString()
}

/**
 * if value of charSequence is null return default value
 */

fun CharSequence?.notNullOrDefault(defaultValue: CharSequence): String {
    this?.let {
        return CharSequenceParserUtils.toString(this, defaultValue.toSafeString())
    }
    return defaultValue.toSafeString()
}

/**
 * convert char to string, return false if exception happen
 */

fun CharSequence?.toSafeString(): String {
    this?.let {
        return CharSequenceParserUtils.toString(this)
    }
    return emptyString()
}

/**
 * convert string to char,return default value if exception happen
 */

fun CharSequence?.toSafeStringOrDefault(defaultValue: CharSequence): String {
    this?.let {
        return CharSequenceParserUtils.toString(this, defaultValue.toSafeString())
    }
    return defaultValue.toSafeString()
}