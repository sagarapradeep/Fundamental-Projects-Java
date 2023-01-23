import java.util.Arrays;

public class TableView {
    /*data length and number of columns can change according to the user preference */
    public static void main(String[] args) {

        /*Data sets for represent in table*/
        String[][]data={
                {"112","Kasun","23542"},
                {"1234","Kasun","34535"},
                {"1979","Kasun","345345"},
                {"266","Nuwan","345345"},
                {"3666","Amara","457523412-2345"},
                {"43456","Supun","345353566"},
                {"4567","Supun","56745885"},
        };
        /*Table topics*/
        String[] topics = new String[]{"ID", "Names","Contact"};

        printTableCommand(topics, data);
    }

    /*Command execution function*/
    public static void printTableCommand(String[] topics, String[][] data)
    {
        int[] maxColumnLengths = maxColumnLength(topics, data);         //call this to take the maximum width of each column

        printTable(topics, data, maxColumnLengths);                 //call this to print data in table

    }

    public static void printTable(String[] topics, String[][] data,int[] maxColumnLengths) {
        int numOfcolumns = topics.length;               //assign columns and raws
        int numOfraws=data.length;
        int l=0;

        for (int i=0;i<numOfraws+3;i++) {       //this outer loop to run for raws(+3 for additional dotted lines)
            if (i == 0 || i == 2 || i == numOfraws + 2) {
                for (int j = 0; j < numOfcolumns; j++) {        //this inner loop to print columns(additional dotted lines)
                    System.out.printf("%s%s", "+", ("-").repeat(maxColumnLengths[j]));
                }
                System.out.print("+");          //end + marks for each line
                System.out.println();               //new line for next data set
            } else {
                if (i == 1) {                   //print topic words on the top
                    for (int j = 0; j < numOfcolumns; j++) {
                        System.out.printf("|%-".concat(Integer.toString(maxColumnLengths[j]) + "s"), topics[j]);
                    }
                    System.out.print("|");
                    System.out.println();
                } else {                        //data values
                    for (int j = 0; j < numOfcolumns; j++) {
                        System.out.printf("|%-".concat(Integer.toString(maxColumnLengths[j])+"s"),data[l][j]);
                    }
                    System.out.print("|");
                    System.out.println();
                    ++l;            //this variable to identify what is the exact index of 2D array

                }
            }
        }
    }

    public static int[] maxColumnLength(String[] topics, String[][] data) {
        int[] maxColumnLength = new int[topics.length];         //creat new array for hold column length
        for (int i = 0; i < topics.length; i++) {                //initialize column lengths for topic length values
            maxColumnLength[i] = (topics[i].length()+1);
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < topics.length; j++) {
                if (maxColumnLength[j] < (data[i][j].length() + 1)) {   //if data lengths are higher than topic lengths initialize value
                    maxColumnLength[j] = (data[i][j].length() + 1);
                }
            }

        }
        return maxColumnLength;         //return array contains max column widths

    }

}
