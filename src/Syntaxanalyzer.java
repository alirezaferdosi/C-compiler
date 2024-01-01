import java.util.Stack;

public class Syntaxanalyzer {
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_w = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_b = "\u001B[41m";

    private lexicalanalyzer object = new lexicalanalyzer();
    private Stack<Character> stack = new Stack<>();
    public void parser(String[][] grammar,String input){

        stack.push('$');
        stack.push('S');
        char[] ch = input.toCharArray();

        //flag for while loop
        boolean flag = true;

        //index for input string
        int index = 0;

        while(flag){

            if (stack.empty()){
                System.out.println("Compiled successfully .");
                System.exit(0);
            }

            if(Character.isUpperCase(stack.peek()) || stack.peek().equals('?') || stack.peek().equals('#') || stack.peek().equals('^')){

                for(int i=0 ; i<grammar.length ; i++){

                    if(grammar[i][0].equals( String.valueOf(stack.peek())) && grammar[i][1].equals( String.valueOf(ch[index]) )){

                        char[] temp = grammar[i][2].toCharArray();

                        stack.pop();

                        if(!grammar[i][2].equals(" ")) {
                            for (int j = temp.length - 1; j >= 0; j--) {
                                stack.push(temp[j]);
                            }
                        }

                        flag = true;
                        break;
                    }
                    else{
//                        System.out.println(ANSI_b +"----------Your program has grammatical error !!!" + ANSI_w);
//                        System.exit(0);
                        flag = false;
                    }
                }


            } else if (stack.peek() == ch[index]) {
//                String x ="";
//                System.out.println("stack :   "+stack);

                stack.pop();
//                for(int i=index+1;i< ch.length ;i++)  x +=ch[i];
//                System.out.println(x);
//                System.out.println(ch[index]);
                index++;



            }
            else {
                System.out.println(ANSI_b +"Your program has grammatical error !!!" + ANSI_w);
                System.exit(0);
                flag = false;
            }
        }
        System.out.println(ANSI_b +"Your program has grammatical error !!!" + ANSI_w);
    }
}
