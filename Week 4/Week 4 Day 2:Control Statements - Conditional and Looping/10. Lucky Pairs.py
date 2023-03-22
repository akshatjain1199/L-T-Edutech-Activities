

if __name__=="__main__":
    A, B, N= map(int, input().split())
    for i in range(N):
        if i%2==0:
            A=A*2
        else:
            B=B*2
    print(A+B)
