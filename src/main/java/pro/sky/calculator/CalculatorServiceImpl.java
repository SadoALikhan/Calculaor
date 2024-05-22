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
}
