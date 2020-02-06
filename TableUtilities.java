 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
        
    }
//1 |  2 |  3 |  4 |
//String.format("%-" + n + "s", s)
    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
                 String myConcat = "";
for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                    
                    if((i*j <= 9)){
                    myConcat += "  "+i*j + " |";
                    } 
                    else if((i*j <= 99)){
                    myConcat += " "+i*j + " |";
                    } 
                    else {
                    myConcat += ""+i*j + " |";
                    }
                    
                    
                    
                
                
               
            }
            myConcat += "\n";
        }         
        return myConcat;
    }
}
