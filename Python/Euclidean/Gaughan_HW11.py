"""
Joseph Gaughan
11/2/18
Number Theory
HW11: Euclidean Algorithm

1.) This program finds the results of the euclidean algorithm performed between 2 numbers using recursion
2.)
    a.) GCD(1346269, 2178309)=1, 30 steps, the remainder is fibonacci sequence
    b.) GCD(1346269, 267914296)=1, 5 steps, remainders are (in order) 20th, 9th, and 2nd and 1st fib

"""


def euclid(numa, numb, i, r):
    num1gcd = gcdlistmaker(numa)  ## generates list of factors
    num2gcd = gcdlistmaker(numb)
    gcd = gcdcheck(num1gcd, num2gcd, numa, numb)  ##finds greatest common factor of 2 factor lists

    if i is not 0:  ##skips showing remainder during first initialization
        print("Remainder: " + str(r))
    print("GCD(" + str(numa) + ", " + str(numb) + ")" + " = " + str(gcd) + "\n")

    if r is 0:  ##if remainder is 0, program terminates
        print("It took " + str(i) + " recursions")
        return 0

    r = numa % numb  ##gets remainder of division
    numa = numb  ##sets numa equal to numb
    numb = r  ##sets numb b equal to remainder

    i = i + 1  ##keeps track of recursions

    euclid(numa, numb, i, r)


def gcdlistmaker(num):
    gcdlist = []  ##creates list
    for z in range(num, 0, -1):  ##creates factor list from largest to smallest
        if num % z == 0:  ##appends factor (if number divided by the iterator is 0) to list
            gcdlist.append(z)
    return gcdlist


def gcdcheck(num1gcd, num2gcd, numa, numb):
    print("Factor lists for " + str(numa) + " and " + str(numb) + ": ")
    print(num1gcd)
    print(num2gcd)
    for t in range(len(num1gcd)):
        for q in range(len(num2gcd)):
            if num1gcd[t] == num2gcd[q]:
                return num1gcd[t]


num1 = int(input("Enter your 1st num:"))
num2 = int(input("Enter your 2nd num:"))
print("\n")

c = 0  ##initializes i
d = 1  ##initializes r

if num2 > num1:  ##puts user input in proper order for Euclidean Algorithm
    num1tempvar = num1
    num1 = num2
    num2 = num1tempvar

euclid(num1, num2, c, d)
