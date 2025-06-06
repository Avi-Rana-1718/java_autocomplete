import java.util.*;

class Main {
    public static void main(String[] args) {
        AutoComplete autoComplete = new AutoComplete();

         // Original test data
        autoComplete.insert("Hi my name is avi");
        autoComplete.insert("I love my mom yay");
        autoComplete.insert("I love my pops");
        
        // Extended test data for "I" prefix
        autoComplete.insert("I love programming");
        autoComplete.insert("I love ice cream");
        autoComplete.insert("I love chocolate cake");
        autoComplete.insert("I love sunny days");
        autoComplete.insert("I love winter snow");
        autoComplete.insert("I love playing guitar");
        autoComplete.insert("I love watching movies");
        autoComplete.insert("I love reading novels");
        autoComplete.insert("I love cooking pasta");
        autoComplete.insert("I love morning coffee");
        autoComplete.insert("I like pizza");
        autoComplete.insert("I like movies");
        autoComplete.insert("I like books about science");
        autoComplete.insert("I like dancing salsa");
        autoComplete.insert("I like hiking mountains");
        autoComplete.insert("I like swimming pools");
        autoComplete.insert("I like playing tennis");
        autoComplete.insert("I like eating sushi");
        autoComplete.insert("I like learning languages");
        autoComplete.insert("I like solving puzzles");
        autoComplete.insert("I want to travel");
        autoComplete.insert("I want to learn Java");
        autoComplete.insert("I want pizza for dinner");
        autoComplete.insert("I want to visit Japan");
        autoComplete.insert("I want to buy a car");
        autoComplete.insert("I want to learn guitar");
        autoComplete.insert("I want to see the ocean");
        autoComplete.insert("I want to climb mountains");
        autoComplete.insert("I want to write a book");
        autoComplete.insert("I want to start a business");
        autoComplete.insert("I am learning algorithms");
        autoComplete.insert("I am happy today");
        autoComplete.insert("I am coding right now");
        autoComplete.insert("I am studying for exams");
        autoComplete.insert("I am working on projects");
        autoComplete.insert("I am reading a book");
        autoComplete.insert("I am watching Netflix");
        autoComplete.insert("I am cooking dinner");
        autoComplete.insert("I am feeling great");
        autoComplete.insert("I am excited about tomorrow");
        autoComplete.insert("I think this is awesome");
        autoComplete.insert("I think we should go");
        autoComplete.insert("I think programming is fun");
        autoComplete.insert("I think you are right");
        autoComplete.insert("I think we need more time");
        autoComplete.insert("I think this will work");
        autoComplete.insert("I think about the future");
        autoComplete.insert("I think cats are cute");
        autoComplete.insert("I need help with homework");
        autoComplete.insert("I need coffee badly");
        autoComplete.insert("I need to study more");
        autoComplete.insert("I need to call mom");
        autoComplete.insert("I need to buy groceries");
        autoComplete.insert("I need to finish this");
        autoComplete.insert("I need some fresh air");
        autoComplete.insert("I need to sleep early");
        autoComplete.insert("I can solve this problem");
        autoComplete.insert("I can help you");
        autoComplete.insert("I can code in Java");
        autoComplete.insert("I can speak three languages");
        autoComplete.insert("I can play the piano");
        autoComplete.insert("I can cook Italian food");
        autoComplete.insert("I can run five miles");
        autoComplete.insert("I can fix this bug");
        autoComplete.insert("I enjoy reading books");
        autoComplete.insert("I enjoy playing games");
        autoComplete.insert("I enjoy long walks");
        autoComplete.insert("I enjoy good conversations");
        autoComplete.insert("I enjoy sunny weekends");
        autoComplete.insert("I enjoy learning new things");
        autoComplete.insert("I enjoy helping others");
        autoComplete.insert("I wish I could fly");
        autoComplete.insert("I wish for world peace");
        autoComplete.insert("I wish to travel more");
        autoComplete.insert("I wish I had more time");
        autoComplete.insert("I hope everything goes well");
        autoComplete.insert("I hope to see you soon");
        autoComplete.insert("I hope the weather improves");
        autoComplete.insert("I believe in hard work");
        autoComplete.insert("I believe you can do it");
        autoComplete.insert("I believe in second chances");
        autoComplete.insert("I feel happy today");
        autoComplete.insert("I feel like dancing");
        autoComplete.insert("I feel grateful for everything");
        autoComplete.insert("I remember my childhood");
        autoComplete.insert("I remember that day clearly");
        autoComplete.insert("I understand your concern");
        autoComplete.insert("I understand the problem");
        autoComplete.insert("I appreciate your help");
        autoComplete.insert("I appreciate good food");
        autoComplete.insert("I wonder about the universe");
        autoComplete.insert("I wonder what happens next");
        autoComplete.insert("I decided to learn programming");
        autoComplete.insert("I decided to start exercising");
        autoComplete.insert("I promise to be better");
        autoComplete.insert("I promise to call you");
        autoComplete.insert("I learned something new today");
        autoComplete.insert("I learned to play chess");
        autoComplete.insert("I discovered a great restaurant");
        autoComplete.insert("I discovered this amazing book");
        autoComplete.insert("I created a new project");
        autoComplete.insert("I created this artwork");
        autoComplete.insert("I bought a new laptop");
        autoComplete.insert("I bought some fresh fruits");
        autoComplete.insert("I found a good solution");
        autoComplete.insert("I found my old photos");
        autoComplete.insert("I made a delicious cake");
        autoComplete.insert("I made new friends today");
        autoComplete.insert("I saw a beautiful sunset");
        autoComplete.insert("I saw an interesting movie");
        autoComplete.insert("I heard great news today");
        autoComplete.insert("I heard this song before");
        autoComplete.insert("I built a web application");
        autoComplete.insert("I built a treehouse");
        autoComplete.insert("I started learning Python");
        autoComplete.insert("I started a new hobby");
        autoComplete.insert("I finished my assignment");
        autoComplete.insert("I finished reading the book");
        
        // Test data for other prefixes - MASSIVE EXPANSION
        autoComplete.insert("Hello world how are you");
        autoComplete.insert("Hello there friend");
        autoComplete.insert("Hello everyone welcome");
        autoComplete.insert("Hello beautiful morning");
        autoComplete.insert("Hello my dear friend");
        autoComplete.insert("Hello from the other side");
        autoComplete.insert("Hello sunshine good morning");
        autoComplete.insert("Hello stranger nice day");
        autoComplete.insert("Hello again old friend");
        autoComplete.insert("Hello lovely people");
        
        autoComplete.insert("The weather is nice today");
        autoComplete.insert("The weather is terrible");
        autoComplete.insert("The cat is sleeping");
        autoComplete.insert("The cat is playing");
        autoComplete.insert("The sun is shining brightly");
        autoComplete.insert("The moon is full tonight");
        autoComplete.insert("The ocean waves are calming");
        autoComplete.insert("The mountain peak is visible");
        autoComplete.insert("The forest is quiet");
        autoComplete.insert("The city never sleeps");
        autoComplete.insert("The book was amazing");
        autoComplete.insert("The movie was fantastic");
        autoComplete.insert("The food tastes delicious");
        autoComplete.insert("The music sounds beautiful");
        autoComplete.insert("The flowers smell wonderful");
        autoComplete.insert("The dog is barking loudly");
        autoComplete.insert("The bird is singing sweetly");
        autoComplete.insert("The car is running smoothly");
        autoComplete.insert("The computer is processing data");
        autoComplete.insert("The phone is ringing constantly");
        
        autoComplete.insert("How are you doing today");
        autoComplete.insert("How are you feeling");
        autoComplete.insert("How can I help");
        autoComplete.insert("How do you solve this");
        autoComplete.insert("How about we go together");
        autoComplete.insert("How long will this take");
        autoComplete.insert("How much does it cost");
        autoComplete.insert("How often do you exercise");
        autoComplete.insert("How did you learn that");
        autoComplete.insert("How wonderful this day is");
        autoComplete.insert("How beautiful the sunset looks");
        autoComplete.insert("How amazing technology has become");
        autoComplete.insert("How quickly time passes by");
        autoComplete.insert("How interesting this book is");
        autoComplete.insert("How delicious this food tastes");
        
        autoComplete.insert("What is your name");
        autoComplete.insert("What is the weather");
        autoComplete.insert("What are you doing");
        autoComplete.insert("What time is it");
        autoComplete.insert("What do you think");
        autoComplete.insert("What should we eat");
        autoComplete.insert("What movie should we watch");
        autoComplete.insert("What book are you reading");
        autoComplete.insert("What music do you like");
        autoComplete.insert("What sport do you play");
        autoComplete.insert("What language are you learning");
        autoComplete.insert("What color is your car");
        autoComplete.insert("What animal is your favorite");
        autoComplete.insert("What season do you prefer");
        autoComplete.insert("What hobby keeps you busy");
        autoComplete.insert("What makes you happy");
        autoComplete.insert("What dreams do you have");
        autoComplete.insert("What goals are you pursuing");
        autoComplete.insert("What challenges face you");
        autoComplete.insert("What adventures await us");
        
        autoComplete.insert("Why is this happening");
        autoComplete.insert("Why do we need this");
        autoComplete.insert("Why are you here");
        autoComplete.insert("Why did you choose that");
        autoComplete.insert("Why does time fly so fast");
        autoComplete.insert("Why do birds sing");
        autoComplete.insert("Why is the sky blue");
        autoComplete.insert("Why do we dream");
        autoComplete.insert("Why is learning important");
        autoComplete.insert("Why do people travel");
        autoComplete.insert("Why is music so powerful");
        autoComplete.insert("Why do we need friends");
        autoComplete.insert("Why is family important");
        autoComplete.insert("Why should we exercise");
        autoComplete.insert("Why is reading beneficial");
        
        autoComplete.insert("Where is the library");
        autoComplete.insert("Where are you going");
        autoComplete.insert("Where can I find help");
        autoComplete.insert("Where did you buy that");
        autoComplete.insert("Where should we meet");
        autoComplete.insert("Where do you live");
        autoComplete.insert("Where is your favorite place");
        autoComplete.insert("Where do dreams come from");
        autoComplete.insert("Where can I learn programming");
        autoComplete.insert("Where does the river flow");
        autoComplete.insert("Where do the birds migrate");
        autoComplete.insert("Where is the nearest restaurant");
        autoComplete.insert("Where can I find good books");
        autoComplete.insert("Where should I start learning");
        autoComplete.insert("Where do you see yourself");
        
        autoComplete.insert("When will this be ready");
        autoComplete.insert("When can we start");
        autoComplete.insert("When did you arrive");
        autoComplete.insert("When is your birthday");
        autoComplete.insert("When will you visit");
        autoComplete.insert("When does the store open");
        autoComplete.insert("When should I call you");
        autoComplete.insert("When will spring arrive");
        autoComplete.insert("When did you learn that");
        autoComplete.insert("When will the project finish");
        autoComplete.insert("When can I see you");
        autoComplete.insert("When does the movie start");
        autoComplete.insert("When will you be free");
        autoComplete.insert("When should we leave");
        autoComplete.insert("When did time pass so quickly");
        
        autoComplete.insert("Who is your favorite author");
        autoComplete.insert("Who taught you programming");
        autoComplete.insert("Who will join us today");
        autoComplete.insert("Who can help with this");
        autoComplete.insert("Who makes the best pizza");
        autoComplete.insert("Who invented the computer");
        autoComplete.insert("Who wrote this beautiful song");
        autoComplete.insert("Who painted this masterpiece");
        autoComplete.insert("Who discovered this place");
        autoComplete.insert("Who inspired you the most");
        autoComplete.insert("Who do you admire");
        autoComplete.insert("Who makes you laugh");
        autoComplete.insert("Who do you trust");
        autoComplete.insert("Who shares your dreams");
        autoComplete.insert("Who brings you joy");
        
        autoComplete.insert("Today is a beautiful day");
        autoComplete.insert("Today we will learn something new");
        autoComplete.insert("Today I feel grateful");
        autoComplete.insert("Today brings new opportunities");
        autoComplete.insert("Today the sun shines bright");
        autoComplete.insert("Today we celebrate life");
        autoComplete.insert("Today I will code something amazing");
        autoComplete.insert("Today marks a new beginning");
        autoComplete.insert("Today I choose happiness");
        autoComplete.insert("Today we make progress");
        
        autoComplete.insert("Tomorrow will be better");
        autoComplete.insert("Tomorrow we start fresh");
        autoComplete.insert("Tomorrow brings new hope");
        autoComplete.insert("Tomorrow I will finish this");
        autoComplete.insert("Tomorrow we meet again");
        autoComplete.insert("Tomorrow the adventure begins");
        autoComplete.insert("Tomorrow holds great promise");
        autoComplete.insert("Tomorrow I will learn more");
        autoComplete.insert("Tomorrow we create something beautiful");
        autoComplete.insert("Tomorrow is full of possibilities");
        
        autoComplete.insert("Life is full of surprises");
        autoComplete.insert("Life is a beautiful journey");
        autoComplete.insert("Life teaches us many lessons");
        autoComplete.insert("Life is what we make it");
        autoComplete.insert("Life offers endless opportunities");
        autoComplete.insert("Life is about making connections");
        autoComplete.insert("Life brings joy and challenges");
        autoComplete.insert("Life is worth celebrating");
        autoComplete.insert("Life moves at its own pace");
        autoComplete.insert("Life is an amazing adventure");
        
        autoComplete.insert("Love makes everything better");
        autoComplete.insert("Love conquers all obstacles");
        autoComplete.insert("Love brings people together");
        autoComplete.insert("Love is the greatest gift");
        autoComplete.insert("Love makes life meaningful");
        autoComplete.insert("Love creates beautiful memories");
        autoComplete.insert("Love inspires us to grow");
        autoComplete.insert("Love heals all wounds");
        autoComplete.insert("Love transcends all boundaries");
        autoComplete.insert("Love makes the world brighter");
        
        autoComplete.insert("Programming is an art form");
        autoComplete.insert("Programming solves real problems");
        autoComplete.insert("Programming opens new doors");
        autoComplete.insert("Programming challenges the mind");
        autoComplete.insert("Programming creates digital magic");
        autoComplete.insert("Programming builds the future");
        autoComplete.insert("Programming connects the world");
        autoComplete.insert("Programming empowers creativity");
        autoComplete.insert("Programming transforms ideas into reality");
        autoComplete.insert("Programming is a superpower");
        
        autoComplete.insert("Learning never stops");
        autoComplete.insert("Learning opens new horizons");
        autoComplete.insert("Learning makes life interesting");
        autoComplete.insert("Learning builds confidence");
        autoComplete.insert("Learning creates opportunities");
        autoComplete.insert("Learning enriches the soul");
        autoComplete.insert("Learning connects us to others");
        autoComplete.insert("Learning transforms perspectives");
        autoComplete.insert("Learning makes us better");
        autoComplete.insert("Learning is a lifelong journey");
        
        // Case sensitivity test data
        autoComplete.insert("I LOVE UPPERCASE");
        autoComplete.insert("i love lowercase");
        autoComplete.insert("I Love Mixed Case");
        
        autoComplete.discover();
    }
}

class Node {
    public String term;
    public Map<String, Node> children;
    
    Node(String term) {
        this.term = term.toLowerCase();
        children = new HashMap<>();
    }
}

class AutoComplete {
    HashMap<String, Node> map;
    int size=0;
    
    AutoComplete() {
        map = new HashMap<>();
    }
    
    void insert(String line) {
        size++;
        String words[] = line.split(" ");
        Node currNode = null;
        
        for(int i=0;i<words.length;i++) {
            words[i]=words[i].toLowerCase();

            if(i==0 && map.containsKey(words[i])) {
                currNode=map.get(words[i]);
                continue;
            } else if(i==0) {
                currNode=new Node(words[i]);
                map.put(words[i], currNode);
                continue;
            }
            
            if(currNode.children.containsKey(words[i])) {
                currNode=currNode.children.get(words[i]);
            } else {
                Node nNode = new Node(words[i]);
                currNode.children.put(words[i], nNode);
                currNode=nNode;
            }
        }

        //System.out.println("Inserted successfully " + size);
    }

    void discover() {
            Node currNode = map.get("programming");
            List<String> list = new ArrayList<>();
            helper(currNode, list, new StringBuilder());
            System.out.println(list.toString());
    }
    
    void helper(Node node, List<String> list, StringBuilder str) {
        if(node.children.size()==0) {
            str.append(node.term);
            list.add(str.toString());
            return;
        }
        
        str.append(node.term + " ");
        
        for(Node currNode : node.children.values()) {
            helper(currNode, list, new StringBuilder(str));
        }
    }
}