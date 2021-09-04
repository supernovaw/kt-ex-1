package main

fun main() {
	println(calculateFee(200, 11000))
}

fun calculateFee(current: Int, total: Int, exclusive: Boolean = false): Int {
	var fee = when {
		total <= 1000 -> .3
		total <= 10000 -> .25
		total <= 50000 -> .2
		else -> .15
	}
	if (exclusive) fee -= .05
	return (current * fee).toInt()
}