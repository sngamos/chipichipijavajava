package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaseInteger {

    private String representation;
    private int base;

    private int[] digits;
    private int decimalValue;

    BaseInteger( String representation, int base){
        this.representation = deleteSpaces(representation);
        this.base = base;
        convertRepresentationToArray();
        setDecimalValue();
    }


    private void convertRepresentationToArray(){
        String[] strArr = representation.split(",");
        digits = new int[strArr.length];
        for (int i=0; i<strArr.length; i++) {
            digits[i] = Integer.valueOf(strArr[i]);
        }
    }

    private void setDecimalValue(){
        int total = 0;
        for(int i = 0; i < digits.length; i++){
            int position = digits.length - i - 1;
            total = total + digits[position]* (int) Math.pow( base, i);
        }
        this.decimalValue = total;
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public String getDigitsString(){
        return Arrays.toString(digits);
    }


    public BaseInteger add(BaseInteger other, int base){
        int sumThis = this.getDecimalValue();
        int sumOther = other.getDecimalValue();
        String sThis = this.convertBase(sumThis+sumOther, base);

        BaseInteger newBase = new BaseInteger(sThis, base);

        return newBase;
    }

    private String convertBase(int decimalValue, int base){
        int quotient = decimalValue / base;
        int remainder = decimalValue%base;
        String output = "" + remainder;

        while (quotient != 0) {
            remainder = quotient % base;
            quotient = quotient / base;
            output += "," + remainder;

        }

        return output;
    }

    private String deleteSpaces( String representation){
        String[] tmp = representation.split(" ");
        String out = "";
        for (String s: tmp) {
            out += s;
        }

        return out;
    }

    @Override
    public String toString() {
        return representation + " Base " + base;
    }
}
