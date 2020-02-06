


public class NumberUtilities {

    public static String getRange(int stop) {
        String myConcat = "";
        for(int i = 0; i < stop; i++){
            myConcat += i;
        }
        return myConcat;
    }

    public static String getRange(int start, int stop) {
        String myConcat = "";
        for(int i = start; i < stop; i++){
            myConcat += i;
        }
        return myConcat;
    }


    public static String getRange(int start, int stop, int step) {
        String myConcat = "";
        for(int i = start; i < stop; i+=step){
            myConcat += i;
        }
        return myConcat;
    }

    public static String getEvenNumbers(int start, int stop) {
        String myConcat = "";
        for(int i = start; i < stop; i++){
            if(i%2==0){
            myConcat += i;
        }
        }
        return myConcat;
    }


    public static String getOddNumbers(int start, int stop) {
        String myConcat = "";
        for(int i = start; i < stop; i++){
            if(i%2!=0){
                myConcat += i;
        }

        }
        return myConcat;
    }
//Math.pow(4,2);

    public static String getExponentiations(int start, int stop, int exponent) {
        String myConcat = "";
        for(int i = start; i <= stop; i++){
            
            myConcat += (int)Math.pow(i,exponent);
        
        }
        return myConcat;
    }
}
