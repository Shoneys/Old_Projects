import math
fuq=0
N=int(input("Enter N: ")) # user input
s=int(math.sqrt(N)) #finds square root
print(s)
for z in range(2,s+1): #loops every potential factor until the square root of N
    if N%z==0: #checks to see if z divides in evenly to N, making it composite
        fuq+=1
if fuq>0:
    print(True)
    print(str(N)+" is composite")
else:
    print(False)
    print(str(N)+" is prime")
    