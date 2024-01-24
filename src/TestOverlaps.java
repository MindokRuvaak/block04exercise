public class TestOverlaps {
    public static void main(String[] args){
        // Step 1b: Note the static and dynamic types of these variables
        // static and dynamic types are same for all three
        Square square       = new Square(1,1); 
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle   = new Triangle(1,3);

        // Step 1c: Predict what the result of these method calls will be.
        //   Fill in the blanks in the comment for each line before running the program.
        square.overlaps(triangle);      // polygon.overlaps:square{} vs triangle{}
        square.overlaps(square);        // polygon.overlaps:square{} vs square{}
        triangle.overlaps(rectangle);   // polygon.overlaps:triangle{} vs rectangle{}
        triangle.overlaps(triangle);    // polygon.overlaps:triangle{} vs triangle{}
//all correct
        // Step 2b: After you have uncommented all three overridden implementations
        //   of the method 'overlaps' in the subclasses, as per step 2a,
        //   again predict the result of the same method calls above.
        //   Fill in the blanks below before running the program.
        // square.overlaps:square{} vs triangle{}
        // square.overlaps:square{} vs square}
        // triangle.overlaps:triangle{} vs rectangle{}
        // triangle.overlaps:triangle{} vs triangle{}
//all correct

        // Step 3: Now we introduce a variable with static type Polygon. What will
        //   the results be this time? Fill in the blanks as before, then uncomment all
        //   the lines below (mark all the lines and choose
        //           Code -> Comment with Block Comment
        //   from the top IntelliJ menu.
        //   You can comment out the lines from above (10-13) using the same command.
        //   Then run the program again, and see if your predictions were correct.
        //   Can you explain these outputs in terms of static and dynamic types?
        System.out.println("\n\n");
        Polygon polyTriangle = new Triangle(1,4);

        square.overlaps(polyTriangle);          // square.overlaps:square{} vs triangle{}
        triangle.overlaps(polyTriangle);        // triangle.overlaps:triangle{} vs triangle{}
        polyTriangle.overlaps(triangle);        // triangle.overlaps:triangle{} vs triangle{}
        polyTriangle.overlaps(polyTriangle);    // triangle.overlaps:triangle{} vs triangle{}
        triangle.overlaps(triangle);            // triangle.overlaps:triangle{} vs triangle{}
       

        // Step 4b: After you have uncommented the overloaded declaration and
        //   implementation of the method 'overlaps' in the Triangle subclass,
        //   as per step 4a, again predict the output of the five lines above.
        //   Then run the program and see if your predictions were correct.
        //   Can you still explain the outputs in terms of static and dynamic types?
        // square.overlaps:square{} vs triangle{}
        // triangle.overlaps:trianle{} vs trianle{}
        // triangle.overlaps:trianle{} vs trianle{}
        // triangle.overlaps:trianle{} vs trianle{}
        // triangle2.overlaps:trianle{} vs trianle{}

    }//main

}//TestOverlaps
