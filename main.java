import java.util.*;

class Main {
    public static void main(String[] args) {
        AutoComplete autoComplete = new AutoComplete();
        autoComplete.insert("Hi my name is avi");
        autoComplete.insert("I love my mom yay");
        autoComplete.insert("I love my pops");
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
    
    AutoComplete() {
        map = new HashMap<>();
    }
    
    void insert(String line) {
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
    }

    void discover() {
            Node currNode = map.get("i");
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