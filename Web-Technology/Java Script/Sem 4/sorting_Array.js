arr = [50, 100, -50, 40, 90, 3, 0]

for (i = 0; i < arr.length-1; i++) {
    min_Index = i;
    for (j = i + 1; j < arr.length ; j++) {
        if (arr[min_Index] >= arr[j]) {
            min_Index = j;
        }
    }
    if (min_Index != i) {
        //swap arr[i] and arr[min_Index]
        temp = arr[i];
        arr[i] = arr[min_Index];
        arr[min_Index] = temp;
    }
}

console.log(arr);