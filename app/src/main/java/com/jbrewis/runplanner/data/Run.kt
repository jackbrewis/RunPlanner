package com.jbrewis.runplanner.data

import java.time.Duration

data class Run(
    val runType: String,
    val distance: Long,
    val steps: List<Step>
)

data class Step(
    val name: String,
    val distance: Long,
    val bottomSpeed: Duration,
    val topSpeed: Duration,
) {
    data class interval(
        val workingStep: Step,
        val recoveryStep: Step,
        val repeats: Int,
    )
}

