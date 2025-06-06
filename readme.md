# AutoComplete Java

A simple trie-based autocomplete implementation in Java that builds sentence completions from inserted text data.

## Features

- **Trie Data Structure**: Uses a prefix tree to store and retrieve sentence completions efficiently
- **Multi-word Support**: Handles complete sentences and phrases, not just individual words  
- **Memory Efficient**: Shares common prefixes between different sentences
- **Optimized Performance**: HashMap-based child storage for O(1) lookups
- **Easy Integration**: Simple API with insert and discover methods

## Quick Start

```java
AutoComplete autoComplete = new AutoComplete();

// Insert training sentences
autoComplete.insert("Hi my name is avi");
autoComplete.insert("I love my mom yay");
autoComplete.insert("I love my pops");

// Get completions
autoComplete.discover(); // Returns all sentences starting with "I"
```

## API Reference

### `AutoComplete()`
Creates a new autocomplete instance.

### `void insert(String sentence)`
Adds a sentence to the autocomplete trie.
- **Parameters**: `sentence` - The sentence to add
- **Example**: `autoComplete.insert("Hello world");`

### `void discover()`
Finds and prints all sentences starting with "I".
- **Output**: Prints list of matching sentences to console

## Performance & Complexity

### Time Complexity
- **Insert**: O(L) where L is the sentence length
- **Discover**: O(N) where N is the number of nodes in the result subtree
- **Space**: O(T) where T is the total number of unique words

### Recent Optimizations ✅

| Operation | Before | After | Improvement |
|-----------|--------|-------|-------------|
| Child Lookup | ~~O(C)~~ | **O(1)** | HashMap vs ArrayList |
| Insert Operation | ~~O(L × C)~~ | **O(L)** | Eliminated nested loops |

**C** = average number of children per node

### Code Improvements Made

- ✅ **HashMap for children**: Changed from `ArrayList<Node>` to `Map<String, Node>`
- ✅ **Eliminated linear search**: No more iterating through all children 
- ✅ **Direct key lookup**: `containsKey()` and `get()` operations

```java
// Before: O(C) linear search
for(Node node : currNode.children) {
    if(node.term.equals(words[i])) {
        // Found child - O(C) operation
    }
}

// After: O(1) direct lookup  
if(currNode.children.containsKey(words[i])) {
    currNode = currNode.children.get(words[i]); // O(1) operation
}
```

## How It Works

1. **Insertion**: Each sentence is split into words and stored in a trie structure
2. **Lookup**: Traverses the trie to find all possible completions for a given prefix
3. **Storage**: Uses HashMap for both root-level words and child node relationships

## Data Structure

```
Root (HashMap)
├── "Hi" → Node
│   └── children (HashMap)
│       └── "my" → Node
│           └── children (HashMap)
│               └── "name" → Node
│                   └── children (HashMap)
│                       └── "is" → Node
│                           └── children (HashMap)
│                               └── "avi" → Node
└── "I" → Node
    └── children (HashMap)
        └── "love" → Node
            └── children (HashMap)
                └── "my" → Node
                    └── children (HashMap)
                        ├── "mom" → Node
                        │   └── children (HashMap)
                        │       └── "yay" → Node
                        └── "pops" → Node
```

## Example Output

```
Input sentences:
- "Hi my name is avi"
- "I love my mom yay"  
- "I love my pops"

Output from discover():
[I love my mom yay , I love my pops ]
```

## Limitations
- ~~Uses linear search for child nodes (O(n) lookup time)~~ ✅ **Fixed with HashMap**
- No ranking or frequency-based sorting
- Limited API - only supports one type of query

## Future Improvements

- [ ] Accept arbitrary prefixes for completion
- [x] ~~Use HashMap for child nodes to improve lookup performance~~ ✅ **Completed**
- [ ] Add frequency-based ranking of completions
- [ ] Add maximum results limit
- [ ] Implement prefix matching for partial words

## Requirements

- Java 8 or higher
- No external dependencies

## License

MIT License - feel free to use and modify as needed.

## Contributing

This is a basic implementation with room for improvement. Pull requests welcome for:
- Performance optimizations
- API enhancements  
- Bug fixes
- Documentation improvements