public class TimeConversion{
    static String timeConversion(String s) {
        String hourIn = s.substring(0,2);
        String minIn = s.substring(3,5);
        String secIn = s.substring(6,8);
        String time = s.substring(8,10);
 
         if((hourIn.equals("12")) && (time.equals("AM"))) return ("00:" + minIn + ":" + secIn);
         else if(!(hourIn.equals("12"))&&(time.equals("PM"))){
             int hour = Integer.parseInt(hourIn);
             hour += 12;
             return (hour + ":" + minIn + ":" + secIn);
         }
         else{
             return (hourIn + ":" + minIn + ":" + secIn);
         }
 
     }
}