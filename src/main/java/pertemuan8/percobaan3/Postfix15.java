package pertemuan8.percobaan3;

public class Postfix15 {
    int n;
    int top;
    char[] stack;

    public Postfix15(int total) {
        this.n = total;
        this.top = -1;
        this.stack = new char[n];
        push('(');
    }

    public void push(char c) {
        stack[++top] = c;
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9') || (c == ' ' || c == '.')
        );
    }

    public boolean isOperator(char c) {
        return switch (c) {
            case '^', '%', '/', '*', '-', '+' -> true;
            default -> false;
        };
    }

    public int derajat(char c) {
        return switch (c) {
            case '^' -> 3;
            case '*', '/', '%' -> 2;
            case '+', '-' -> 1;
            default -> 0;
        };
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (isOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
