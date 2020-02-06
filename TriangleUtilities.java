 

public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
                String myConcat = "";

        for(int i = 1; i <= numberOfStars; i++){
            myConcat += "*";
        }
        return myConcat;
    }
    
    public static String getTriangle(int numberOfRows) {
                 String myConcat = "";

        for(int i = 1; i <= numberOfRows; i++){
            
            myConcat += getRow(i) + "\n";
        }
        return myConcat;
    }


    public static String getSmallTriangle() {
        String myConcat = "";
        
        myConcat += getTriangle(4);
    
        return myConcat;
    }

    public static String getLargeTriangle() {
         String myConcat = "";
        
        myConcat += getTriangle(9);
    
        return myConcat;
    }
}
