if __name__ == "__main__":
    n = int(input())

    even_count = 0
    odd_count = 0

    lst=list(map(int,input().split()))
    for i in  lst:
        if i % 2 == 0:
            even_count += 1
        else:
            odd_count += 1

    print(even_count, odd_count)
