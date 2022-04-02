def reports(xs):
  ans = ""
  name = []
  sum = 0 
  total = 0
  count = 0
  for i in xs:
    if(type(i) == str):
      name.append(i)
      count += 1
    else:
      if(len(name) > 2):
        ans += name[0] + " "
        ans += name[1] + ", "
      else:
        ans += name[0] + ", "
      sum += i
      total += 1
      count = 0
      name = []
  return ans + "averaged " + str(sum/total)

print(reports(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72]))
