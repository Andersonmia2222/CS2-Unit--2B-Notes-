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

   } // end main method
} // end class

