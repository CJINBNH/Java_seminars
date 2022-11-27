package ru.gb;

/**
 * Дан массив двоичных чисел, [1,1,0,1,1,1], вывести максимальное количество
 * идущих подряд 1.
 */
// public class App 
// {
//     public static void main(String[] args) {
//         int count = 0;
//         int maxLen = 0;
//         int[] numbers = {1,1,1,1,0,1,1,1,1,1,0,1,1};
//         for (int num : numbers) {
//             if (num == 1){
//                 count++;
//                 if (maxLen < count) {
//                     maxLen = count;
//                 }
//             } else {
//                 count = 0;
//             }
//         }
//         System.out.format ("Максимальное количество 1 подряд = %d\n", maxLen);
//     }
// }


/**
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, заданные данному, нужно перенести эти элементы в конец
 * массива.
 * Таким образом, первые несколько (или все) элементов массива должны
 * быть отличны от заданного, а остальные - равны ему.
 */
public class App 
{
    public static void main(String[] args) {
        int c = 0;
        int[] nums = {1, 4, 3, 3, 5, 6, 3, 3, 7, 3, 3, 8};
        int find = 3;
        for (int i = nums.length - 1; i >= (nums.length - 2)/2; i--){
            if (nums[i] != find) {
                for (int j = 0; j < i; j++){
                    if (nums[j] == find) {
                        c = nums[j];
                        nums[j] = nums[i];
                        nums[i] = c;
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
        for (int number: nums) {
            System.out.format ("%d ", number);
        }
        System.out.println();
        }
    }