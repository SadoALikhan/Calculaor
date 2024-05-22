package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String answerHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(double num1, double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(double num1, double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(double num1, double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(double num1, double num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
