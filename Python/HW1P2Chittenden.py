from jinja2 import Undefined


def reports(xs):
  ans = ""
  name = [Undefined,Undefined,Undefined]
  sum = 0 
  total = 0
  count = 0
  for i in xs:
    if(type(i) == str):
      name[count] = i
      count += 1
    else:
      if(type(name[1]) == str and type(name[2]) == str):
        ans += name[0] + " "
        ans += name[1] + ", "
      else:
        ans += name[0] + ", "
      sum += i
      total += 1
      count = 0
      name = [Undefined,Undefined,Undefined]
  return ans + "averaged " + str(sum/total)


print(reports(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72]))
