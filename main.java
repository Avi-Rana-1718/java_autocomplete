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
    public ArrayList<Node> children;
    
    Node(String term) {
        this.term = term;
        children = new ArrayList<>();
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
            if(i==0 && map.containsKey(words[i])) {
                currNode=map.get(words[i]);
                continue;
            } else if(i==0) {
                currNode=new Node(words[i]);
                map.put(words[i], currNode);
                continue;
            }
            
            boolean wordFound = false;
            for(Node node : currNode.children) {
                if(node.term.equals(words[i])) {
                    wordFound=true;
                    currNode=node;
                    break;
                }
            }
            
            if(wordFound==false) {
                Node nNode = new Node(words[i]);
                currNode.children.add(nNode);
                currNode=nNode;
            }
        }
    }

    void discover() {
            Node currNode = map.get("I");
            List<String> list = new ArrayList<>();
            helper(currNode, list, new StringBuilder());
            System.out.println(list.toString());
    }
    
    void helper(Node node, List<String> list, StringBuilder str) {
        str.append(node.term + " ");
                
        if(node.children.size()==0) {
           // System.out.println(str.toString());
            list.add(str.toString());
            return;
        }
        
        for(Node currNode : node.children) {
            helper(currNode, list, new StringBuilder(str));
        }
    }
}