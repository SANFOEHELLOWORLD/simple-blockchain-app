package kcoin
import java.time.Instant

//nonce field used for finding special hash for validating a Block object
data class Block(val previousHash: String, val data: String, val timestamp: Long = Instant.now().toEpochMilli(), var nonce : Long = 0, var hash: String = "") {
    init {
        hash = calculateHash()
    }

    fun calculateHash(): String {
        return "$previousHash$data$timestamp$nonce".hash()
    }
}