package com.money.transfer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TransferApplications

fun main(args: Array<String>) {
    runApplication<TransferApplication>(*args)
}
