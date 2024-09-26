class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Push opening brackets onto the stack
            if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // Check for matching closing brackets
            else if(currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If stack is empty or the top doesn't match the corresponding opening bracket
                if(stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.peek();
                
                if((currentChar == ')' && top == '(') ||
                   (currentChar == '}' && top == '{') ||
                   (currentChar == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}

