package enumuse;

/**
 * Created by PIIT_NYA on 12/11/2016.
 */
public class ConvertStringMonthToNumericMonth {
    Month month;
    public ConvertStringMonthToNumericMonth(Month month){
      this.month = month;
    }

    public int convertToNumeric(){
        int numericMonth = 0;
        switch(month){

            case JANUARY:
                numericMonth = 1;
                break;
            case FEBRUARY:
                numericMonth = 2;
                break;
            default:
                numericMonth = 0;
                break;
        }
        return numericMonth;
    }
}
