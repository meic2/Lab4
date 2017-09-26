/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * this class use for practice; search for the longest common substring .
 */
public class ReclamationProject {
/**
 * @param a compare with b and find the largest common substring
 * @param b compare with a and find the largest common substring
 * @return longest common substring
 */
    public static String longstCoommonSubstri(final String a, final String b) {
        String longStr = b;
        // Shortstr is the shorter one compared the other string;
        String shortStr = a;
        // Longstr is the longer one compared the other string
        if (a.length() > b.length()) {
            longStr = a;
            shortStr = b;
        }
        String r = " ";
        // loop
        for (int i = 0; i < longStr.length(); i++) {
            for (int j = longStr.length() - i; j > 0; j--) {
                for (int k = 0; k < shortStr.length() - j; k++) {

                    if (longStr.regionMatches(i, shortStr, k, j)
                            && j > r.length()) {
                        r = longStr.substring(i, i + j);

                    // Do it!
                        }
                 }
        }

        }
        return r;
    }
}
