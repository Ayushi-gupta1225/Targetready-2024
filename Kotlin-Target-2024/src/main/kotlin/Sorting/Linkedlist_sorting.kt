package org.example.Sorting

class ListNode(var value: Int) {
    var next: ListNode? = null
    var prev: ListNode? = null // Only for doubly linked list
}

class SinglyLinkedList {
    var head: ListNode? = null

    fun add(value: Int) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }
}

class DoublyLinkedList {
    var head: ListNode? = null
    var tail: ListNode? = null

    fun add(value: Int) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
    }
}

fun bubbleSortLinkedList(list: SinglyLinkedList) {
    var sorted = false
    while (!sorted) {
        sorted = true
        var current = list.head
        var prev: ListNode? = null
        while (current?.next != null) {
            val nextNode = current.next
            if (current.value > nextNode!!.value) {
                // Swap nodes
                if (prev == null) {
                    list.head = nextNode
                } else {
                    prev.next = nextNode
                }
                current.next = nextNode.next
                nextNode.next = current
                sorted = false
            } else {
                prev = current
                current = nextNode
            }
        }
    }
}

fun selectionSortLinkedList(list: SinglyLinkedList) {
    var current = list.head
    while (current != null) {
        var min = current
        var r = current.next
        while (r != null) {
            if (min!!.value > r.value) {
                min = r
            }
            r = r.next
        }
        val temp = current.value
        current.value = min!!.value
        min.value = temp
        current = current.next
    }
}

fun insertionSortLinkedList(list: DoublyLinkedList) {
    var current = list.head?.next
    while (current != null) {
        val key = current.value
        var prev = current.prev
        while (prev != null && prev.value > key) {
            prev.next!!.value = prev.value
            prev = prev.prev
        }
        prev?.next?.value = key
        current = current.next
    }
}

fun mergeSortLinkedList(list: SinglyLinkedList) {
    list.head = mergeSort(list.head)
}

fun mergeSortLinkedList(list: DoublyLinkedList) {
    val newHead = mergeSort(list.head)
    list.head = newHead
    var current = newHead
    while (current?.next != null) {
        current = current.next
    }
    list.tail = current
}

fun mergeSort(head: ListNode?): ListNode? {
    if (head == null || head.next == null) {
        return head
    }

    // Find middle node
    var slow = head
    var fast = head
    var prev: ListNode? = null
    while (fast != null && fast.next != null) {
        prev = slow
        slow = slow!!.next
        fast = fast.next!!.next
    }

    prev!!.next = null // Split the list into two halves

    val left = mergeSort(head)
    val right = mergeSort(slow)

    return merge(left, right)
}

fun merge(left: ListNode?, right: ListNode?): ListNode? {
    var l = left
    var r = right
    val dummy = ListNode(0)
    var current: ListNode? = dummy

    while (l != null && r != null) {
        if (l.value < r.value) {
            current!!.next = l
            l = l.next
        } else {
            current!!.next = r
            r = r.next
        }
        current = current.next
    }

    current!!.next = l ?: r

    return dummy.next
}

fun main() {
    val singlyList = SinglyLinkedList()
    val doublyList = DoublyLinkedList()

    // Adding elements to the lists
    val elements = arrayOf(45, 23, 78, 12, 56, 34, 90, 9)
    for (element in elements) {
        singlyList.add(element)
        doublyList.add(element)
    }

    println("Choose sorting algorithm:")
    println("1. Bubble Sort")
    println("2. Selection Sort")
    println("3. Insertion Sort")
    println("4. Merge Sort")
    print("Enter your choice: ")

    val choice = readLine()?.toInt() ?: 0

    when (choice) {
        1 -> {
            println("Singly Linked List before sorting:")
            displayLinkedList(singlyList.head)
            bubbleSortLinkedList(singlyList)
            println("Singly Linked List after Bubble Sort:")
            displayLinkedList(singlyList.head)
        }
        2 -> {
            println("Singly Linked List before sorting:")
            displayLinkedList(singlyList.head)
            selectionSortLinkedList(singlyList)
            println("Singly Linked List after Selection Sort:")
            displayLinkedList(singlyList.head)
        }
        3 -> {
            println("Doubly Linked List before sorting:")
            displayLinkedList(doublyList.head)
            insertionSortLinkedList(doublyList)
            println("Doubly Linked List after Insertion Sort:")
            displayLinkedList(doublyList.head)
        }
        4 -> {
            println("Singly Linked List before sorting:")
            displayLinkedList(singlyList.head)
            mergeSortLinkedList(singlyList)
            println("Singly Linked List after Merge Sort:")
            displayLinkedList(singlyList.head)
        }
        else -> println("Invalid choice!")
    }
}

fun displayLinkedList(node: ListNode?) {
    var current = node
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    println("null")
}
