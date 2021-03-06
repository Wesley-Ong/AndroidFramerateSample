package com.grindr.android.framerate.tracer

class FrameRateData(val frames: Long = 0, val slow: Long = 0, val frozen: Long = 0) {
    override fun toString(): String {
        return """
            totalFrames : $frames,
            slowFrames  : $slow,
            frozenFrames: $frozen
        """.trimIndent()
    }
}