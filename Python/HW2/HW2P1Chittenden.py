def nQueens():
  def confilict(stack, point):
    x = False
    for Lpoint in stack:
        if(Lpoint[0] == point[0] or Lpoint[1] == point[1] or (stack[stack.index(Lpoint) + 1][0] == point[0] and stack[stack.index(Lpoint) + 1][1] == point[1])):
          x = True
    return x
  ans = []
  test = [1,1]
  while len(ans) <= 8:
    if confilict(ans,test):
      test = ans[0]
      ans.pop()
      test = ans[0][1] + 1
    else:
      #not right
      ans.insert(0,test)
      test = [len(ans) + 1,1]

Ls = [1,2,3,4,6]

try:
  print(Ls.index(2))
except:
  print(-1)