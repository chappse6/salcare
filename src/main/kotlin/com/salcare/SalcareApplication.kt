package com.salcare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SalcareApplication

fun main(args: Array<String>) {
	runApplication<SalcareApplication>(*args)
}
