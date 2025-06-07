# AutoComplete Java

A sophisticated trie-based autocomplete implementation in Java that builds sentence completions from inserted text data with support for arbitrary prefix queries.

## Features

- **Trie Data Structure**: Uses a prefix tree to store and retrieve sentence completions efficiently
- **Multi-word Support**: Handles complete sentences and phrases, not just individual words  
- **Flexible Prefix Search**: Supports searching with any prefix, not limited to single letters
- **Case Insensitive**: All input is normalized to lowercase for consistent matching
- **Memory Efficient**: Shares common prefixes between different sentences
- **Optimized Performance**: HashMap-based child storage for O(1) lookups
- **Comprehensive Test Data**: Includes 200+ sample sentences for robust testing

## Quick Start

```java
AutoComplete autoComplete = new AutoComplete();

// Insert training sentences
autoComplete.insert("I love programming");
autoComplete.insert("I love ice cream");
autoComplete.insert("I love chocolate cake");

// Get completions for any prefix
autoComplete.discover("i love");  // Returns all sentences starting with "i love"
```

## API Reference

### `AutoComplete()`
Creates a new autocomplete instance with an empty trie.

### `void insert(String sentence)`
Adds a sentence to the autocomplete trie.
- **Parameters**: `sentence` - The sentence to add (automatically converted to lowercase)
- **Example**: `autoComplete.insert("Hello world how are you");`
- **Complexity**: O(L) where L is the sentence length in words

### `void discover(String prefix)`
Finds and prints all sentences starting with the given prefix.
- **Parameters**: `prefix` - The prefix to search for (supports multi-word prefixes)
- **Output**: Prints list of matching sentences to console
- **Example**: `autoComplete.discover("I love");` finds all sentences starting with "I love"
- **Complexity**: O(P + N) where P is prefix length and N is number of results

## Performance & Complexity

### Time Complexity
- **Insert**: O(L) where L is the sentence length in words
- **Discover**: O(P + N) where P is prefix length and N is number of matching completions
- **Space**: O(T) where T is the total number of unique word sequences

### Optimizations ✅

| Feature | Implementation | Benefit |
|---------|---------------|---------|
| Child Lookup | **HashMap** | O(1) vs O(C) linear search |
| Case Handling | **Lowercase normalization** | Consistent matching |
| Prefix Matching | **Multi-word support** | Flexible query capability |
| Memory Usage | **Shared prefixes** | Efficient storage |

## How It Works

### Insertion Process
1. **Input normalization**: Convert sentence to lowercase
2. **Word splitting**: Split sentence into individual words
3. **Trie traversal**: Navigate/create nodes for each word in sequence
4. **Path creation**: Build complete path from root to leaf

### Discovery Process
1. **Prefix parsing**: Split search prefix into words
2. **Trie navigation**: Follow prefix path in the trie
3. **Subtree traversal**: Recursively collect all completions from matching node
4. **Result formatting**: Combine prefix with found completions

## Data Structure

```
Root (HashMap)
├── "i" → Node
│   └── children (HashMap)
│       ├── "love" → Node
│       │   └── children (HashMap)
│       │       ├── "programming" → Node (leaf)
│       │       ├── "ice" → Node
│       │       │   └── children (HashMap)
│       │       │       └── "cream" → Node (leaf)
│       │       └── "chocolate" → Node
│       │           └── children (HashMap)
│       │               └── "cake" → Node (leaf)
│       ├── "want" → Node
│       │   └── children (HashMap)
│       │       ├── "to" → Node
│       │       │   └── children (HashMap)
│       │       │       ├── "travel" → Node (leaf)
│       │       │       └── "learn" → Node
│       │       │           └── children (HashMap)
│       │       │               └── "java" → Node (leaf)
│       │       └── "pizza" → Node
│       │           └── children (HashMap)
│       │               └── "for" → Node
│       │                   └── children (HashMap)
│       │                       └── "dinner" → Node (leaf)
│       └── "am" → Node
│           └── children (HashMap)
│               ├── "learning" → Node
│               │   └── children (HashMap)
│               │       └── "algorithms" → Node (leaf)
│               └── "happy" → Node
│                   └── children (HashMap)
│                       └── "today" → Node (leaf)
└── "hello" → Node
    └── children (HashMap)
        ├── "world" → Node
        │   └── children (HashMap)
        │       └── "how" → Node
        │           └── children (HashMap)
        │               └── "are" → Node
        │                   └── children (HashMap)
        │                       └── "you" → Node (leaf)
        └── "there" → Node
            └── children (HashMap)
                └── "friend" → Node (leaf)
```

## Example Usage & Output

### Sample Data Categories
The implementation includes comprehensive test data across multiple categories:

**Personal Expressions**
- "I love..." (programming, ice cream, chocolate cake, etc.)
- "I want..." (to travel, to learn Java, pizza for dinner, etc.)
- "I am..." (learning algorithms, happy today, coding right now, etc.)
- "I think..." (this is awesome, programming is fun, etc.)

**Questions & Interactions**
- "How..." (are you doing, can I help, long will this take, etc.)
- "What..." (is your name, time is it, do you think, etc.)
- "Where..." (is the library, are you going, can I find help, etc.)
- "When..." (will this be ready, can we start, did you arrive, etc.)

**Greetings & Daily Life**
- "Hello..." (world, there friend, everyone welcome, etc.)
- "The..." (weather is nice, cat is sleeping, sun is shining, etc.)
- "Today..." / "Tomorrow..." / "Life..." / "Love..." expressions

### Sample Output
```java
// Input: autoComplete.discover("i love");
// Output: 
[i love programming, i love ice cream, i love chocolate cake, i love sunny days, 
 i love winter snow, i love playing guitar, i love watching movies, i love reading novels, 
 i love cooking pasta, i love morning coffee, i love my mom yay, i love my pops]

// Input: autoComplete.discover("hello");
// Output:
[hello world how are you, hello there friend, hello everyone welcome, 
 hello beautiful morning, hello my dear friend, hello from the other side, 
 hello sunshine good morning, hello stranger nice day, hello again old friend, 
 hello lovely people]
```

## Advanced Features

### Case Insensitive Matching
```java
autoComplete.insert("I LOVE UPPERCASE");
autoComplete.insert("i love lowercase"); 
autoComplete.insert("I Love Mixed Case");
autoComplete.discover("i love"); // Finds all three variants
```

### Multi-word Prefix Support
```java
autoComplete.discover("i want to");     // Finds "i want to travel", "i want to learn java", etc.
autoComplete.discover("hello there");  // Finds "hello there friend"
autoComplete.discover("the weather");  // Finds "the weather is nice today", "the weather is terrible"
```

### Comprehensive Coverage
- **200+ sample sentences** across diverse topics
- **Multiple prefix patterns** (I, Hello, The, How, What, etc.)
- **Various sentence structures** and lengths
- **Real-world conversational data**

## Performance Characteristics

### Scalability
- **Memory**: Efficient sharing of common prefixes reduces storage overhead
- **Speed**: HashMap-based lookups provide consistent O(1) child access
- **Flexibility**: Supports arbitrary prefix lengths without performance degradation

### Optimization Techniques
- **Lowercase normalization**: Eliminates case sensitivity issues
- **Recursive traversal**: Efficient depth-first search for completions
- **StringBuilder usage**: Minimizes string concatenation overhead
- **HashMap storage**: O(1) average case for node lookups

## Requirements

- **Java 8 or higher**
- **No external dependencies**
- **Minimum 256MB heap space** for large datasets

## Testing

The main method includes comprehensive test data with:
- **100+ "I" prefix variations** across different sentence patterns
- **Multiple question word patterns** (How, What, Where, When, Who, Why)
- **Common conversation starters** (Hello, Today, Tomorrow, Life, Love)
- **Technical content** (Programming, Learning related phrases)
- **Case sensitivity tests** (UPPERCASE, lowercase, Mixed Case)

## License

MIT License - feel free to use and modify as needed.
