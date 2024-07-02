package com.example

import kotlinx.serialization.Serializable
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@JsExport
@OptIn(ExperimentalJsExport::class)
@Serializable
abstract class AbstractSerializableClass(val name: String) {
}