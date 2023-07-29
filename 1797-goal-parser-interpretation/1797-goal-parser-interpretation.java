class Solution {
    public String interpret(String command) {
       command = command.replace("()","o").replace("(al)","al");
       return command;
    }
}