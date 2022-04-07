infile = open('infile.txt', 'r')
outfile = open('outfile.txt', 'a')

indata =[]

for i in infile:
  indata.append(i)
  
indata = [i for i in indata if i != "\n"]
#print(indata)
for i in indata:
  outfile.write(str(i))