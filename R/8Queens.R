index <- function(arr, search) {
  for (x in seq_len(arr)) {
    if (arr[x] == search) {
      return(x)
    }
  }
  return(-1)
}

confilict <- function(stack, point) {
  x <- FALSE
  for (Lpoint in stack) {
    if (stack.index(Lpoint) == point[0] | Lpoint == point[1]) {
      x <- TRUE
    }
  }
  yint <- -point[1] + point[2]
  index <- 0
  for (i in c(0:8)) {
    index <- index(stack, i + yint)
    if (index != -1) {
        if (i != point[0] && i == index) {
          x <- TRUE
          break
        }
    }
  }
  yint <- point[1] + point[2]
  for (i in range(0, 8)) {
    index <- index(stack, -i + yint)
    if (index != -1) {
      if (i != point[0] && i == index) {
        x <- TRUE
        break
      }
    }
  }
  return(x)
}
nqueens <- function(arr, n, count = 1) {
  point <- c(count, 0)
  if (count == n - 1) {
    while (confilict(arr, point)) {
      point[2] <- point + 1
    }
    if (point[1] >= 8) {
      return(FALSE)
    }
    else {
      append(arr, point[2])
      return(TRUE)
    }
  }
  else{
    if (count != 0) {
      while (confilict(arr, point)) {
        point[2] <- point + 1
      }
    }
    if (point[1] < 8) {
      append(arr, point[2])
      while (not(nQueens(arr, n, count + 1))) {
        arr <- arr[-length(arr) - 1]
        point[2] <- point + 1
        while (confilict(arr, point)) {
          point[2] <- point + 1
        }
        if (point[2] >= 8) {
          return(FALSE)
        }
        else{
          append(arr, point[2])
        }
      }
      return(TRUE)
    }
    else{
      return(FALSE)
    }
  }
}
      
ans <- c()
nqueens(ans, 8)
print(ans)

seq_len(arr)