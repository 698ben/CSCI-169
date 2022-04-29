# Python program for implementation of Selection
# Sort
import sys
import math
import random
def selction(arrn, n = 0):
  for i in range(len(arr)):
	
  # Find the minimum element in remaining
  # unsorted array
    min_idx = i
    for j in range(i+1, len(arr)):
      n += 1
      if arr[min_idx] > arr[j]:
        min_idx = j
	
  # Swap the found minimum element with
  # the first element		
    arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Python program for implementation of Shell Sort

def shellSort(arr,n = 0):

	# Start with a big gap, then reduce the gap
  n = len(arr)	
  gap = (int)(n/2)

	# Do a gapped insertion sort for this gap size.
	# The first gap elements a[0..gap-1] are already in gapped
	# order keep adding one more element until the entire array
	# is gap sorted
  while gap > 0:

    for i in range(gap,n):
      temp = arr[i]

			# shift earlier gap-sorted elements up until the correct
			# location for a[i] is found
      j = i
      while j >= gap and arr[j-gap] >temp:
        n+= 1
        arr[j] = arr[j-gap]
        j -= gap

			# put temp (the original a[i]) in its correct location
      arr[j] = temp
    gap = (int)(gap / 2)

# Python program for implementation of Insertion Sort

# Function to do insertion sort
def insertionSort(arr,n = 0):

	# Traverse through 1 to len(arr)
  for i in range(1, len(arr)):

    key = arr[i]

		# Move elements of arr[0..i-1], that are
		# greater than key, to one position ahead
		# of their current position
    j = i-1
    while j >=0 and key < arr[j] :
      n += 1
      arr[j+1] = arr[j]
      j -= 1
    arr[j+1] = key

# Python program for implementation of Bubble Sort

def bubbleSort(arr,n = 0):
  n = len(arr)

	# Traverse through all array elements
  for i in range(n-1):
	#range(n) also work but outer loop will
	# repeat one time more than needed.

		# Last i elements are already in place
    for j in range(0, n-i-1):

			# traverse the array from 0 to n-i-1
			# Swap if the element found is greater
			# than the next element
      n += 1
      if arr[j] > arr[j + 1] :
        arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Driver code to test above
arr = []
run = [0,0,0,0]
for n in range(2,6):
  size = (int)(math.pow(10,n))
  for k in range(0,100):
    arr = []
    for j in range(0, size):
      arr.append(random.randrange(1,1000000000) )
    arr1 = arr.copy()
    shellSort(arr1,run[0])
    print("shell")
    print(run[0])
    arr2 = arr.copy()
    insertionSort(arr2,run[1])
    print("insert")
    print(run[1])
    arr3 = arr.copy()
    selction(arr3,run[2])
    print("select")
    print(run[2])
    arr4 = arr.copy()
    bubbleSort(arr4,run[3])
    print("bubble")
    print(run[3])