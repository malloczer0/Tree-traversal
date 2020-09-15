package breathFirstTreeTraversal

import java.util.*

data class Node<T>(val data: T, val nodes: List<Node<T>> = emptyList())

fun traversalBFS(rootNode: Node<Int>) {
    var queue: Queue<Node<Int>> = LinkedList()
    queue.add(rootNode)
    while (queue.isNotEmpty()) {
        print( "${queue.peek().data} ")
        queue.remove().nodes.forEach { queue.add(it) }
    }
}

fun traversalDFS(rootNode: Node<Int>) {
    var stack: Stack<Node<Int>> = Stack()
    stack.add(rootNode)
    while (stack.isNotEmpty()) {
        print("${stack.peek().data} ")
        stack.pop().nodes.forEach { stack.add(it) }
    }
}

fun main() {
    val tree: Node<Int>
            = Node<Int>(14, listOf(Node<Int>(88, emptyList()),
            Node<Int>(13, listOf(Node<Int>(37, emptyList()),
            Node<Int>(2, emptyList()),
            Node<Int>(28, emptyList())))))

    println("Как же я люблю BTS вот они слева направо:")
    traversalBFS(tree)
    println()
    traversalDFS(tree)
}
