public class Main {

   public static void main(String []args) {



// while loops repeat instructions in the loop body
//as long as a certain condition is true

// COUNTER-CONROLED while loop
// STEP 1: Initialize control variable 
int count = 2;
// STEP 2: Test a condition 
while( count <= 10 ){
// loop body executes while (count <= 10) is true 
System.out.println( count ); 
// step 3: Change the variable 
// (do this after the statments you want to repeat)
count ++;
}


// for(initialize; test condition; change)
 for ( int i = 5; i <= 27; i++) {
System.out.println(i);

 }
// modify the change step to skip certain numbers 

for (int i = 0; i<= 10; i+=2) {

   System.out.println(i); 
}
// watch intial values and operator 

for (int i = 0; i<11; i+=2 ) {
   System.out.println(i);
}
// this loop did the same thing as the loop above it!
// decrementing for loops are just like counting backwards
for (int i= 10; i> 0; i--  ) {

   System.out.println(i);
// print a special message when i is 1 

if (i == 1) {

   System.out.println("Blast off");
}
}

// LOOOPS and STRINGS 
// USE A LOOP TO iterate through each charcter 
// in a string object(transversal)

// use a FOR loop to visit every char 

String name = "Mia";
int finalIndex = name.length() -1;
System.out.println("finalIndex" + finalIndex );

//build a reversed String using loop
String reversed =""; 
for (int i = finalIndex; i>= 0; i--) {
System.out,println("Current Index:" + i); 
String currentLetter = name.substring(i, i +1); //char at index i
System.out.println("Current Letter: " + currentLetter);
reversed += currentLetter; // add char to reversed name 

}
System.out.println("Your name backwards:" + reversed); 
// while loop can handle tasks other than when you know 
// how many times to iterate 
// EX) find and replace characters until all are replaced 




   } // end main method
} // end class



