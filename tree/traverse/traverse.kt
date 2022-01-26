package com.airwallex.pa.fundsplits.application.commandhandler

import org.junit.jupiter.api.Test
import java.util.*

class Test {

    @Test
    fun test() {
        val root: Node = Node(0)
        val l1left: Node = Node(1)
        val l1right: Node = Node(2)
        val l2left: Node = Node(3)
        val l2right: Node = Node(4)
        val l3left: Node = Node(5)
        val l4right: Node = Node(6)

        root.left = l1left
        root.right = l1right
        l1left.left = l2left
        l1left.right = l2right
        l2right.left = l3left
        l3left.right = l4right

        println("dst")
        dst(root)

        println("bst")
        bst(root)

    }

}

fun dst(root: Node) {
    root.left?.also { dst(it) }
    root.right?.also { dst(it) }
    println(root.value)
}

fun bst(root: Node) {
    val queue: Queue<Node> = ArrayDeque()
    queue.add(root)

    while (queue.peek() != null) {
        val node = queue.poll()
        println(node.value)
        node.left?.also { queue.add(it) }
        node.right?.also { queue.add(it) }
    }
}

data class Node(
    var value: Int,
    var left: Node? = null,
    var right: Node? = null
)