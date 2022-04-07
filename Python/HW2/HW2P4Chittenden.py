Xs = [10,"hi",5,"kelp",6,"mark",7," world",5,"jack"]

print([x for x in Xs[1::3]  if type(x) == str])

print([str(x) for x in Xs if type(x) == int])