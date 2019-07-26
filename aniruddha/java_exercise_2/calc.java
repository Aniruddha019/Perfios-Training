package calculator;
import java.util.*;
import java.util.regex.*;

public class calc {

    private List<Float> variablesArray(String expression){
        List<Float> vars = new LinkedList<Float>();
        Pattern p = Pattern.compile("\\s*[0-9][0-9]*");
        Matcher m = p.matcher(expression);
        while (m.find()) {
            String s = m.group().trim();
            try {
                Float val = Float.parseFloat(s);
                vars.add(val);
            }
            catch(NumberFormatException num) {
            }
        }
        return vars;
    }

    private List<Character> operatorsArray(String expression){
        List<Character> vars = new LinkedList<Character>();
        Pattern p = Pattern.compile("[+,*,/,-]");
        Matcher m = p.matcher(expression);
        while (m.find()) {
            String s = m.group().trim();
            try {
                Character val = m.group().charAt(0);
                vars.add(val);
            }
            catch(Exception num) {
                System.out.println("inside exception");
            }
        }
        return vars;
    }

    private float calc_intermediate_result(float num1, float num2, char operator ) {
        float inter_result = 0;
        if(operator=='/') {
            inter_result=num1/num2;
        }
        else if(operator=='*') {
            inter_result=num1*num2;
        }
        else if(operator=='+') {
            inter_result=num1+num2;
        }
        else if(operator=='-') {
            inter_result=num1-num2;
        }
        return inter_result;
    }

    private float evaluate(List<Float> vars, List<Character> operators) {
        List<Character> bodmas = new ArrayList<Character>();
        bodmas.add('/');
        bodmas.add('*');
        bodmas.add('+');
        bodmas.add('-');
        for(char op : bodmas) {
            for(int i=0;i< operators.size();i++) {
                char operator=operators.get(i);
                if(operator == op) {
                    float inter_result = calc_intermediate_result(vars.get(i), vars.get(i+1), operator);
                    vars.remove(i+1);
                    vars.set(i, inter_result);
                    operators.remove(i);
                    i--;
                }
            }
        }

        return vars.get(0);
    }

    private boolean is_valid_input(int vars_size, int operators_size) {
        if(!(vars_size == (operators_size + 1))) {
            return false;
        }
        return true;
    }

    private boolean is_proper_format(String expression) {
        Pattern p1 = Pattern.compile("[a-zA-Z]");
        Matcher m1 = p1.matcher(expression);
        while (m1.find())
            return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        calc c = new calc();
        System.out.println("Calculator application - - - - - ");
        String status = "start";
        do {
            System.out.println("Enter expresion separated by whitespace - - -  ");
            String expression = s.nextLine();
            if(!(c.is_proper_format(expression))) {
                System.out.println("Not valid format =----");
                continue;
            }
            List<Float> vars = c.variablesArray(expression);
            List<Character> operators = c.operatorsArray(expression);
            if(!c.is_valid_input(vars.size(), operators.size())) {
                System.out.println("Not valid Input =----");
                continue;
            }
            float result = c.evaluate(vars,operators);
            System.out.println("result is :"+result);
            System.out.println("Type quit to exit or c to continue .......... ");
            status = s.next();
        }while(!status.equals("quit"));
    }
}
