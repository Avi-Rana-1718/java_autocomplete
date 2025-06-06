# AutoComplete Java

A simple trie-based autocomplete implementation in Java that builds sentence completions from inserted text data.

## Features

- **Trie Data Structure**: Uses a prefix tree to store and retrieve sentence completions efficiently
- **Multi-word Support**: Handles complete sentences and phrases, not just individual words  
- **Memory Efficient**: Shares common prefixes between different sentences
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

## How It Works

1. **Insertion**: Each sentence is split into words and stored in a trie structure
2. **Lookup**: Traverses the trie to find all possible completions for a given prefix
3. **Storage**: Uses HashMap for root-level words and ArrayList for child nodes

## Data Structure

```
Root (HashMap)
├── "Hi" → Node
│   └── "my" → Node
│       └── "name" → Node
│           └── "is" → Node
│               └── "avi" → Node
└── "I" → Node
    └── "love" → Node
        ├── "my" → Node
        │   ├── "mom" → Node
        │   │   └── "yay" → Node
        │   └── "pops" → Node
        └── ...
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

- Currently hardcoded to search for sentences starting with "I"
- Uses linear search for child nodes (O(n) lookup time)
- No ranking or frequency-based sorting
- Limited API - only supports one type of query

## Future Improvements

- [ ] Accept arbitrary prefixes for completion
- [ ] Use HashMap for child nodes to improve lookup performance
- [ ] Add frequency-based ranking of completions
- [ ] Support case-insensitive matching
- [ ] Add maximum results limit
- [ ] Implement prefix matching for partial words

## Requirements

- Java 8 or higher
- No external dependencies

## License

MIT License - feel free to use and modify as needed.