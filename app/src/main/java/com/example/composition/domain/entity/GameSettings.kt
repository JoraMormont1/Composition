package com.example.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val maxCountOfRightQuestions: Int,
    val minPercentOfRightQuestions: Int,
    val gameTimeInSeconds: Int
)
