package enumuse;

/**
 * Created by PIIT_NYA on 12/11/2016.
 */
public class TestMonthConversion {
    public static void main(String[] args) {
        ConvertStringMonthToNumericMonth convert = new ConvertStringMonthToNumericMonth(Month.FEBRUARY);
        int month = convert.convertToNumeric();
        System.out.println(month);
    }
}
