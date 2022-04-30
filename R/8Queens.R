index <- function(arr, search) {
  for (x in seq(length(arr))) {
    #print(arr)
    if (arr[x] == search) {
      return(x)
    }
  }
  return(-1)
}

confilict <- function(stack, point) {
  x <- FALSE
  for (Lpoint in stack) {
    if (match(Lpoint, stack) == point[[1]] | Lpoint == point[[2]]) {
      x <- TRUE
    }
  }
  yint <- (-1 * point[[1]]) + point[[2]]
  index <- 0
  for (i in c(0:8)) {
    indexj <- index(stack, i + yint)
    if (indexj != -1) {
        if (i != point[[1]] && i == indexj) {
          x <- TRUE
          break
        }
    }
  }
  yint <- point[[1]] + point[[2]]
  for (i in c(0:8)) {
    indexj <- index(stack, -i + yint)
    if (indexj != -1) {
      if (i != point[[1]] && i == indexj) {
        x <- TRUE
        break
      }
    }
  }
  return(x)
}
nqueens <- function(arr, n, count = 1) {
  point <- list(count, 0)
  if (count == n) {
    while (confilict(arr, point)) {
      point[[2]] <- point[[2]] + 1
    }
    if (point[[2]] >= 8) {
      return(list(FALSE, arr))
    }
    else {
      arr <- append(arr, point[[2]])
      return(list(TRUE, arr))
    }
  }
  else{
    if (count != 1) {
      while (confilict(arr, point)) {
        point[[2]] <- point[[2]] + 1
      }
    }
    if (point[[2]] < 8) {
      arr <- append(arr, point[[2]])
      recurse <- nqueens(arr, n, count + 1)
      arr <- recurse[[2]]
      while (!(recurse[[1]])) {
        arr <- arr[- (length(arr))]
        point[[2]] <- point[[2]] + 1
        while (confilict(arr, point)) {
          point[[2]] <- point[[2]] + 1
        }
        if (point[[2]] >= 8) {
          return(list(FALSE, arr))
        }
        else{
          arr <- append(arr, point[[2]])
        }
        recurse <- nqueens(arr, n, count + 1)
        arr <- recurse[[2]]
      }
      return(list(TRUE, arr))
    }
    else{
      return(list(FALSE, arr))
    }
  }
}


start <- c()
ans <- nqueens(start, 8)

# print(length(ans))
# print(length(0:6))
plot(0:7, ans[[2]], pch = 15, cex = 4, xlab = "colums", ylab = "rows")
grid(NULL, NULL, lwd = 1, lty = 1)