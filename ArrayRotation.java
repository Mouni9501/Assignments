public class ArrayRotation {
    public static void main(String args[]) {
        int inputArray[] = {2, 8, 3, 1, 23, 11};
        int k = 13;
        int arrayLength = inputArray.length;
        if (k > arrayLength) {
            k = k % arrayLength;
        }

        reverseArray(inputArray, 0, arrayLength - 1);
        reverseArray(inputArray, 0, k-1);
        reverseArray(inputArray,k , arrayLength - 1);
        for (int arr : inputArray)
            System.out.print(arr + " ");

    }
        static void reverseArray(int inputArr[],int startingIndex,int endingIndex)
        {
            while (startingIndex < endingIndex)
            {
                int temp = inputArr[startingIndex];
                inputArr[startingIndex] = inputArr[endingIndex];
                inputArr[endingIndex] = temp;
                startingIndex++;
                endingIndex--;
            }
        }
    }



