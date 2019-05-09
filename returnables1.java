import java.util.Scanner;

class Main {
 public static void main(String[] args) {
 Scanner scnr = new Scanner(System.in);
      
  String eventType;
  String mealSuggestion;
  int partySize;
  String preparationSuggestion;
 String result;
  
 System.out.println("Is your event casual, semi-formal, or formal?");
 eventType = scnr.next().toLowerCase();
//i'd like to make it so they dont need to use the - in semi-formal. if user input vaires i'd liketo reformat it here, and then maybe that means putting an OR statement in the else if statement?

if (eventType.equals("casual")) {
    mealSuggestion = "sandwiches";
  }
  else if (eventType.equals("semi-formal")) {
    mealSuggestion = "fried chicken";
  }
  else if (eventType.equals("formal")) {
    mealSuggestion = "chicken parmesan";
  }
 else {
   mealSuggestion = "wrong input";
 }

 System.out.println("How many guests are attending?");
  partySize = scnr.nextInt();

if (partySize == 1) {
 	preparationSuggestion = "in the microwave";
   }
   else if ((partySize >= 2) && (partySize <= 12)) {
 	preparationSuggestion = "in your kitchen";
   }
   else if (partySize >= 13) {
 	preparationSuggestion = "by a caterer";
   }
  else {
    preparationSuggestion = "wrong input";
  }

 result = ("Since you're hosting a " + eventType + " event for " + partySize + " participants, your should serve " + mealSuggestion + " prepared " + preparationSuggestion + ".");   
   System.out.println(result);
 }
}



