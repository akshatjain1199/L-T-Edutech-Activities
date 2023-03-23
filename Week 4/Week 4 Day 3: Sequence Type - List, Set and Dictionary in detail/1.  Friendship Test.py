if __name__=="__main__":
    n = int(input())
    days = list(map(int, input().split()))
    s= set()
    for i in days:
        s.add(i)
    print(len(s))
