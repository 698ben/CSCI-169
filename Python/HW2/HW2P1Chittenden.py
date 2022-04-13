def confilict(stack, point):
  x = False
  for Lpoint in stack:
    if(stack.index(Lpoint) == point[0] or Lpoint == point[1] #or (stack[stack.index(Lpoint) + 1][0] == point[0] and stack[stack.index(Lpoint) + 1][1] == point[1])
    ):
      x = True
  yInt = -point[0] + point[1]
  index = 0
  for i in range(0,8):
    try:
      index = stack.index(i + yInt)
    except:
        #do nothing
        l = 0 
    else:
        if(i != point[0] and i == index):
          x = True
          break
  yInt = point[0] + point[1]
  for i in range(0,8):
    #print( i, i + yInt)
    try:
      index = stack.index(-i + yInt)
    except:
      #do nothing
      l = 0
    else:
      if(i != point[0] and i == index):
        x = True
        break
  return x

def nQueens(arr, n, count = 0):
  point = [count,0]
  if(count == n - 1):
    while(confilict(arr, point)):
      point[1] += 1
    if(point[1] >= 8):
      return False
    else:
      arr.append(point[1])
      return True
  else:
    if(count != 0):
      while(confilict(arr, point)):
        point[1] += 1
    if(point[1] < 8):
      arr.append(point[1])
      while(not(nQueens(arr,n,count + 1))):
        arr.pop(len(arr) - 1)
        point[1] += 1
        while(confilict(arr, point)):
          point[1] += 1
        if(point[1] >= 8):
          return False
        else:
          arr.append(point[1])
      return True
    else:
      return False
      
ans =[]
nQueens(ans,8)
print(ans)