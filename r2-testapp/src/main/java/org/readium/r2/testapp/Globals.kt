package org.readium.r2.testapp

import android.content.Context
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import java.io.File
import java.io.FileFilter

/**
 * Created by aferditamuriqi on 10/3/17.
 */

/**
 * Global Parameters
 */
val PORT_NUMBER = 3333
val BASE_URL = "http://127.0.0.1"
val URL = "$BASE_URL:$PORT_NUMBER"
//val MANIFEST = "/manifest"


/**
 * Extensions
 */


@ColorInt
fun Context.color(@ColorRes id: Int): Int {
    return ContextCompat.getColor(this, id)
}

/**
 * As there are cases where [File.listFiles] returns null even though it is a directory, we return
 * an empty list instead.
 */
fun File.listFilesSafely(filter: FileFilter? = null): List<File> {
    val array: Array<File>? = if (filter == null) listFiles() else listFiles(filter)
    return array?.toList() ?: emptyList()
}
