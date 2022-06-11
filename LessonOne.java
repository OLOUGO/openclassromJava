public class LessonOne {
    
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;       
    
    
        int daysInWeek = 7;

         firstDay += daysInWeek;

         final int STARTINGDAY = firstDay;
        
        // Affiche le résultat 
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }  
    
}
