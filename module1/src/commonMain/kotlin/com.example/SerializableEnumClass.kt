package com.example

import kotlinx.serialization.Serializable
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@JsExport
@OptIn(ExperimentalJsExport::class)
@Serializable
enum class SerializableEnumClass {
    VALUE,
    VALUE_2
}