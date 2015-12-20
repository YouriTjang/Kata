/**
 * Created by youritjang on 20-12-15.
 */
public class RomanNumbers {
    public enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        M(1000);

        private final int arabicValue;

        Roman(int arabicValue){
            this.arabicValue = arabicValue;
        }
    };


    public int toArabic(String rn) {
        int result = 0;
        Roman previous = Roman.I;
        int len = rn.length();

        for(int i = 0; i < len; i++){
            String lastRoman = rn.substring(rn.length()-1, rn.length());
            Roman current = Roman.valueOf(lastRoman);

            //if current < previous, do minus
            int multiplier = (current.compareTo(previous) < 0)?-1:1;

            result += multiplier * current.arabicValue;

            previous = current;
            rn = rn.substring(0, rn.length()-1);
        }
        return result;
    }
}
