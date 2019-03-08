x = int(input("Enter X: "))
y = int(input("Enter Y: "))
k = int(input("Enter coefficient of k: "))


def Pell():
    o = 0
    p = 0
    u = 0
    ##k not a perfect square
    if x == 1 or k == 0:
        print("no such thing")
        return False
    o = x * x
    u = y * y
    p = k * u
    if o - p == 1 or p - o == 1:
        return "Solution: ("+str(x)+","+str(y)+")"
    else:
        return "Not a solution"


print(Pell())

