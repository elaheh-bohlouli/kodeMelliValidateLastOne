import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class ValidateConditions {

    public void validateNumber(String givenNumber) throws ValiditationException {


        if (!StringUtils.isNumeric(givenNumber)) {
            throw new ValiditationException("الگوی کد ملی فقط آعداد صحیح را می پذیرد.");
        } else if (givenNumber.length() > 10) {
            throw new ValiditationException("تعداد اعداد ورودی بیش از ده می باشد.");
        } else if (givenNumber.length() < 10) {
            givenNumber = StringUtils.leftPad(givenNumber, 10, "0");
        }

        RepetitiveNumberCalculation repetitiveNumberCalculation = new RepetitiveNumberCalculation();
        int i = repetitiveNumberCalculation.repetitiveNumber(givenNumber);
        if (i == givenNumber.length()) {
            throw new ValiditationException("تمام ارقام وارد شده تکراری می باشند.");
        }
        DigitNumberCalculation d = new DigitNumberCalculation();
        if (d.digitNumberCalculate(givenNumber))
            System.out.println("کد ملی صحیح می باشد.");
        else throw new ValiditationException("بنا به محاسبات کد ملی صحیح نمی باشد.");
        }
}
