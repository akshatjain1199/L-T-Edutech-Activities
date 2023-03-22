n = int(input())
n1 = int(input())
n2 = int(input())
n3 = int(input())
s1 = abs(n - n1)
s2 = abs(n - n2)
s3 = abs(n - n3)

if n1 < n2 < n3:
    if s1 < s2 and s1 < s3:
        print(n1)
    elif s2 < s1 and s2 < s3:
        print(n2)
    elif s3 < s1 and s3 < s2:
        print(n3)
    elif s1 == s2:
        if n < n1:
            print(n1)
        else:
            print(n2)
    elif s2 == s3:
        if n < n2:
            print(n2)
        else:
            print(n3)
    elif s3 == s1:
        if n < n3:
            print(n3)
        else:
            print(n1)
