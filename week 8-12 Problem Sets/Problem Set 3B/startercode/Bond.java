
/* ATTENTION ------------------------
please put in your own package statement to get it to work in your android studio project 
Easy way is to just copy-and-paste the code below to the android-generated file
do not submit the code with the package statement to vocareum 
ATTENTION --------
*/

public class Bond {

    private double sellingPrice;
    private double faceValue;
    private double interestPayment;
    private double duration;

    private YieldCalculation yieldCalculation;

    private Bond (double sellingPrice, double faceValue, double interestPayment, double duration){
        this.sellingPrice = sellingPrice;
        this.faceValue = faceValue;
        this.interestPayment = interestPayment;
        this.duration = duration;
    }

}
