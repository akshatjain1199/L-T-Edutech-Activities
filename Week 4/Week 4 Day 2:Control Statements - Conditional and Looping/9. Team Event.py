if __name__ == "__main__":
    N = int(input())
    last = N % 10
    first = 0
    if N < 10:
        print("Invalid Input")
    else:
        while N >= 10:
            first = int(N / 10)
            N = int(N / 10)
        print(abs(first - last))
