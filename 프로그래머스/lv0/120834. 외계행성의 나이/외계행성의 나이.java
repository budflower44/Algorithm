class Solution {
    public String solution(int age) {
        String answer = "";
        answer = Integer.toString(age).replaceAll("[0-9]", "[a-z]");
        return answer;
    }
}