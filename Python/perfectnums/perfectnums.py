n = int(
    input("Enter your range of numbers; a list of perfect, deficient, and abundant numbers will be generated from it:"))


def factorgen(n):

    for i in range(1, int(n / 2 + 1)):
        if n % i == 0:
            list.append(i)
    return list


def perfectdeficientabundant():
    z = 0
    for i in range(len(factorlist)):
        z = z + factorlist[i]
    print(z)
    if z == n:
        print(str(n) + " is perfect")
    if z < n:
        print(str(n) + " is deficient")
    if z > n:
        print(str(n) + " is adbundant")


factorlist = factorgen(n)
print("factorlist:")
print(factorlist)

perfectdeficientabundant()
