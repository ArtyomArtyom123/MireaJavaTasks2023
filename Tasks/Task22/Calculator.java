import java.util.Stack;
public class Calculator {
    public static Double calculate(String string) throws Exception{
        Stack<Double> calc = new Stack<>();
        double n;
        double a;
        double b;
        for (String s: string.split(" ")){
            switch(s){
                case "+":
                    if (calc.size() >= 2){
                        a = calc.pop();
                        b = calc.pop();
                        calc.push(a + b);
                    }
                    else throw new Exception("Incorrect input!");
                    break;
                case "-":
                    if (calc.size() >= 2){
                        b = calc.pop();
                        a = calc.pop();
                        calc.push(a - b);
                    }
                    else throw new Exception("Incorrect input!");
                    break;
                case "*":
                    if (calc.size() >= 2){
                        a = calc.pop();
                        b = calc.pop();
                        calc.push(a * b);
                    }
                    else throw new Exception("Incorrect input!");
                    break;
                case "/":
                    if (calc.size() >= 2){
                        b = calc.pop();
                        a = calc.pop();
                        calc.push(a / b);
                    }
                    else throw new Exception("Incorrect input!");
                    break;
                default:
                    try {
                        n = Double.parseDouble(s);
                        calc.push(n);
                    } catch (NumberFormatException ex){
                        throw new Exception("Incorrect input!");
                    }
                    break;

            }
        }
        if (calc.size() == 1) {
            return calc.peek();
        }else throw new Exception("Incorrect input!");
    }


}
