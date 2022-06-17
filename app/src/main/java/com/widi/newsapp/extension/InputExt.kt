package com.widi.newsapp.extension

import android.widget.EditText

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

fun EditText.isEmpty(): Boolean {
    return this.text.isNullOrEmpty()
}