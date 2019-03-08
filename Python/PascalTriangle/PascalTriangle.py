length = []
l = [0, 1, 0]
n = int(input("Enter your nth term:"))
for z in range(n):
    p = [0]
    length.append(len(l))
    for i in range(len(l)):
        if i == len(l) - 1:
            p.append(0)
        else:
            p.append(l[i] + l[i + 1])


    for q in range(int(n - (len(l) / 2))):
        print(" ", end=" ")


    print(l[-len(l) + 1:len(l) - 1])
    l = p
