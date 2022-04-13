arr <- c(21, 30, 43, 55, 60, 65, 73, 87)

bin <- function(arr, start, end, search) {
  if (start > end) {
    return(-1)
  }
  mid <- (start + end) %/% 2

  if (arr[mid] < search) {
    return(bin(arr, mid + 1, end, search))
  }else if (arr[mid] > search) {
    return(bin(arr, start, mid - 1, search))
  }else {
     return(mid)
  }

}

print(bin(arr, 0, length(arr), 65))