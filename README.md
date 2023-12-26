# Task1

## Features
- Reads a list of integers from the user.
- Removes duplicate integers.
- Sorts the unique integers in ascending order.
- Displays statistics: total count, count of distinct numbers, minimum, and maximum values.

## Implementation Details
- **Input Handling**: Utilizes `Scanner` for reading user input.
- **Data Processing**: Employs `Arrays.stream` and `mapToLong` for efficient string to long array conversion.
- **Duplicate Removal**: Uses `HashSet` for efficient duplicate elimination.
- **Sorting and Output**: Implements `stream().sorted()` for data sorting and `System.out.println()` for displaying results.

---

# Task2

## Features
- Input processing with `Scanner`.
- Conversion of input strings to a list of long integers.
- Finding all unique pairs of numbers that sum to a specific target (13).
- Outputting each unique pair to the console.

## Implementation Details
- **Input Processing:** Uses `Scanner` to read and process user input. The input string is split into an array and then converted into a list of Long values.
- **Pair Finding Logic:** The `findPairs` method employs a `HashMap` to store occurrences of numbers. It then iterates through the list, checking for complement values that, when added, equal the target sum.
- **Ensuring Uniqueness:** A `HashSet` named `addedPairs` is used to ensure that each pair is added only once, thus avoiding duplicate pairs in the output.
- **Sorting Pairs:** The final list of pairs is sorted to provide an ordered output based on the first element of each pair.

---
# Task3

## Features
- Creation of an undirected graph from input edges.
- Implementation of depth-first search to explore graph components.
- Counting the number of disconnected components in the graph.

## Implementation Details
- **Graph Representation:** The graph is represented as an adjacency list using a `HashMap<Long, Set<Long>>`, where each key is a node, and the value is a set of connected nodes.
- **Edge Addition:** `addEdge` method is used for adding edges to the graph, ensuring that both nodes of the edge are added to each other's adjacency list.
- **Depth-First Search (DFS):** The `exploreIterative` method implements an iterative DFS approach using a stack to explore the graph.
- **Connected Components:** The `countComponents` method traverses the graph to count distinct connected components, ensuring each node is visited only once.


## Author
Hubert Spodynek
