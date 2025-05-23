import kcoin.Block

fun main(args: Array<String>) {
    val genesisBlock = Block(previousHash = "0", data = "I'm up")
    val secondBlock = Block(genesisBlock.hash, "I'm on deck")
    val thirdBlock = Block(secondBlock.hash, "I'm not on deck yet")

    println(genesisBlock)
    println(secondBlock)
    println(thirdBlock)
}