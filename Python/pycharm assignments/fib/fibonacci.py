N = int(input("Enter n-th number:"))


def fib_recursive(N):
    if N == 0:
        return 0
    elif N == 1:
        return 1
    else:
        return fib_recursive(N - 1) + fib_recursive(N - 2)


def fib_iterative(N):
    a, b = 0, 1
    for i in range(0, N):
        a, b = b, a + b
    return a


print(fib_recursive(N))
print(fib_iterative(N))

S = input("Enter your palindrome:")
X = 0;

def ispalindrome(S):
    if len(S) <= 1:
        return True
    if S[0] == S[-1]:
        return ispalindrome(S[1:-1])
    else:
        return False
    X += 1


print(ispalindrome(S))

base = int(input("input your base: "))
exp = int(input("input your exp: "))


def iter_power(base, exp):
    base1 = base
    for x in range(1, exp):
        base1 = base1 * base
        x += 1
    return base1


n = 0
base1 = base


def recur_power(base, base1, exp, n):
    n += 1
    base1 = base1 * base
    if n <= exp:
        recur_power(base, base1, exp, n)
    return base1


print(iter_power(base, exp))
print(recur_power(base, base1, exp, n))
