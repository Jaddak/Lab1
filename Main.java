//IT-2660 - Lab 1
//Student Name: Jad Dakdouk

public class Main {
  public static void main(String[] args) {
    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
    
    System.out.println("The array in order is ");
    int index = 0;
    while (index < numbers.length) {
      System.out.print(numbers[index] + ", ");
      index++;
    }

    System.out.println("\nThe array in reverse is ");
    for (int R = numbers.length - 1; R >= 0; R--) {
       System.out.print(numbers[R] + ", ");
    }

    int firstValue = numbers[0];
    int lastValue = numbers[7];
    System.out.println("\nThe first value in the array is " +firstValue+ " and the last value is "+ lastValue);
    
    Lab1 lab = new Lab1();
    System.out.println("The number after 1 is " +lab.increment(1));
 
    int maxVal = lab.max(10, 14);
    System.out.println("The maximum value between 10 and 14 is "+ maxVal);

    int minVal = lab.min(318, 3);
    System.out.println("The minimum value between 318 and 3 is " +minVal);

    int totalSum = lab.sum(numbers);
    System.out.println("The sum of the array is " +totalSum);

    double totalAverage = lab.average(numbers);
    System.out.println("The average of the array is " + totalAverage);

    int totalMax = lab.maxArray(numbers);
    System.out.println("The maximum value in the array is " +totalMax);

    int totalMin = lab.minArray(numbers);
    System.out.println("The minimum value in the array is "+ totalMin);
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
 
  public int max(int a, int b){
  if (a >= b) {
  return a;
} else {
  return b; }
  }

  public int min(int a, int b) {
    if (a >= b) {
    return b;
    } else {
      return a;
    }
  }

  public int sum(int[] nums) {
    int Sum1 = 0; 
    for (int num : nums) {
      Sum1 += num;
    }
    return Sum1; 
  }

  public double average(int[] nums) {
    int sum2 = 0; 
    for (int num : nums) {
      sum2 += num;
    }
    return (double) sum2 / nums.length;
  }

  public int maxArray(int[] nums) {
    int maxValue = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxValue) {
        maxValue = nums[i];
      }
    }
    return maxValue;
  }

  public int minArray(int[] nums) {
    int minValue = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minValue) {
        minValue = nums[i];
      }
    }
    return minValue;
  }
}