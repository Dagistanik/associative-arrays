class ElementCounterGroovy {
    static Map countElements(List<Integer> arr) {
        def countMap = [:]
        arr.each { num ->
            countMap[num] = countMap.get(num, 0) + 1
        }
        return countMap
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        println "Enter a list of integers separated by commas:"
        def input = scanner.nextLine()

        try {
            def arr = input.split(',').collect { it.trim().toInteger() }
            def countMap = countElements(arr)
            println(countMap)
        } catch (NumberFormatException e) {
            println "Invalid input. Please enter a list of integers separated by commas."
        }
    }
}