import java.util.Arrays;

public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {   	
    	int[] emptyArray = new int[n];

        return emptyArray;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {   	
    	String[] emptyArray = new String[n];

        return emptyArray;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {   	
    	int[] resultArray = {a, b, c};
    	
        return resultArray;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return an int array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
    	String[] resultArray = {a, b, c};
    	
        return resultArray;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {
    	int size = array.length;

        return size;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {
    	int first = array[0];
    	
        return first;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {
    	int last = array[array.length -1];
    	
        return last;
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {
    	int value = array[position];
    	
        return value;
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
    	array[position] = value;

        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
    	int sum = 0;
    	for(int number : array) {
    		sum += number;
    	}
        return sum;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
    	boolean isInside = false;
    	for(int number : array) {
    		if(number == search) {
    			isInside = true;
    		}
    	}
        return isInside;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {

    	for(int index = 0; index < array.length; index ++) {
    		array[index] = String.valueOf(array[index].charAt(0)).toUpperCase() + array[index].substring(1);
    	}

        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
    	
        return Arrays.equals(first, second);
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
    	int[] array2 = new int[array.length];
    	int indexArray2 = 0;

    	for(int index = array.length - 1; index >= 0; index --) {
    		array2[indexArray2] = array[index];
    		indexArray2 ++;
    	}

        return array2;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
    	int[] result = Arrays.copyOf(first, first.length + second.length);    	
    	int indexResult = first.length;
    	
    	for(int number : second) {
    		result[indexResult] = number;
    		indexResult ++;
    	}

        return result;
    }
}
