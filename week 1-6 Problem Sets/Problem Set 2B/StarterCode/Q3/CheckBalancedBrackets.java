//import CustomStack;
//import StackImpl;

public class CheckBalancedBrackets {

    public static void main(String[] args) {

        System.out.println(isOpenBracket('('));
        System.out.println( isOpenBracket('a'));
        System.out.println(isCloseBracket(']'));
        System.out.println(isCloseBracket('a'));
        System.out.println( isMatchBracket('(',')'));
        System.out.println( isMatchBracket('a','a'));
        System.out.println(isBalancedBrackets("()[]()"));
        System.out.println(isBalancedBrackets("([]())"));
    }

    public static boolean isBalancedBrackets( String expression ){
        return true;
    }

    public static boolean isOpenBracket( char c){
        String brackets = "({[";
        return true;
    }

    public static boolean isCloseBracket(char c){
        String brackets = ")}]";
        return true;
    }

    public static boolean isMatchBracket(char c1, char c2){
        return true;
    }
}

