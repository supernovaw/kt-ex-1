package main

import kotlin.math.pow

fun main() {
	val bmi = bmi(1.8, 75.0)
	val group = when {
		bmi < 15 -> "Very severely underweight"
		bmi < 16 -> "Severely underweight"
		bmi < 18.5 -> "Underweight"
		bmi < 25 -> "Normal (healthy weight)"
		bmi < 30 -> "Overweight"
		bmi < 35 -> "Obese Class I (Moderately obese)"
		bmi < 40 -> "Obese Class II (Severely obese)"
		else -> "Anomaly"
	}
	println(group + '\t' + (bmi * 100).toInt() / 100.0)
}

fun bmi(heightMeters: Double, weightKg: Double): Double {
	return weightKg / heightMeters.pow(2)
}