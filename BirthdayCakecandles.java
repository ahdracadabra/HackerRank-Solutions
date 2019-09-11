public class BirthdayCakeCandles{
    static int birthdayCakeCandles(int[] ar) {
        int number = 0;
        int tallest = 0;
        for(int candle: ar){
            if(candle > tallest){
                tallest = candle;
                number = 1;
            }
            else if(candle == tallest) number += 1;
        }
        return number;
    }
}