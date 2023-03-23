if __name__=="__main__":
    N=int(input())
    seqence= list(map(int, input().split()))
    N1=int(input())
    favseqence= list(map(int, input().split()))
    for i in range(N-N1+1):
        if(seqence[i:i+N1]== favseqence):
            print("Yes")
            break
    else:
        print("No")
        
