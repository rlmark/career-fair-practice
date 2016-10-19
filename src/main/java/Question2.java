public class Question2 {

    public Boolean randomPredicate(Integer[] array, Integer maxValueDiff, Integer maxIndexDiff) {
        // iterate through the array of integers. [i] is going to be the first pointer
        for(int i = 0;  i < array.length; i ++){
            // to get at the next possible values in the array, we need a double loop.
            // [j] will be all subsequent indices in our array
            for(int j = i + 1; j < array.length; j ++){
                // Ok, so first I need to check if the distance between j and i is less than maxIndexDiff
                // and if it is, we need to proceed to the next test about value difference
                // neither of these statements are true, move on to the next [i]
                if( Math.abs(j - i) <= maxIndexDiff) {
                    if (Math.abs(array[i] - array[j]) <= maxValueDiff) {
                        // short circuit here
                        return true;
                    }
                }
            }// end of inner loop
        }// end of outer loop

        // if you make it to the end of both loops without short circuiting, false. Conditions were not met.
        return false;
    }

    public Boolean randomPredicateInLessTime(Integer[] array, Integer maxValueDiff, Integer maxIndexDiff){
        // Ok, so maybe group the array by
        return false;

    }

}
